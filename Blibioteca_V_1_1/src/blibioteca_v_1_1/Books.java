/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blibioteca_v_1_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author bruxo
 */
public class Books {

    // Variaveis de Diretrio
    public static String book_directory_unavailable = "src/blibioteca_v_1_1/data_files/books_unavailable.json";
    public static String book_directory_available = "src/blibioteca_v_1_1/data_files/books_available.json";

    // variaveis dos dados do livro
    private String title; // Titlo
    private String autor; // Autor
    private String genre; // Genero
    private String publishing_company; // editora de publicção
    private String date_publishing; // data publicaçao
    private String isbn; // numero de isbn

    public static void CheckJsons() { // verifica se todos arqquivos de livros estao disponivie se nao cria-os
        File file_books_av = new File(book_directory_available);
        if (file_books_av.exists()) {// Verificar se o arquivo existe
            System.out.println("O arquivo " + book_directory_available + " existe!!!");
        } else {
            WriteJsonClearAvailable();
        } // se nao cham funçao pra cria-lo
        File file_books_un = new File(book_directory_unavailable);
        if (file_books_un.exists()) {// Verificar se o arquivo de livros indisponiveis existe existe
            System.out.println("O arquivo " + book_directory_available + " existe!!!");
        } else {
            WriteJsonClearUnavailable();
        } // se nao cham funçao pra cria-lo

    }

    public static void WriteJsonClear(String availability) { // Cria Arquivo de armazenar livros disponiveis Com zero livros

        FileWriter Write_File = null;
        JSONObject Content_json = new JSONObject();

        Content_json.put("Numero de Livros", 0);

        try {
            Write_File = new FileWriter(availability);
            Write_File.write(Content_json.toJSONString());
            Write_File.close();
            System.out.println("Arquivo JSON Livros Disponiveis criado com sucesso!");
        } catch (IOException ex) {
            Logger.getLogger(Blibioteca_V_1_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(Content_json);
    }

    public static JSONObject ReadJsonBooks(String availability) {

        JSONObject Content_json;
        JSONParser parser = new JSONParser();

        try {
            Content_json = (JSONObject) parser.parse(new FileReader(availability));

            //System.out.println(Content_json);// Printa o conteudo do json de livros diponiveis
            return Content_json; //retorna variavel com conteudo do json de livros diponiveis
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null; //retorna null caso de algu erro

    }

    public static void AddBook(String title, String author,
            String genre, String publishingCompany, String datePublishing, String isbn, String availability) {

        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader(availability)) {
            // Ler o arquivo JSON existente

            JSONObject json = (JSONObject) parser.parse(reader);

            //Implementar quando o livro ja existir ele adicone quatidade +1 ussar title e autor para verificar se livro e igual
            // Verifica se o título desejado está presente no JSON
            for (Object key : json.keySet()) {
                Object value = json.get(key);

                if (value instanceof JSONObject) {
                    JSONObject livro = (JSONObject) value;

                    if (livro.get("title").equals(title)) { // procura o titulo do livro que vai ser escrito
                        System.out.println("livro encontrado");

                        // Atualizar a quantidade do livro existente
                        long quantity = (long) livro.get("quantity");
                        livro.put("quantity", quantity + 1);

                        // Atualizar o número total de livros
                        long numeroLivros = (long) json.get("Numero de Livros");
                        json.put("Numero de Livros", numeroLivros + 1);
                        try ( // Escrever de volta no arquivo
                                FileWriter writer = new FileWriter(availability)) {
                            writer.write(json.toJSONString());
                        }
                        return; // Se encontrou o livro, não precisa continuar procurando

                    }

                }

            }
            System.out.println("Livro Nao encontrado");
            // Criar um novo livro

            JSONObject novoLivro = new JSONObject();
            novoLivro.put("title", title);
            novoLivro.put("author", author);
            novoLivro.put("genre", genre);
            novoLivro.put("publishing_company", publishingCompany);
            novoLivro.put("date_publishing", datePublishing);
            novoLivro.put("isbn", isbn);
            novoLivro.put("quantity", 1);

            long numeroLivros = (long) json.get("Numero de Livros");
            json.put(numeroLivros + 1, novoLivro);
            json.put("Numero de Livros", numeroLivros + 1);

            try ( // Escrever de volta no arquivo
                    FileWriter writer = new FileWriter(availability)) {
                writer.write(json.toJSONString());
            }

            System.out.println("Livro criado com sucesso!");
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    public static void RemvBook(String title, String availability) {
        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader(availability)) {
            // Ler o arquivo JSON existente

            JSONObject json = (JSONObject) parser.parse(reader);
            List<Object> keysToRemove = new ArrayList<>();
            // Verifica se o título desejado está presente no JSON
            boolean livroEncontrado = false;
            for (Object key : json.keySet()) {
                Object value = json.get(key);

                if (value instanceof JSONObject) {
                    JSONObject livro = (JSONObject) value;

                    if (livro.get("title").equals(title)) { // procura o titulo do livro que vai ser removido
                        System.out.println("Livro encontrado");

                        long quantity = (long) livro.get("quantity");// coleta quantidade de livros com este titulo tem

                        if (quantity == 1) {// se qauntidade for apena 1 remove livro
                            // Remover o livro do JSON existente
                            keysToRemove.add(key);
                            System.out.println("Removido o livro");
                        } else {
                            System.out.println("Removido um livro");
                            livro.put("quantity", quantity - 1); // subtrai numeor de livros na pilha

                        }

                        livroEncontrado = true; // econtrar livro deixa verdadeiro
                        break;
                    }

                }

            }
            if (!livroEncontrado) { // se livro nao foi encontrado avisa que livro no foi encontrado n subtrai nada
                System.out.println("Livro não encontrado. Nada foi removido.");
                return;
            }
            // Remover os livros encontrados 
            for (Object key : keysToRemove) {
                json.remove(key);
            }

            // subtrai numero de livros 
            long numeroLivros = (long) json.get("Numero de Livros");
            json.put("Numero de Livros", numeroLivros - 1);

            try (FileWriter writer = new FileWriter(availability)) {
                writer.write(json.toJSONString());// Escrever de volta no arquivo
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    public Books(String title, String autor, String genre, String publishing_company, String date_publishing, String isbn) {
        this.title = title;
        this.autor = autor;
        this.genre = genre;
        this.publishing_company = publishing_company;
        this.date_publishing = date_publishing;
        this.isbn = isbn;
        CheckJsons();
        AddBook(title,autor,genre,publishing_company,date_publishing,isbn,book_directory_available);
                
    }

    
    
    
}
