package orientacaoobjeto.main;

import orientacaoobjeto.classes.Livro;
import java.util.Scanner;

public class MainLivro {
    public static void main(String[] args) {
        Livro livro = new Livro();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o Título do Livro:");
        livro.setTítulo(scanner.nextLine());
        System.out.println("Informe o Nome do Leitor:");
        livro.setNomeLeitor(scanner.nextLine());
        System.out.println("Informe a Quantidade Total de Páginas do Livro:");
        livro.setQtPgTotal(scanner.nextInt());
        System.out.println("Informe a Quantidade de Páginas Lidas:");
        livro.setQtPgLidas(scanner.nextInt());

        System.out.printf("\nO percentual lido foi de: " , (livro.percentualLeitura(livro.getQtPgTotal(), livro.getQtPgLidas())));

        scanner.close();
    }
}