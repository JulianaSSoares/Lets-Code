package orientacaoobjeto.main;

import orientacaoobjeto.classes.Vendedor;

public class MainVendedor {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor();
        vendedor.setSalarioBase(5000f);
        vendedor.setValorVendas(1500f);
        vendedor.setPercentualComissao(3f);
        vendedor.setImposto(2.5f);

        System.out.println(vendedor.toString());
    }
}
