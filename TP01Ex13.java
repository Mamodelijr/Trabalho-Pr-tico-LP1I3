/* Alunos: Benildes Menezes e Marcelo Modesto

13. Calcular e exibir a velocidade final (em km/h) de um automóvel, a 
partir dos valores da velocidade inicial (em m/s), da aceleração (m/s²) 
e do tempo de percurso (em s) que serão digitados.*/

import java.util.Scanner;

public class TP01Ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a velocidade inicial: ");
        double vi = scan.nextDouble();
        System.out.print("Digite a aceleracao: ");
        double a = scan.nextDouble();
        System.out.print("Digite o tempo de percurso: ");
        double t = scan.nextDouble();
        double vf = (vi + a * Math.pow(t, 2)) * 3.6;
        System.out.println("A velocidade final do automóvel e " + vf + " km/h");
        scan.close();
    }
}