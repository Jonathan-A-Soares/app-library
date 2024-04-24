/*
*   LendBook por:
*   Jonathan Americo Soares -- 42311ETE013
*   Joaquim Vitor castilho ferreira Pedro -- 42111ETE020
*
*/



package blibioteca_v_1_1;

import java.awt.print.Book;
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
        if (true){ // testes a parte
        //JSONObject boun = Books.ReadJsonBooksUnavailable();
        //JSONObject boav = Books.ReadJsonBooksAvailable();
        //Books.AddBook("O Diário de Anne Frank", "Anne Frank", "Biografia", "Livraria ZYX", "25/06/1947", "11223344", Books.book_directory_available);
        //Books.AddBook("1984", "George Orwell", "Ficção Científica", "Livraria YZ1", "08/06/1949", "33445566", Books.book_directory_available);
        //JSONObject users = Users.ReadJsonBooks();
        //System.out.println(users);
        //Users.AddUser("Joo","3593598890","0345634","123456789",true);
        //Adicionar usuários com diferentes papéis, incluindo administradores
        //Users.AddUser("Joao Silva", "+5511987654321", "123456", "senha123", true);
        //Users.AddUser("Mari Oliveira", "+5511998765432", "789012", "minha senha", false);
        //Users.AddUser("Carlo Santos", "+5511976543210", "345678", "12345678", false);
        //remove user
        //Users.RemvUser("Joao Silva");
        //Users.RemvUser("Mari Oliveira");
        //Users.RemvUser("Carlo Santos");
        //faz autenticçaoa de usuario
        //Users.Authentic("Carlos Santos", "123456708");
        //muda senha do usuario
        //Users.Repassword("Carlos Santos", "minha sha","+5511976543210");
        //autentica usuari com nova senha
        //Users.Authentic("Carlos Santos", "minha sha");
        //empresta livro
        //Books.LendBook("O Diário de Anne Frank", "Joao Silva"); //empresta livro para joao
        //devolve livro
        //Books.GiveBackBook("O Diário de Anne Frank", "Joao Silva"); //devolve livro de joao para blibioteca
        //Users.AddTitleUser("Carlo Santos", "O Diário de Anne Frank"); // adciona livro historico do usuario
        }
        //----------------------------------------------------------------------------------------
        String a = Books.CheckJsons();
        //System.err.println(a);
        //TratErro.verErr(a);
        a = Users.CheckJsons();
        //System.err.println(a);
        
       // TratErro.verErr(a);
            
        //new UiLogin().setVisible(true);
        new UIPainelAdm("admin").setVisible(true);
        new UiPainelUser("user").setVisible(true);
        

        //----------------------------------------------------------------------------------------
        //Users.DateUser("adm");
        //String re = Users.EspecificDateUser("admin", "Phone");
        //JSONObject aaaa = Users.DateUser("admin");
        //System.out.println(aaaa);
    }

}
