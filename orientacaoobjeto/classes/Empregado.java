package orientacaoobjeto.classes;
import java.text.NumberFormat;
import java.util.Locale;
public class Empregado extends Pessoa {
    private int codigoSetor;
    private float salarioBase;
    private float imposto;

    Locale locale = new Locale("pt", "BR");
    NumberFormat valorNumerico = NumberFormat.getCurrencyInstance(locale);

    public float calculaSalario(float salarioBase, float imposto) {
        return salarioBase - ((salarioBase * imposto) / 100);
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

    @Override
    public String toString() {
        return "Dados do Empregado:" +
                "\nNome: " + getNome() +
                "\nEndereco: " + getEndereco() +
                "\nTelefone: " + getTelefone() +
                "\nCódigo Setor: " + getCodigoSetor() +
                "\nSalário Bruto: " + valorNumerico.format(getSalarioBase()) +
                "\nSalário Liquido: " + valorNumerico.format(calculaSalario(this.getSalarioBase(), this.getImposto()));
    }
}