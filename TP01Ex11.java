/* Alunos: Benildes Menezes e Marcelo Modesto

11. A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área.*/

import java.util.Scanner;

public class TP01Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o diametro do círculo: ");
        double d = scan.nextDouble();
        double a = Math.round((Math.pow(d, 2) * Math.PI / 4.0) * 100.0) / 100.0;
        System.out.println("A area do circulo e " + a);
        scan.close();
    }
}