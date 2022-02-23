package orientacaoobjeto.classes;

import java.text.NumberFormat;
import java.util.Locale;

public class Empregado extends Pessoa {
    private int codigoSetor;
    private float salarioBase;
    private float imposto;

    Locale locale = new Locale("pt", "BR");
    NumberFormat valorNumerico = NumberFormat.getCurrencyInstance(locale);

    public Empregado() {

    }

    public Empregado(String nome, String endereco, String telefone, int codigoSetor, float salarioBase, float imposto) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public float calculaSalario(float salarioBase, float imposto, int codigoSetor) {
        switch (codigoSetor) {
            case 1:
                return ((salarioBase * 5) / 100) + (salarioBase - ((salarioBase * imposto) / 100));
            case 2:
                return ((salarioBase * 10) / 100) + (salarioBase - ((salarioBase * imposto) / 100));
            case 3:
                return ((salarioBase * 20) / 100) + (salarioBase - ((salarioBase * imposto) / 100));
            default:
                System.out.println("Setor inválido ou não informado");
                return salarioBase - ((salarioBase * imposto) / 100);
        }
    }

    public int getCodigoSetor() {
        return this.codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public float getSalarioBase() {
        return this.salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float getImposto() {
        return this.imposto;
    }

    public void setImposto(float imposto) {
        this.imposto = imposto;
    }

    //sobrescrição do método toString(), incluindo os dados desejados na impressão
    @Override
    public String toString() {
        return "Dados do Empregado:" +
                "\nNome: " + getNome() +
                "\nEndereco: " + getEndereco() +
                "\nTelefone: " + getTelefone() +
                "\nCódigo Setor: " + getCodigoSetor() +
                "\nSalário Bruto: " + valorNumerico.format(getSalarioBase()) +
                "\nSalário Liquido: " + valorNumerico.format(calculaSalario(this.getSalarioBase(), this.getImposto(), this.getCodigoSetor()));
    }
}