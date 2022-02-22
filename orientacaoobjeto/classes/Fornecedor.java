package orientacaoobjeto.classes;

import java.text.NumberFormat;
import java.util.Locale;

public class Fornecedor extends Pessoa{
    private double valorCredito;
    private double valorDivida;

    Locale locale = new Locale("pt", "BR");
    NumberFormat valorNumerico = NumberFormat.getCurrencyInstance(locale);

    public Fornecedor(){

    }

    public double getValorCredito(){
        return this.valorCredito;
    }

    public void setValorCredito(float valorCredito){
        this.valorCredito = valorCredito;
    }

    public double getValorDivida(){
        return this.valorDivida;
    }

    public void setValorDivida(float valorDivida){
        this.valorDivida=valorDivida;
    }

    public double obterSaldo(double valorCredito, double valorDivida){
        return this.valorCredito - this.valorDivida;
    }

    @Override
    public String toString() {
        return "Dados do Fornecedor:" +
                "\nRazão Social: " + getNome() +
                "\nEndereço: " + getEndereco()+
                "\nTelefone: " + getTelefone()+
                "\nValor Credito: " + valorNumerico.format(getValorCredito()) +
                "\nValor Divida: " + valorNumerico.format(getValorDivida()) +
                "\nSaldo: " + valorNumerico.format(obterSaldo(this.valorCredito, this.valorDivida));
    }
}