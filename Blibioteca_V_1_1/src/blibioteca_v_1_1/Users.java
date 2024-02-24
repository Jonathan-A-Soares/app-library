/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blibioteca_v_1_1;

import static blibioteca_v_1_1.Books.book_directory_available;
import static blibioteca_v_1_1.Books.book_directory_unavailable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.PasswordView;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import javax.crypto.Cipher;
import java.util.Base64;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author bruxo
 */
public class Users {

    // Variaveis de Diretrio
    public static String user_directory = "src/blibioteca_v_1_1/data_files/users.json";

    private String name;
    private String phone_number;
    private String identification;
    private String password;
    private boolean permission;
    //criptografia para senha
    private static final String chaveSecreta = "Poo20232Jas00013";

    public Users(String name, String phone_number, String identification, String password, boolean permission) {
        this.name = name;
        this.phone_number = phone_number;
        this.identification = identification;
        this.password = password;
        this.permission = permission;

        Users.CheckJsons();//verifica se os arquivos estao disponiveis
        Users.AddUser(name, phone_number, identification, password, permission);// cria usuario guarda no arquivo

    }

    public static void CheckJsons() { // verifica se arquivs de usuarios esta disponiviel se nao cria-os
        File file_books_av = new File(user_directory);
        if (file_books_av.exists()) {// Verificar se o arquivo existe
            System.out.println("O arquivo " + user_directory + " existe!!!");
        } else {// se nao, cria-o
            WriteJsonClear();
        }

    }

    public static void WriteJsonClear() { // Cria usuario de armazenar logins de usuarios disponiveis

        FileWriter Write_File = null;
        JSONObject Content_json = new JSONObject();

        Content_json.put("Numero de Usuarios", 0);

        try {
            Write_File = new FileWriter(user_directory);
            Write_File.write(Content_json.toJSONString());
            Write_File.close();
            System.out.println("Arquivo JSON User criado com sucesso!");
        } catch (IOException ex) {
            Logger.getLogger(Blibioteca_V_1_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(Content_json);
    }

    public static JSONObject ReadJsonBooks() {

        JSONObject Content_json;
        JSONParser parser = new JSONParser();

        try {
            Content_json = (JSONObject) parser.parse(new FileReader(user_directory));

            // System.out.println(Content_json);// Printa o conteudo do json de livros
            // diponiveis
            return Content_json; // retorna variavel com conteudo do json de livros diponiveis
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null; // retorna null caso de algu erro

    }

    public static void AddUser(String name, String phone_number, String identification, String password,
            boolean permission) {

        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader(user_directory)) {
            // Ler o arquivo JSON existente

            JSONObject json = (JSONObject) parser.parse(reader);

            // Verifica se o usuario usuario ja existe e está presente no JSON
            for (Object key : json.keySet()) {
                Object value = json.get(key);

                if (value instanceof JSONObject) {
                    JSONObject livro = (JSONObject) value;

                    if (livro.get("name").equals(name)) { // procura se usuario ja existe
                        System.out.println("Usuario " + name + " ja existe");
                        return; // Se encontrou o usuario, não precisa continuar procurando
                    }

                }

            }

            //System.out.println("Usuario " + name + " Nao existe");
            // Criar um novo usuario
            JSONObject newUser = new JSONObject();
            newUser.put("name", name);
            newUser.put("Phone", phone_number);
            newUser.put("permission", permission);
            try {
                String passCrip = crip(password);
                newUser.put("password", passCrip);
            } catch (Exception e) {
                e.printStackTrace();
            }

            long numUsers = (long) json.get("Numero de Usuarios");
            json.put(numUsers + 1, newUser);
            json.put("Numero de Usuarios", numUsers + 1);

            try ( // Escrever de volta no arquivo
                    FileWriter writer = new FileWriter(user_directory)) {
                writer.write(json.toJSONString());
            }
            System.out.println("Usuario " + name + " Criado");
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

    }

    public static void RemvUser(String name) {
        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader(user_directory)) {
            // Ler o arquivo JSON existente
            JSONObject json = (JSONObject) parser.parse(reader);
            List<Object> keysToRemove = new ArrayList<>();

            // Verifica se o usuário desejado está presente no JSON
            boolean userEncontrado = false;
            for (Object key : json.keySet()) {
                Object value = json.get(key);

                if (value instanceof JSONObject) {
                    JSONObject user = (JSONObject) value;

                    if (user.get("name").equals(name)) { // procura o usuário que vai ser removido
                        //System.out.println("Usuário "+ name +" encontrado");

                        keysToRemove.add(key);
                        userEncontrado = true;
                    }
                }
            }

            if (userEncontrado) {
                // Remove os usuários encontrados
                for (Object key : keysToRemove) {
                    json.remove(key);
                    System.out.println("Usuário " + name + " Removido");
                }

                // Subtrai número de usuários
                long numUsers = (long) json.get("Numero de Usuarios");
                json.put("Numero de Usuarios", numUsers - 1);

                try (FileWriter writer = new FileWriter(user_directory)) {
                    writer.write(json.toJSONString()); // Escrever de volta no arquivo
                }
            } else {
                System.out.println("Usuário " + name + " não encontrado. Nada foi removido.");
            }

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    private static String crip(String pass) throws Exception {
        Cipher cifra = Cipher.getInstance("AES");
        SecretKeySpec key = new SecretKeySpec(chaveSecreta.getBytes(), "AES");
        cifra.init(Cipher.ENCRYPT_MODE, key);

        byte[] passBytes = pass.getBytes();
        byte[] passCrip = cifra.doFinal(passBytes);

        return Base64.getEncoder().encodeToString(passCrip);
    }

    private static String decrip(String passCrip) throws Exception {
        Cipher cifra = Cipher.getInstance("AES");
        SecretKeySpec key = new SecretKeySpec(chaveSecreta.getBytes(), "AES");
        cifra.init(Cipher.DECRYPT_MODE, key);

        byte[] passCripBytes = Base64.getDecoder().decode(passCrip);
        byte[] passDecrip = cifra.doFinal(passCripBytes);

        String decryptedString = new String(passDecrip, StandardCharsets.UTF_8);
        //System.out.println(decryptedString);
        return decryptedString;
    }

    public static boolean Authentic(String name, String password) {

        String encripPass = null;

        try (FileReader reader = new FileReader(user_directory)) {
            JSONParser parser = new JSONParser();
            // Ler o arquivo JSON existente
            JSONObject json = (JSONObject) parser.parse(reader);
            List<Object> keysToRemove = new ArrayList<>();

            // Verifica se o usuário já existe e está presente no JSON
            for (Object key : json.keySet()) {
                Object value = json.get(key);

                if (value instanceof JSONObject) {
                    JSONObject users = (JSONObject) value;

                    if (users.get("name").equals(name)) { // procura o usuário 
                        System.out.println("Usuário " + name + " existe");

                        // Coleta senha
                        encripPass = (String) users.get("password");

                        try {
                            String passDecrip = decrip(encripPass);
                            if (password.equals(passDecrip)) {//caso senha estaja correta
                                //System.out.println("Senha inserida: " + password);
                                //System.out.println("Senha correta: " + passDecrip);
                                System.out.println("Aprovado");
                                return true;//retorna true quando credencias corresponder co minserida   
                              
                              
                               
                            }else{System.out.println("Recusado Senha incorreta");
                                return false;// returna falso pois senha incorreta
                            }//cas osenha esteja encorreta
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        break; // Se encontrou o usuário, não precisa continuar procurando
                    }
                }
            }

            System.out.println("Recusado Usuario nao existe");
            //System.out.println("Senha inserida: " + password);

            return false;
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        return false;
    }

    public static void Repassword(String name, String newPassword, String phone_number) {

        try (FileReader reader = new FileReader(user_directory)) {
            JSONParser parser = new JSONParser();
            // Ler o arquivo JSON existente
            JSONObject json = (JSONObject) parser.parse(reader);
            List<Object> keysToRemove = new ArrayList<>();

            // Verifica se o usuário já existe e está presente no JSON
            for (Object key : json.keySet()) {
                Object value = json.get(key);

                if (value instanceof JSONObject) {
                    JSONObject users = (JSONObject) value;

                    if (users.get("name").equals(name)) { // procura o usuário 
                        System.out.println("Usuário " + name + " existe");
                        String PassUser = (String) users.get("password");
                        String phoneUser = (String) users.get("Phone");
                        if (phone_number.equals(phoneUser)) {

                            try { // criptografa nova senha e a modifca no json
                                String passCrip = crip(newPassword);
                                users.put("password", passCrip);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }

                            try ( // Escrever de volta no arquivo
                                    FileWriter writer = new FileWriter(user_directory)) {
                                writer.write(json.toJSONString());
                                System.out.println("Senha Altera com sucesso");
                            }

                        }else{
                        
                            System.out.println("Numero telfone incorreto");
                        return;}

                        return; // Se encontrou o usuário, não precisa continuar procurando
                    }
                }

            }

            System.out.println("Recusado Usuario nao existe");
            //System.out.println("Senha inserida: " + password);

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

    }

}
