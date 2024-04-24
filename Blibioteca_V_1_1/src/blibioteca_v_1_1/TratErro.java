/*
*   LendBook por:
*   Jonathan Americo Soares -- 42311ETE013
*   Joaquim Vitor castilho ferreira Pedro -- 42111ETE020
*
*/
package blibioteca_v_1_1;

/**
 *
 * @author bruxo
 */
public class TratErro {
    public static void verErr(String retun_in) {
    switch (retun_in) {
        case "poo_01":
            System.out.println("\u001B[33m" + "poo_01: Usuário existe.");
            break;
        case "poo_02":
            System.out.println("\u001B[31m" + "poo_02: Usuário não existe.");
            break;
        case "poo_03":
            System.out.println("\u001B[32m" + "poo_03: Usuário existe e livro foi adicionado ao histórico.");
            break;
        case "poo_04":
            System.out.println("\u001B[32m" + "poo_04: Senha do usuário alterada com sucesso.");
            break;
        case "poo_05":
            System.out.println("\u001B[31m" + "poo_05: Número de telefone incorreto. Não é possível redefinir a senha.");
            break;
        case "poo_06":
            System.out.println("\u001B[32m" + "poo_06: Login autorizado. Usuário autenticado.");
            break;
        case "poo_07":
            System.out.println("\u001B[31m" + "poo_07: Login não autorizado. Senha incorreta.");
            break;
        case "poo_08":
            System.out.println("\u001B[32m" + "poo_08: Usuário removido com sucesso.");
            break;
        case "poo_09":
            System.out.println("\u001B[33m" + "poo_09: Usuário já existe.");
            break;
        case "poo_10":
            System.out.println("\u001B[32m" + "poo_10: Usuário criado com sucesso.");
            break;
        case "poo_11":
            System.out.println("\u001B[32m" + "poo_11: Arquivo JSON do usuário criado com sucesso.");
            break;
        case "poo_12":
            System.out.println("\u001B[33m" + "poo_12: Arquivo JSON do usuário existe.");
            break;
        case "poo_13":
            System.out.println("\u001B[31m" + "poo_13: Erro não reconhecido.");
            break;
        case "poo_14":
            System.out.println("\u001B[33m" + "poo_14: Livro nao encontrado.");
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
            System.out.println("\u001B[31m" + "poo_20: Arquivos JSON de livros existem.");
            break;
        case "poo_21":
            System.out.println("\u001B[32m" + "poo_21: Um dos ou os dois arquivo JSON de livros não existe(m).");
            break;
        case "poo_22":
            System.out.println("\u001B[33m" + "poo_22: Numero idetificador pertence outro usuario.");
            break;
        default:
            System.out.println("\u001B[31m" + "Código de erro não reconhecido.");
    }
}

}
