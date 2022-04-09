/* Alunos: Benildes Menezes e Marcelo Modesto

12. Calcular e exibir o volume de um cone a partir dos valores da altura 
e do raio da base que serão digitados.*/

import java.util.Scanner;

public class TP01Ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a altura do cone: ");
        double h = scan.nextDouble();
        System.out.print("Digite o raio do cone: ");
        double r = scan.nextDouble();
        double v = Math.round((Math.pow(r, 2) * Math.PI * h / 3.0) * 100.0) / 100.0;
        System.out.println("O volume do cone e " + v);
        scan.close();
    }
}