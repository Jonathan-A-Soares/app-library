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
    public static void main(String[] args)  {
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
        //Users.AddUser("Maria", "987654321", "0456789", "987654321", false);
        //Users.AddUser("Carlos", "123456789", "0123456", "123456789", true);
        //Users.AddUser("Ana", "567890123", "0789012", "567890123", false);
        //Users.AddUser("Pedro", "345678901", "0901234", "345678901", false);
        //Users.AddUser("Laura", "234567890", "0567890", "234567890", true);
        
        Users.RemvUser("Pedro");
          
        
        
        

        
    }

}
