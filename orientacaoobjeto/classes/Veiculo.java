package orientacaoobjeto.classes;

import java.util.Scanner;

public class Veiculo {
    private String modelo;
    private String marca;
    private int ano;
    private int velocidadeMáxima;
    private int velocidadeAtual;
    private String cor;
    private float valorFIPE;
    Scanner scanner = new Scanner(System.in);


    public void acelerar(int velocidade, int opcao) {
        if ((velocidade + this.velocidadeAtual) > this.velocidadeMáxima) {
            System.out.println("Velocidade Acima do Valor Permitido para o Veículo.\nDeseja continuar? (1. Sim / 2. Não) ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Estou acelerando " + velocidade + " km/h");
            } else {
                System.out.println("Velocidade Mantida");
            }
        } else if ((velocidade + this.velocidadeAtual) < this.velocidadeMáxima) {
            System.out.println("Acelerando...");
        } else if (opcao == 2) {
            frear();
        }
    }

    public void frear() {
        System.out.println("Estou freando o veículo " + this.modelo);

    }

    public String menu() {
        return "Escolha uma das opções: \n1. Acelerar\n2. Frear";
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "Modelo='" + this.modelo + '\'' +
                ", Marca='" + this.marca + '\'' +
                ", Ano=" + this.ano + '}';
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVelocidadeMáxima() {
        return velocidadeMáxima;
    }

    public void setVelocidadeMáxima(int velocidadeMáxima) {
        this.velocidadeMáxima = velocidadeMáxima;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getValorFIPE() {
        return valorFIPE;
    }

    public void setValorFIPE(float valorFIPE) {
        this.valorFIPE = valorFIPE;
    }
}