/* Alunos: Benildes Menezes e Marcelo Modesto

14. Calcular e exibir o volume livre de um ambiente que contém uma esfera de 
raio "r" inscrita em um cubo perfeito de aresta "a". Os valores de "r" e "a"
serão digitados.*/

import java.util.Scanner;

public class TP01Ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o raio da esfera: ");
        double r = scan.nextDouble();
        System.out.print("Digite a aresta do cubo: ");
        double a = scan.nextDouble();
        double vL = Math.pow(a, 3) - (Math.pow(r, 3) * Math.PI * 4 / 3);
        System.out.println("O volume livre do ambiente e " + vL);
        scan.close();
    }
}