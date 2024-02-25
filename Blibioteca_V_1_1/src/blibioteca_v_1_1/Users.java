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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.PasswordView;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import javax.crypto.Cipher;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

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
    private static final String secretKey = "Poo20232Jas00013";

    public Users(String name, String phone_number, String identification, String password, boolean permission) {
        this.name = name;
        this.phone_number = phone_number;
        this.identification = identification;
        this.password = password;
        this.permission = permission;

        Users.CheckJsons();//verifica se os arquivos estao disponiveis
        Users.AddUser(name, phone_number, identification, password, permission);// cria usuario guarda no arquivo

    }

    private static String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }

    private static String getDateTimeLend() {

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, 10);
        Date dataGiveback = calendar.getTime();

        return dateFormat.format(dataGiveback);
    }

    public static String CheckJsons() { // verifica se arquivos de usuarios esta disponiviel se nao cria-os
        File file_books_av = new File(user_directory);
        if (file_books_av.exists()) {// Verificar se o arquivo existe
            //System.out.println("\u001B[33m"+"O arquivo " + user_directory + " existe!!!");
            return "poo_12";
        } else {// se nao, cria-o
            WriteJsonClear();
        }
        return "poo_13";

    }

    public static String WriteJsonClear() { // Cria usuario de armazenar logins de usuarios disponiveis

        FileWriter Write_File = null;
        JSONObject Content_json = new JSONObject();

        Content_json.put("Numero de Usuarios", 0);

        try {
            Write_File = new FileWriter(user_directory);
            Write_File.write(Content_json.toJSONString());
            Write_File.close();
            //System.out.println("Arquivo JSON " + user_directory + " criado com sucesso!");
            return "poo_11";
        } catch (IOException ex) {
            Logger.getLogger(Blibioteca_V_1_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        //System.out.println(Content_json);
        return "poo_13";
    }

    public static JSONObject ReadJsonUsers() {

        JSONObject Content_json;
        JSONParser parser = new JSONParser();

        try {
            Content_json = (JSONObject) parser.parse(new FileReader(user_directory));

            // System.out.println(Content_json);// Printa o conteudo do json de users
            // diponiveis
            return Content_json; // retorna variavel com conteudo do json de users
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null; // retorna null caso de algum erro

    }

    public static String AddUser(String name, String phone_number, String identification, String password,
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
                        //System.out.println("\u001B[31m"+"Usuario " + name + " ja existe");
                        JOptionPane.showMessageDialog(null, "Usuario " + name + " ja existe ", "Registro", JOptionPane.ERROR_MESSAGE);

                        return "poo_09"; // Se encontrou o usuario, não precisa continuar procurando
                    }

                }

            }

            //System.out.println("Usuario " + name + " Nao existe");
            // Criar um novo usuario
            JSONObject newUser = new JSONObject();
            newUser.put("name", name);
            newUser.put("num_identification", identification);
            newUser.put("Phone", phone_number);
            newUser.put("permission", permission);

            //newUser.put("titles_lends", new String[]{"a", "b"});
            try {
                String passCrip = crip(password);
                newUser.put("password", passCrip);
            } catch (Exception e) {
                e.printStackTrace();
            }

            JSONArray titlesArray = new JSONArray(); //cria array que via guarda os livros usurio ja pegou emprestado
            titlesArray.add("empy");

            newUser.put("titles_lends", titlesArray);
            long numUsers = (long) json.get("Numero de Usuarios");
            json.put(numUsers + 1, newUser);
            json.put("Numero de Usuarios", numUsers + 1);

            try ( // Escrever de volta no arquivo
                    FileWriter writer = new FileWriter(user_directory)) {
                writer.write(json.toJSONString());
            }
            //System.out.println("\u001B[32m"+"Usuario " + name + " Criado");
            return "poo_10";
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return "poo_13";
    }

    public static String RemvUser(String name) {
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
                    //System.out.println("Usuário " + name + " Removido");

                }

                // Subtrai número de usuários
                long numUsers = (long) json.get("Numero de Usuarios");
                json.put("Numero de Usuarios", numUsers - 1);

                try (FileWriter writer = new FileWriter(user_directory)) {
                    writer.write(json.toJSONString()); // Escrever de volta no arquivo
                }
                return "poo_08";
            } else {
                //System.out.println("Usuário " + name + " não encontrado. Nada foi removido.");
                return "poo_02";
            }

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return "poo_13";
    }

    private static String crip(String pass) throws Exception {
        Cipher cifra = Cipher.getInstance("AES");
        SecretKeySpec key = new SecretKeySpec(secretKey.getBytes(), "AES");
        cifra.init(Cipher.ENCRYPT_MODE, key);

        byte[] passBytes = pass.getBytes();
        byte[] passCrip = cifra.doFinal(passBytes);

        return Base64.getEncoder().encodeToString(passCrip);
    }

    private static String decrip(String passCrip) throws Exception {
        Cipher cifra = Cipher.getInstance("AES");
        SecretKeySpec key = new SecretKeySpec(secretKey.getBytes(), "AES");
        cifra.init(Cipher.DECRYPT_MODE, key);

        byte[] passCripBytes = Base64.getDecoder().decode(passCrip);
        byte[] passDecrip = cifra.doFinal(passCripBytes);

        String decryptedString = new String(passDecrip, StandardCharsets.UTF_8);
        //System.out.println(decryptedString);
        return decryptedString;
    }

    public static String Authentic(String name, String password) {

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
                        //System.out.println("Usuário " + name + " existe");

                        // Coleta senha
                        encripPass = (String) users.get("password");

                        try {
                            String passDecrip = decrip(encripPass);
                            if (password.equals(passDecrip)) {//caso senha estaja correta
                                //System.out.println("Senha inserida: " + password);
                                //System.out.println("Senha correta: " + passDecrip);
                                //System.out.println("\u001B[32m"+"Aprovado");

                                return "poo_06";//retorna true quando credencias corresponder com as inserida   

                            } else {
                                //System.out.println("\u001B[31m"+"Recusado Senha incorreta");
                                return "poo_07";// returna falso pois senha incorreta
                            }//cas osenha esteja encorreta
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        break; // Se encontrou o usuário, não precisa continuar procurando
                    }
                }
            }

            //System.out.println("\u001B[31m"+"Recusado Usuario nao existe");
            //System.out.println("Senha inserida: " + password);
            return "poo_02";
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        return "poo_13";
    }

    public static String Repassword(String name, String newPassword, String phone_number) {

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
                        //System.out.println("\u001B[32m"+"Usuário " + name + " existe");
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
                                //System.out.println("\u001B[32m"+"Senha Altera com sucesso");
                                return "poo_04";
                            }

                        } else {

                            //System.out.println("\u001B[31m"+"Numero telfone incorreto");
                            return "poo_05";
                        }

                    }
                }

            }

            //System.out.println("\u001B[31m"+"Recusado Usuario nao existe");
            return "poo_01";
            //System.out.println("Senha inserida: " + password);

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return "poo_13";

    }

    public static String AddTitleUser(String name, String title) {

        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader(user_directory)) {
            // Ler o arquivo JSON existente

            JSONObject json = (JSONObject) parser.parse(reader);

            // Verifica se o usuario usuario ja existe e está presente no JSON
            for (Object key : json.keySet()) {
                Object value = json.get(key);

                if (value instanceof JSONObject) {
                    JSONObject user = (JSONObject) value;

                    if (user.get("name").equals(name)) { // procura se usuario existe
                        //System.out.println("Usuario Encontrado Livro " + title + " adcionado ao historico do usuario");

                        JSONObject bookHistory = new JSONObject();
                        JSONArray titlesArray = (JSONArray) user.get("titles_lends");

                        titlesArray.add(title);

                        bookHistory.put("titles_lends", titlesArray);

                        try ( // Escrever de volta no arquivo
                                FileWriter writer = new FileWriter(user_directory)) {
                            writer.write(json.toJSONString());
                        }
                        return "poo_03"; // Se encontrou o usuario, não precisa continuar procurando
                    }

                }

            }
            //System.out.println("Usuario nao existe");
            return "poo_02";

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return "poo_13";

    }

    public static void verErr(String retun_in) {

        switch (retun_in) {
            case "poo_01":
                System.out.println("\u001B[33m"+"poo_01: Usuário existe.");
                break;
            case "poo_02":
                System.out.println("\u001B[31m"+"poo_02: Usuário não existe.");
                break;
            case "poo_03":
                System.out.println("\u001B[32m"+"poo_03: Usuário existe e livro foi adicionado ao histórico.");
                break;
            case "poo_04":
                System.out.println("\u001B[32m"+"poo_04: Senha do usuário alterada com sucesso.");
                break;
            case "poo_05":
                System.out.println("\u001B[31m"+"poo_05: Número de telefone incorreto. Não é possível redefinir a senha.");
                break;
            case "poo_06":
                System.out.println("\u001B[32m"+"poo_06: Login autorizado. Usuário autenticado.");
                break;
            case "poo_07":
                System.out.println("\u001B[31m"+"poo_07: Login não autorizado. Senha incorreta.");
                break;
            case "poo_08":
                System.out.println("\u001B[32m"+"poo_08: Usuário removido com sucesso.");
                break;
            case "poo_09":
                System.out.println("\u001B[33m"+"poo_09: Usuário já existe.");
                break;
            case "poo_10":
                System.out.println("\u001B[32m"+"poo_10: Usuário criado com sucesso.");
                break;
            case "poo_11":
                System.out.println("\u001B[32m"+"poo_11: Arquivo JSON do usuário criado com sucesso.");
                break;
            case "poo_12":
                System.out.println("\u001B[33m"+"poo_12: Arquivo JSON do usuário existe.");
                break;
            case "poo_13":
                System.out.println("\u001B[31m"+"poo_13: Erro não reconhecido.");
                break;
            default:
                System.out.println("\u001B[31m"+"Código de erro não reconhecido.");
        }
    }

}
