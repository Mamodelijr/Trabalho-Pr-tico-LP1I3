/*Nomes: Benildes Menezes e Marcelo Modesto

10. Entrar via teclado com o valor de uma temperatura em graus Celsius, 
calcular e exibir sua temperatura equivalente em Fahrenheit.*/

import java.util.Scanner;

public class TP01Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite uma temperatura em °C: ");
        double tC = scan.nextDouble();
        double tF = tC * 1.8 + 32;
        System.out.println(tC + "°C equivale a " + tF + "°F");
        scan.close();
    }
}
