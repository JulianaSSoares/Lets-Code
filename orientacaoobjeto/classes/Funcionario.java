package orientacaoobjeto.classes;

public class Funcionario {

    private String nome;
    private String sobrenome;
    private String cidade;
    private String estado;
    private double horasTrabalhadas;
    private float valorPorHora;

    public Funcionario() {

    }

    public Funcionario(String nome, String sobrenome, String cidade, String estado, double horasTrabalhadas, float valorPorHora) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cidade = cidade;
        this.estado = estado;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    public void adicionaHoras(double horas) {
        this.horasTrabalhadas += horas;
    }

    public void novoValorHoraTrabalhada(float valorPorHora) {
        this.valorPorHora = valorPorHora;
        System.out.println("Novo valor/hora: " + valorPorHora);
    }

    public double calculaSalario(double horasTrabalhadas, float valorPorHora) {
        double salario = 0;
        return salario = horasTrabalhadas * valorPorHora;
    }

    public String exibeMenu() {
        return "\nEscolha uma das opções:" +
                "\n0. Para encerrar." +
                "\n1. Incrementar quantidade de horas trabalhadas." +
                "\n2. Substituir o valor por hora do funcionário." +
                "\n3. Calcular o salário do funcionário no final do mês.\n";
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "Nome='" + nome + '\'' +
                ", Sobrenome='" + sobrenome +
                "}";
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getHorasTrabalhadas() {
        return this.horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public float getValorPorHora() {
        return this.valorPorHora;
    }

    public void setValorPorHora(float valorPorHora) {
        this.valorPorHora = valorPorHora;
    }
}