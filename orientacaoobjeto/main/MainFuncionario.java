package orientacaoobjeto.main;
import java.util.Scanner;
import orientacaoobjeto.classes.Funcionario;

public class MainFuncionario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        int opcao;
        double horas;
        float valorHoraTrabalhada;

        System.out.println("Digite o Nome do Funcionário:");
        funcionario.setNome(scanner.nextLine());

        System.out.println("Digite o Sobrenome do Funcionário:");
        funcionario.setSobrenome(scanner.nextLine());

        System.out.println("Digite a Cidade do Funcionário:");
        funcionario.setCidade(scanner.nextLine());

        System.out.println("Digite o Estado do Funcionário:");
        funcionario.setEstado(scanner.nextLine());

        System.out.println("Digite a Quantidade de Horas Trabalhadas do Funcionário:");
        funcionario.setHorasTrabalhadas(scanner.nextDouble());

        System.out.println("Digite o Valor da Hora Trabalhada do Funcionário:");
        funcionario.setValorPorHora(scanner.nextFloat());

        System.out.print(funcionario.exibeMenu());
        opcao = scanner.nextInt();

        do {
            if (opcao == 1) {
                System.out.println("Informe a Quantidade de Horas Adicionais: ");
                horas = scanner.nextDouble();
                funcionario.adicionaHoras(horas);
                System.out.print(funcionario.exibeMenu());
                opcao = scanner.nextInt();
            } else if (opcao == 2) {
                System.out.println("Informe o Novo Valor da Hora Trabalhada");
                valorHoraTrabalhada = scanner.nextFloat();
                funcionario.novoValorHoraTrabalhada(valorHoraTrabalhada);
                System.out.print(funcionario.exibeMenu());
                opcao = scanner.nextInt();
            } else if (opcao == 3) {
                System.out.printf("O Salário é: %.2f \n" , funcionario.calculaSalario(funcionario.getHorasTrabalhadas(), funcionario.getValorPorHora()));
                System.out.print(funcionario.exibeMenu());
                opcao = scanner.nextInt();
            } else if (opcao == 0) {
                System.exit(0);
            }
        } while ( opcao != 0);

        scanner.close();
    }}
