import java.util.Scanner;

public class CalculoIMCSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de IMC (Índice de Massa Corporal)");
        System.out.print("Digite o seu peso em kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a sua altura em metros: ");
        double altura = scanner.nextDouble();

        // Calculando o IMC
        double imc = peso / (altura * altura);

        // Exibindo o resultado
        System.out.println("O seu IMC é: " + imc);

        scanner.close();
    }
}
