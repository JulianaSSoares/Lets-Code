package orientacaoobjeto.main;

import orientacaoobjeto.classes.Pessoa;

public class MainPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Juliana");
        pessoa.setEndereco("Rua y, s/n");
        pessoa.setTelefone("11 999999999");
        System.out.println(pessoa.toString());
    }
}