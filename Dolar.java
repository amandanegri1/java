import java.util.Scanner;

public class Dolar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a cotação do Dólar?");
        double cotacao = sc.nextDouble();
        System.out.println("quantos dolares?");
        double dolar = sc.nextDouble();
        double reais = cotacao * dolar;
        System.out.printf("voce tem o equivalente a: R$ %.2f\n", reais);
    }
 }