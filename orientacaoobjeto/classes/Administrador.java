package orientacaoobjeto.classes;

import java.text.NumberFormat;
import java.util.Locale;

public class Administrador extends Empregado{
    private float ajudaDeCusto;

    Locale locale = new Locale("pt", "BR");
    NumberFormat valorNumerico = NumberFormat.getCurrencyInstance(locale);

    public Administrador(){

    }

    public Administrador(String nome, String endereco, String telefone, int codigoSetor, float salarioBase, float imposto, float ajudaDeCusto){
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto=ajudaDeCusto;
    }

    public float getAjudaDeCusto() {
        return this.ajudaDeCusto;
    }

    public void setAjudaDeCusto(float ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    //sobrescrição do método calculaSalario adicionando um atributo específico da classe
    @Override
    public float calculaSalario(float salarioBase, float imposto, int codSetor) {
        return super.calculaSalario(salarioBase, imposto, codSetor) + this.getAjudaDeCusto();
    }

    //sobrescrição do método toString(), incluindo os dados desejados na impressão
    @Override
    public String toString() {
        return "Dados do Administrador:" +
                "\nNome: " + getNome() +
                "\nEndereco: " + getEndereco() +
                "\nTelefone: " + getTelefone() +
                "\nCódigo Setor: " + getCodigoSetor() +
                "\nSalário Bruto: " + valorNumerico.format(getSalarioBase()) +
                "\nAjuda de Custo: " + valorNumerico.format(getAjudaDeCusto())+
                "\nSalário Liquido: " + valorNumerico.format(calculaSalario(this.getSalarioBase(), this.getImposto(),this.getCodigoSetor()));
    }
}