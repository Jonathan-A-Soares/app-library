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
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author bruxo
 */
public class Books {

    // Variaveis de Diretrio
    public final static String book_directory_unavailable = "src/blibioteca_v_1_1/data_files/books_unavailable.json";
    public final static String book_directory_available = "src/blibioteca_v_1_1/data_files/books_available.json";

    // variaveis dos dados do livro
    private String title; // Titlo
    private String autor; // Autor
    private String genre; // Genero
    private String publishing_company; // editora de publicção
    private String date_publishing; // data publicaçao
    private String isbn; // numero de isbn

    public static String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public static String getDateTimeLend() {

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, 10);
        Date dataGiveback = calendar.getTime();

        return dateFormat.format(dataGiveback);
    }

    public static String CheckJsons() { // verifica se todos arqquivos de livros estao disponivie se nao cria-os
        File file_books_av = new File(book_directory_available);
        if (file_books_av.exists()) {// Verificar se o arquivo existe
            //System.out.println("\u001B[33m" + "O arquivo " + book_directory_available + " existe!!!");
            return "poo_20";
        } else {
            WriteJsonClear(book_directory_available);
        } // se nao cham funçao pra cria-lo
        File file_books_un = new File(book_directory_unavailable);
        if (file_books_un.exists()) {// Verificar se o arquivo de livros indisponiveis existe existe
            //System.out.println("\u001B[33m" + "O arquivo " + book_directory_unavailable + " existe!!!");
            return "poo_21";
        } else {
            WriteJsonClear(book_directory_unavailable);
        } // se nao cham funçao pra cria-lo
        return "poo_13";

    }

    public static String WriteJsonClear(String availability) { // Cria Arquivo de armazenar livros disponiveis Com zero livros

        FileWriter Write_File = null;
        JSONObject Content_json = new JSONObject();

        Content_json.put("Numero de Livros", 0);

        try {
            Write_File = new FileWriter(availability);
            Write_File.write(Content_json.toJSONString());
            Write_File.close();
            //System.out.println("Arquivo " + availability + "criado com sucesso!");

            AddBook("A Dança dos Dragões", "George R. R. Martin", "Fantasia", "Bantam Books", "2011-07-12", "9780553801477", book_directory_available);
            AddBook("A Culpa é das Estrelas", "John Green", "Romance", "Dutton Books", "2012-01-10", "9780525478812", book_directory_available);
            AddBook("Pai Rico, Pai Pobre", "Robert T. Kiyosaki", "Educação Financeira", "Plata Publishing", "1997-04-01", "9781612680194", book_directory_available);
            AddBook("O Senhor dos Anéis: A Sociedade do Anel", "J. R. R. Tolkien", "Fantasia", "Allen & Unwin", "1954-07-29", "9780261102385", book_directory_available);
            AddBook("1984", "George Orwell", "Ficção Distópica", "Secker & Warburg", "1949-06-08", "9780451524935", book_directory_available);

            return "poo_19";
        } catch (IOException ex) {
            Logger.getLogger(Blibioteca_V_1_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(Content_json);
        return "poo_13";
    }

    public static JSONObject ReadJsonBooks(int availability) {

        JSONObject Content_json;
        JSONParser parser = new JSONParser();

        if (availability == 0) {

            try {
                Content_json = (JSONObject) parser.parse(new FileReader(book_directory_available));

                //System.out.println(Content_json);// Printa o conteudo do json de livros diponiveis
                return Content_json; //retorna variavel com conteudo do json de livros diponiveis
            } catch (ParseException e) {
                e.printStackTrace();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            try {
                Content_json = (JSONObject) parser.parse(new FileReader(book_directory_unavailable));

                //System.out.println(Content_json);// Printa o conteudo do json de livros diponiveis
                return Content_json; //retorna variavel com conteudo do json de livros diponiveis
            } catch (ParseException e) {
                e.printStackTrace();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        return null; //retorna null caso de algu erro

    }

    public static String AddBook(String title, String author,
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
                        //System.out.println("livro encontrado");

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
                        return "poo_18"; // Se encontrou o livro, não precisa continuar procurando

                    }

                }

            }
            //System.out.println("Livro Nao encontrado");
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

            //System.out.println("Livro criado com sucesso!");
            return "poo_18";
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return "poo_13";
    }

    public static String RemvBook(String title, String availability) {
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
                        //System.out.println("Livro encontrado");

                        long quantity = (long) livro.get("quantity");// coleta quantidade de livros com este titulo tem

                        if (quantity == 1) {// se qauntidade for apena 1 remove livro
                            // Remover o livro do JSON existente
                            keysToRemove.add(key);
                            //System.out.println("Removido o livro");
                        } else {
                            //System.out.println("Removido um livro");
                            livro.put("quantity", quantity - 1); // subtrai numeor de livros na pilha

                        }

                        livroEncontrado = true; // econtrar livro deixa verdadeiro
                        break;
                    }

                }

            }
            if (!livroEncontrado) { // se livro nao foi encontrado avisa que livro no foi encontrado n subtrai nada
                //System.out.println("Livro não encontrado. Nada foi removido.");
                return "poo_14";
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
            return "poo_17";

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return "poo_13";
    }

    public static String LendBook(String title, String name) { //Empresta o livro para um usuario

        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader(book_directory_available)) {
            // Ler o arquivo jsno existente

            JSONObject json = (JSONObject) parser.parse(reader);
            List<Object> keysToRemove = new ArrayList<>();
            // Verifica se o título desejado está presente no JSON
            boolean livroEncontrado = false;
            for (Object key : json.keySet()) {
                Object value = json.get(key);

                if (value instanceof JSONObject) {
                    JSONObject livro = (JSONObject) value;

                    if (livro.get("title").equals(title)) { // procura o titulo do livro que vai ser removido
                        //System.out.println("Livro encontrado");

                        long quantity = (long) livro.get("quantity");// coleta quantidade de livros com este titulo tem
                        //coleta todos dados do livro
                        String genre = (String) livro.get("genre");
                        String isbn = (String) livro.get("isbn");
                        String publishing_company = (String) livro.get("publishing_company");
                        String author = (String) livro.get("author");
                        String date_publishing = (String) livro.get("date_publishing");

                        //AddBook(title, author, genre, publishing_company, date_publishing, isbn, book_directory_unavailable);
                        JSONParser pars = new JSONParser();

                        try (FileReader read = new FileReader(book_directory_unavailable)) {
                            // Ler o arquivo JSON existente

                            JSONObject jsonun = (JSONObject) pars.parse(read);

                            // cria  livro emprestado na lista de n disponiveis
                            JSONObject lendBook = new JSONObject();
                            lendBook.put("title", title);
                            lendBook.put("author", author);
                            lendBook.put("genre", genre);
                            lendBook.put("publishing_company", publishing_company);
                            lendBook.put("date_publishing", date_publishing);
                            lendBook.put("isbn", isbn);
                            lendBook.put("gripped", name); //guarda nome do usurio que pegou livro
                            lendBook.put("quantity", 1);

                            //coleta armazena data que foi feito emprestimo
                            try {
                                String date = getDateTime();
                                lendBook.put("date_land", date);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }

                            //previsao de devoluçao
                            try {
                                String date = getDateTimeLend();
                                lendBook.put("date_give_back", date);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            //Atualiza quantidade dee livros
                            long numeroLivros = (long) jsonun.get("Numero de Livros");
                            jsonun.put(numeroLivros + 1, lendBook);
                            jsonun.put("Numero de Livros", numeroLivros + 1);

                            try ( // Escrever de volta no arquivo
                                    FileWriter writer = new FileWriter(book_directory_unavailable)) {
                                writer.write(jsonun.toJSONString());
                            }
                            Users.AddTitleUser(name, title);
                            System.out.println("Livro Emprestado para" + name + " com sucesso! ");

                        } catch (IOException | ParseException e) {
                            e.printStackTrace();
                        }

                        //fim adição de livro
                        //System.out.println(genre + isbn + "  " + publishing_company + "  " + author + "  " + date_publishing + "  " + title);
                        if (quantity == 1) {// se qauntidade for apena 1 remove livro
                            // Remover o livro do JSON existente
                            keysToRemove.add(key);
                            //System.out.println("Removido o livro");
                        } else {
                            //System.out.println("Removido um livro da lista de disponiveis");
                            livro.put("quantity", quantity - 1); // subtrai numeor de livros na pilha

                        }

                        livroEncontrado = true; // econtrar livro deixa verdadeiro
                        break;
                    }

                }

            }
            if (!livroEncontrado) { // se livro nao foi encontrado nao tem como emprestar
                System.out.println("Livro nao encontrado. livro nao emprestado.");
                return "poo_14";
            }

            // Remover os livro da lista de disponiveis 
            for (Object key : keysToRemove) {
                json.remove(key);
            }

            // subtrai numero de livros disponiveis
            long numeroLivros = (long) json.get("Numero de Livros");
            json.put("Numero de Livros", numeroLivros - 1);

            // Escrever de volta no arquivo
            try (FileWriter writer = new FileWriter(book_directory_available)) {
                writer.write(json.toJSONString());
            }
            return "poo_16"; // livro empretado com sucesso
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return "poo_13";

    }

    public static String GiveBackBook(String title, String name) { // devolve livro para blibioteca

        // verificar se titulo esta emprestado para usuario 
        // se sim ele adciona livro na lista de livros disponiveis 
        //remove ele da lista de indisponiveis
        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader(book_directory_unavailable)) {
            // Ler o arquivo jsno existente

            JSONObject json = (JSONObject) parser.parse(reader);
            List<Object> keysToRemove = new ArrayList<>();
            // Verifica se o título desejado está presente no JSON
            boolean livroEncontrado = false;
            for (Object key : json.keySet()) {
                Object value = json.get(key);

                if (value instanceof JSONObject) {
                    JSONObject livro = (JSONObject) value;

                    if (livro.get("title").equals(title) && livro.get("gripped").equals(name)) { // procura o titulo pertence ao usuario no momento
                        //System.out.println("Livro encontrado" + " livro foi emprestado para" + name);

                        RemvBook(title, book_directory_unavailable);

                        //coleta todos dados do livro
                        String genre = (String) livro.get("genre");
                        String isbn = (String) livro.get("isbn");
                        String publishing_company = (String) livro.get("publishing_company");
                        String author = (String) livro.get("author");
                        String date_publishing = (String) livro.get("date_publishing");

                        AddBook(title, author, genre, publishing_company, date_publishing, isbn, book_directory_available);

                        livroEncontrado = true; // econtrar livro deixa verdadeiro
                        break;
                    }

                }

            }
            if (!livroEncontrado) { // se livro nao foi encontrado avisa que livro no foi encontrado n subtrai nada
                //System.out.println("Livro não foi emprestado para" + name);
                return "poo_14";
            } else {//else livro foi emprestado entao foi devolvido
                return "poo_15";
            }

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return "poo_13";

    }

    public Books(String title, String autor, String genre, String publishing_company, String date_publishing, String isbn) {
        this.title = title;
        this.autor = autor;
        this.genre = genre;
        this.publishing_company = publishing_company;
        this.date_publishing = date_publishing;
        this.isbn = isbn;
        CheckJsons();
        AddBook(title, autor, genre, publishing_company, date_publishing, isbn, book_directory_available);

    }

    public static void verErr(String retun_in) {

        switch (retun_in) {
            case "poo_14":
                System.out.println("\u001B[33m" + "poo_14: Livro nao encontrado..");
                break;
            case "poo_15":
                System.out.println("\u001B[31m" + "poo_15: Livro foi devolvido.");
                break;
            case "poo_16":
                System.out.println("\u001B[32m" + "poo_16: livro emprestado com sucesso.");
                break;
            case "poo_17":
                System.out.println("\u001B[32m" + "poo_17: Livro removido com sucesso blibioteca.");
                break;
            case "poo_18":
                System.out.println("\u001B[31m" + "poo_18: Livro adicionado a blibioteca.");
                break;
            case "poo_19":
                System.out.println("\u001B[32m" + "poo_19: Arquivo JSON de livros criado com sucesso.");
                break;
            case "poo_20":
                System.out.println("\u001B[31m" + "poo_20: Arquivo JSON de livros disponiveis existe.");
                break;
            case "poo_21":
                System.out.println("\u001B[32m" + "poo_21: Arquivo JSON de livros indisponiveis existe..");
                break;

            default:
                System.out.println("\u001B[31m" + "Código de erro não reconhecido.");
        }
    }

}
