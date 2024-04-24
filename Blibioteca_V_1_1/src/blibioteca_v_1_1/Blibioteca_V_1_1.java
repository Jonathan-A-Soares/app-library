/*
*   LendBook por:
*   Jonathan Americo Soares -- 42311ETE013
*   Joaquim Vitor castilho ferreira Pedro -- 42111ETE020
*
 */
package blibioteca_v_1_1;

import static blibioteca_v_1_1.Books.AddBook;
import static blibioteca_v_1_1.Books.book_directory_available;
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
        if (false) { // testes a parte
            // JSONObject boun = Books.ReadJsonBooksUnavailable();
            // JSONObject boav = Books.ReadJsonBooksAvailable();
            // Books.AddBook("O Diário de Anne Frank", "Anne Frank", "Biografia", "Livraria
            // ZYX", "25/06/1947", "11223344", Books.book_directory_available);
            // Books.AddBook("1984", "George Orwell", "Ficção Científica", "Livraria YZ1",
            // "08/06/1949", "33445566", Books.book_directory_available);
            // JSONObject users = Users.ReadJsonBooks();
            // System.out.println(users);
            // Users.AddUser("Joo","3593598890","0345634","123456789",true);
            // Adicionar usuários com diferentes papéis, incluindo administradores
            // Users.AddUser("Joao Silva", "+5511987654321", "123456", "senha123", true);
            // Users.AddUser("Mari Oliveira", "+5511998765432", "789012", "minha senha",
            // false);
            // Users.AddUser("Carlo Santos", "+5511976543210", "345678", "12345678", false);
            // remove user
            // Users.RemvUser("Joao Silva");
            // Users.RemvUser("Mari Oliveira");
            // Users.RemvUser("Carlo Santos");
            // faz autenticçaoa de usuario
            // Users.Authentic("Carlos Santos", "123456708");
            // muda senha do usuario
            // Users.Repassword("Carlos Santos", "minha sha","+5511976543210");
            // autentica usuari com nova senha
            // Users.Authentic("Carlos Santos", "minha sha");
            // empresta livro
            // Books.LendBook("O Diário de Anne Frank", "Joao Silva"); //empresta livro para
            // joao
            // devolve livro
            // Books.GiveBackBook("O Diário de Anne Frank", "Joao Silva"); //devolve livro
            // de joao para blibioteca
            // Users.AddTitleUser("Carlo Santos", "O Diário de Anne Frank"); // adciona
            // livro historico do usuario
        }
        // ----------------------------------------------------------------------------------------
        String a = Books.CheckJsons();
        // System.err.println(a);
        // TratErro.verErr(a);
        a = Users.CheckJsons();
        // System.err.println(a);

        // TratErro.verErr(a);
        new UiLogin().setVisible(true);
        // new UIPainelAdm("admin").setVisible(true);
        // new UiPainelUser("user").setVisible(true);
        
        
        if(false){
        Books.LendBook("Dom Casmurro", "8030");
        Books.LendBook("Grande Sertão: Veredas", "8030");
        Books.LendBook("Capitães da Areia", "0013");
        Books.LendBook("O Cortiço", "0013");
        Books.LendBook("A Hora da Estrela", "171388");
        Books.LendBook("Quincas Borba", "171388");
        Books.LendBook("A Moreninha", "8030");
        Books.LendBook("O Guarani", "8030");
        Books.LendBook("O Alienista", "8030");
        Books.LendBook("Capitães da Areia", "0013");
        Books.LendBook("O Cortiço", "0013");
        Books.LendBook("Vidas Secas", "0013");
        Books.LendBook("A Hora da Estrela", "171388");
        Books.LendBook("Claro Enigma", "171388");
        Books.LendBook("Quincas Borba", "171388");
        
}
        
        // ----------------------------------------------------------------------------------------
        if (false) {

            Books.AddBook("Dom Casmurro", "Machado de Assis", "Romance", "Editora Garnier", "03/10/1899", "9788535912268", Books.book_directory_available);
            Books.AddBook("Grande Sertão: Veredas", "João Guimarães Rosa", "Ficção", "Editora José Olympio", "01/01/1956", "9788503011548", Books.book_directory_available);
            Books.AddBook("Memórias Póstumas de Brás Cubas", "Machado de Assis", "Romance", "Editora Garnier", "12/1880", "9788525405803", Books.book_directory_available);
            Books.AddBook("Capitães da Areia", "Jorge Amado", "Romance", "Editora Companhia das Letras", "01/01/1937", "9788535914842", Books.book_directory_available);
            Books.AddBook("O Cortiço", "Aluísio Azevedo", "Romance Naturalista", "Editora Martin Claret", "01/01/1890", "9788572322323", Books.book_directory_available);
            Books.AddBook("Vidas Secas", "Graciliano Ramos", "Romance", "Editora Record", "01/01/1938", "9788503009484", Books.book_directory_available);
            Books.AddBook("A Hora da Estrela", "Clarice Lispector", "Romance", "Editora Rocco", "01/01/1977", "9788532502494", Books.book_directory_available);
            Books.AddBook("Claro Enigma", "Carlos Drummond de Andrade", "Poesia", "Editora Record", "01/01/1951", "9788501105303", Books.book_directory_available);
            Books.AddBook("Quincas Borba", "Machado de Assis", "Romance", "Editora Martin Claret", "01/01/1891", "9788525405810", Books.book_directory_available);
            Books.AddBook("A Moreninha", "Joaquim Manuel de Macedo", "Romance", "Editora Martin Claret", "01/01/1844", "9788572325942", Books.book_directory_available);
            Books.AddBook("O Guarani", "José de Alencar", "Romance", "Editora Martin Claret", "01/01/1857", "9788572326307", Books.book_directory_available);
            Books.AddBook("A Escrava Isaura", "Bernardo Guimarães", "Romance", "Editora Martin Claret", "01/01/1875", "9788572326444", Books.book_directory_available);
            Books.AddBook("Memorial de Aires", "Machado de Assis", "Romance", "Editora Garnier", "01/01/1908", "9788535917027", Books.book_directory_available);
            Books.AddBook("O Quinze", "Rachel de Queiroz", "Romance", "Editora José Olympio", "01/01/1930", "9788503014358", Books.book_directory_available);
            Books.AddBook("Casa de Pensão", "Aluísio Azevedo", "Romance", "Editora Martin Claret", "01/01/1884", "9788572322255", Books.book_directory_available);
            Books.AddBook("Iracema", "José de Alencar", "Romance", "Editora Martin Claret", "01/01/1865", "9788572325911", Books.book_directory_available);
            Books.AddBook("O Auto da Compadecida", "Ariano Suassuna", "Teatro", "Editora Nova Fronteira", "01/01/1955", "9788520937113", Books.book_directory_available);
            Books.AddBook("Terra Sonâmbula", "Mia Couto", "Romance", "Editora Companhia das Letras", "01/01/1992", "9788535903723", Books.book_directory_available);
            Books.AddBook("Gabriela, Cravo e Canela", "Jorge Amado", "Romance", "Editora Companhia das Letras", "01/01/1958", "9788535900845", Books.book_directory_available);
            Books.AddBook("O Alienista", "Machado de Assis", "Conto", "Editora Martin Claret", "01/01/1882", "9788572322422", Books.book_directory_available);
            Books.AddBook("A Revolução dos Bichos", "George Orwell", "Ficção Política", "Companhia das Letras", "01/01/1945", "9788535914842", Books.book_directory_available);
            Books.AddBook("O Primo Basílio", "Eça de Queirós", "Realismo", "Editora Nova Fronteira", "01/01/1878", "9788520920481", Books.book_directory_available);
            Books.AddBook("O Alienista", "Machado de Assis", "Conto", "Editora Martin Claret", "01/01/1882", "9788572322422", Books.book_directory_available);
            Books.AddBook("O Cortiço", "Aluísio Azevedo", "Romance Naturalista", "Editora Martin Claret", "01/01/1890", "9788572322323", Books.book_directory_available);
            Books.AddBook("Macunaíma", "Mário de Andrade", "Romance Modernista", "Editora Brasiliense", "01/01/1928", "9788573260667", Books.book_directory_available);
            Books.AddBook("Cidade de Deus", "Paulo Lins", "Romance Urbano", "Editora Companhia das Letras", "01/01/1997", "9788535905345", Books.book_directory_available);
            Books.AddBook("O Guarani", "José de Alencar", "Romance Histórico", "Editora Martin Claret", "01/01/1857", "9788572326307", Books.book_directory_available);
            Books.AddBook("Mayombe", "Pepetela", "Romance Africano", "Editora Leya", "01/01/1979", "9788577344818", Books.book_directory_available);
            Books.AddBook("O Homem Duplicado", "José Saramago", "Ficção Filosófica", "Companhia das Letras", "01/01/2002", "9788535902399", Books.book_directory_available);
            Books.AddBook("O Mundo de Sofia", "Jostein Gaarder", "Ficção Filosófica", "Editora Companhia das Letras", "01/01/1991", "9788571648418", Books.book_directory_available);
            Books.AddBook("Fogo Morto", "José Lins do Rego", "Romance Regionalista", "Editora José Olympio", "01/01/1943", "9788503010121", Books.book_directory_available);
            Books.AddBook("Angústia", "Graciliano Ramos", "Romance", "Editora Record", "01/01/1936", "9788503009477", Books.book_directory_available);
            Books.AddBook("A Cidade e as Serras", "Eça de Queirós", "Romance", "Editora Nova Fronteira", "01/01/1901", "9788520920306", Books.book_directory_available);
            Books.AddBook("O Triste Fim de Policarpo Quaresma", "Lima Barreto", "Romance", "Editora Martin Claret", "01/01/1915", "9788572326345", Books.book_directory_available);
            Books.AddBook("Triste Fim de Policarpo Quaresma", "Lima Barreto", "Romance", "Editora Martin Claret", "01/01/1915", "9788572326345", Books.book_directory_available);
            Books.AddBook("O Sertanejo", "José de Alencar", "Romance", "Editora Martin Claret", "01/01/1875", "9788572326307", Books.book_directory_available);
            Books.AddBook("O Ateneu", "Raul Pompeia", "Romance", "Editora Martin Claret", "01/01/1888", "9788572322392", Books.book_directory_available);
            Books.AddBook("A Hora da Estrela", "Clarice Lispector", "Romance", "Editora Rocco", "01/01/1977", "9788532502494", Books.book_directory_available);
            Books.AddBook("Casa de Pensão", "Aluísio Azevedo", "Romance", "Editora Martin Claret", "01/01/1884", "9788572322255", Books.book_directory_available);
            Books.AddBook("O Mulato", "Aluísio Azevedo", "Romance", "Editora Martin Claret", "01/01/1881", "9788572322248", Books.book_directory_available);
            Books.AddBook("Estação Carandiru", "Drauzio Varella", "Ação", "Companhia das Letras", "01/01/1999", "9788535908247", Books.book_directory_available);
            Books.AddBook("O Alquimista", "Paulo Coelho", "Aventura", "Editora Rocco", "01/01/1988", "9788532500117", Books.book_directory_available);
            Books.AddBook("O Vampiro Rei", "André Vianco", "Terror", "Editora Novo Século", "01/01/1999", "9788576790354", Books.book_directory_available);
            Books.AddBook("Os Sete", "André Vianco", "Terror", "Editora Novo Século", "01/01/2000", "9788576790323", Books.book_directory_available);
            Books.AddBook("Círculo de Fogo", "André Vianco", "Ação", "Editora Novo Século", "01/01/2003", "9788576791566", Books.book_directory_available);
            Books.AddBook("Dias Melhores Virão", "Nelson DeMille", "Ação", "Editora Novo Conceito", "01/01/1997", "9788576762245", Books.book_directory_available);
            Books.AddBook("Enigma dos Sonhos", "Luiz Henrique Mazzaron", "Ficção Científica", "Editora Novo Século", "01/01/2010", "9788576795779", Books.book_directory_available);
            Books.AddBook("Laranja Mecânica", "Anthony Burgess", "Ficção Científica", "Editora Aleph", "01/01/1962", "9788576570391", Books.book_directory_available);
            Books.AddBook("A Metamorfose", "Franz Kafka", "Ficção Científica", "Companhia das Letras", "01/01/1915", "9788535909558", Books.book_directory_available);
            Books.AddBook("O Senhor dos Anéis: A Sociedade do Anel", "J.R.R. Tolkien", "Ação", "Editora Martins Fontes", "01/01/1954", "9788533619376", Books.book_directory_available);
            Books.AddBook("O Senhor dos Anéis: As Duas Torres", "J.R.R. Tolkien", "Ação", "Editora Martins Fontes", "01/01/1954", "9788533619420", Books.book_directory_available);
            Books.AddBook("O Senhor dos Anéis: O Retorno do Rei", "J.R.R. Tolkien", "Ação", "Editora Martins Fontes", "01/01/1955", "9788533619406", Books.book_directory_available);
            Books.AddBook("O Chamado de Cthulhu e outros contos", "H.P. Lovecraft", "Terror", "Editora Martin Claret", "01/01/1928", "9788572329094", Books.book_directory_available);
            Books.AddBook("A Hora do Vampiro", "Stephen King", "Terror", "Editora Objetiva", "01/01/1975", "9788532511502", Books.book_directory_available);
            Books.AddBook("A Coisa", "Stephen King", "Terror", "Editora Suma", "01/01/1986", "9788556510433", Books.book_directory_available);
            Books.AddBook("Metro 2033", "Dmitry Glukhovsky", "Ficção Científica", "Editora Planeta", "01/01/2005", "9788576653308", Books.book_directory_available);
            Books.AddBook("O Homem Invisível", "H.G. Wells", "Ficção Científica", "Editora Zahar", "01/01/1897", "9788537812391", Books.book_directory_available);
            Books.AddBook("Jogos Vorazes", "Suzanne Collins", "Ação", "Editora Rocco", "01/01/2008", "9788579801265", Books.book_directory_available);
            Books.AddBook("A Fuga de Sobibor", "Richard Rashke", "Ação", "Editora Record", "01/01/1995", "9788501049330", Books.book_directory_available);

        
        
        }

    }

}
