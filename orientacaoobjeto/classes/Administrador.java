package orientacaoobjeto.classes;

import java.text.NumberFormat;
import java.util.Locale;

public class Administrador extends Empregado{
    private float ajudaDeCusto;

    Locale locale = new Locale("pt", "BR");
    NumberFormat valorNumerico = NumberFormat.getCurrencyInstance(locale);

    public Administrador(){

    }

    public float getAjudaDeCusto() {
        return this.ajudaDeCusto;
    }

    public void setAjudaDeCusto(float ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public float calculaSalario(float salarioBase, float imposto) {
        return super.calculaSalario(salarioBase, imposto) + this.getAjudaDeCusto();
    }

    @Override
    public String toString() {
        return "Dados do Administrador:" +
                "\nNome: " + getNome() +
                "\nEndereco: " + getEndereco() +
                "\nTelefone: " + getTelefone() +
                "\nCódigo Setor: " + getCodigoSetor() +
                "\nSalário Bruto: " + valorNumerico.format(getSalarioBase()) +
                "\nAjuda de Custo: " + valorNumerico.format(getAjudaDeCusto())+
                "\nSalário Liquido: " + valorNumerico.format(calculaSalario(this.getSalarioBase(), this.getImposto()));
    }
}