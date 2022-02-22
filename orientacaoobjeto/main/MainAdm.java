package orientacaoobjeto.main;

import orientacaoobjeto.classes.Administrador;

public class MainAdm {
    public static void main(String[] args) {
        Administrador administrador = new Administrador();
        administrador.setNome("João da Silva");
        administrador.setEndereco("Rua Xyz, 00");
        administrador.setTelefone("00 0000-0000");
        administrador.setCodigoSetor(2);
        administrador.setSalarioBase(15000.00f);
        administrador.setImposto(7.5f);
        administrador.setAjudaDeCusto(2500f);
        System.out.println(administrador.toString());
    }
}