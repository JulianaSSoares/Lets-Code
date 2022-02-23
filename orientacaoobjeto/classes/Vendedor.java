package orientacaoobjeto.classes;

public class Vendedor extends Empregado{
    private float valorVendas;
    private float percentualComissao;

    public float getValorVendas() {
        return this.valorVendas;
    }

    public void setValorVendas(float valorVendas) {
        this.valorVendas = valorVendas;
    }

    public float getPercentualComissao() {
        return this.percentualComissao;
    }

    public void setPercentualComissao(float percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    //sobrescrição do método calculaSalario adicionando atributos específicos da classe
    @Override
    public float calculaSalario(float salarioBase, float imposto, int codigoSetor) {
        return super.calculaSalario(salarioBase, imposto,codigoSetor) + ((getValorVendas() * getPercentualComissao()) / 100);
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
                "\nSalário Liquido: " + valorNumerico.format(calculaSalario(this.getSalarioBase(), this.getImposto(),this.getCodigoSetor()));
    }
}