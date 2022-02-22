package orientacaoobjeto.main;

import orientacaoobjeto.classes.Fornecedor;

public class MainFornecedor {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNome("EMPRESA XPTO LTDA");
        fornecedor.setEndereco("Rua x, 100");
        fornecedor.setTelefone("11 22223333");
        fornecedor.setValorCredito(50000);
        fornecedor.setValorDivida(5000);
        System.out.println(fornecedor.toString());
    }
}
