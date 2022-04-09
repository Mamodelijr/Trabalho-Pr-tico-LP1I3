import java.util.Scanner;
public class TP01Ex01{

/* Alunos:  Benildes Menezes e Marcelo Modesto

Exercícios: 1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua área
*/

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        int B=0, H=0, area=0;
        System.out.println("Digite valor de B");
          B=scan.nextInt();
        System.out.println("Digite valor de H");
          H=scan.nextInt();
          area=B*H;
        System.out.printf("A area do retangulo de base %d e altura %d e igual a %d cm²", B, H, area);

   }
}
