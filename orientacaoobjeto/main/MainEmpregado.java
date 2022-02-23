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
       // System.out.println(empregado);

        Empregado novoEmpregado = new Empregado("Jose Maria","Rua 1", "99 99999999", 4,2500f,2.5f);

        System.out.println(novoEmpregado);
    }
}
