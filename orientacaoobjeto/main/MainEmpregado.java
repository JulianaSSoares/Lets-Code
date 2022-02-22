package orientacaoobjeto.main;

import orientacaoobjeto.classes.Empregado;

public class MainEmpregado {
    public static void main(String[] args) {
        Empregado empregado = new Empregado();
        empregado.setNome("Maria");
        empregado.setEndereco("Rua teste, 00");
        empregado.setTelefone("00 12345678");
        empregado.setCodigoSetor(1);
        empregado.setImposto(5.5f);
        empregado.setSalarioBase(5100.50f);
       // System.out.printf("%.2f" , empregado.calculaSalario(empregado.getSalarioBase(), empregado.getImposto()));
        System.out.println(empregado.toString());
    }
}
