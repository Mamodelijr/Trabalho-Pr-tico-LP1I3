/*Alunos: Benildes Menezes e Marcelo Modesto

16. Entrar via teclado com o valor de um ângulo em graus, calcular e exibir 
as seguintes funções trigonométricas: seno, cosseno, tangente e secante 
deste ângulo. Lembre-se que uma função trigonométrica trabalha em radianos.*/

import java.util.Scanner;

public class TP01Ex16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o angulo em graus: ");
        int angGra = scan.nextInt();
        double angRad = Math.PI * (angGra) / 180;
        System.out.println("Seno de " + angGra + "°: " + Math.round(Math.sin(angRad) * 100.0) / 100.0);
        System.out.println("Cosseno de " + angGra + "°: " + Math.round(Math.cos(angRad) * 100.0) / 100.0);
        System.out.println("Tangente de " + angGra + "°: " + Math.round(Math.tan(angRad) * 100.0) / 100.0);
        System.out.println("Secante de " + angGra + "°: " + Math.round((1 / Math.cos(angRad)) * 100.0) / 100.0);
        scan.close();
    }
}