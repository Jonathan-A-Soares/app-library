/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package blibioteca_v_1_1;

import org.json.simple.JSONObject;

/**
 *
 * @author bruxo
 */
public class Blibioteca_V_1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Books.CheckJsons();
        //JSONObject boun = Books.ReadJsonBooksUnavailable();
        //JSONObject boav = Books.ReadJsonBooksAvailable();
        //Books.AddBook("O Diário de Anne Frank", "Anne Frank", "Biografia", "Livraria ZYX", "25/06/1947", "11223344", Books.book_directory_available);
        //Books.AddBook("1984", "George Orwell", "Ficção Científica", "Livraria YZ1", "08/06/1949", "33445566", Books.book_directory_available);

        //Books.RemvBook("1984",Books.book_directory_available,"33445566");
        //Books.RemvBook("O Diário de Anne Frank",Books.book_directory_available,"33445566");
        Users.CheckJsons();
        //JSONObject users = Users.ReadJsonBooks();
        //System.out.println(users);
        //Users.AddUser("Joo","3593598890","0345634","123456789",true);

        //Adicionar usuários com diferentes papéis, incluindo administradores
        //Users.AddUser("Joao Silva", "+5511987654321", "123456", "senha123", true);
        //Users.AddUser("Maria Oliveira", "+5511998765432", "789012", "minha senha", false);
        //Users.AddUser("Carlos Santos", "+5511976543210", "345678", "12345678", false);

        //Users.RemvUser("Pedro");
        //Users.Authentic("Carlos Santos", "123456708");
        //Users.Repassword("Carlos Santos", "minha sha","+5511976543210");
        Users.Authentic("Carlos Santos", "minha sha");

    }

}
