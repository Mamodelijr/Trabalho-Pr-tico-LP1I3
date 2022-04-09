/* Alunos: Benildes Menezes e Marcelo Modesto

15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade 
de dólares. Calcular e exibir o valor correspondente em Reais (R$).*/

import java.util.Scanner;

public class TP01Ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a cotacao do dolar: ");
        double c = scan.nextDouble();
        System.out.print("Digite o valor em dolares: USS ");
        double vD = scan.nextDouble();
        double vR = Math.round(vD * c * 100.0) / 100.0;
        System.out.println("A quantidade e RS " + vR);
        scan.close();
    }
}