import java.util.Scanner;

/*Alunos: Benildes Menezes e Marcelo Modesto

Exercícios:
  4. A partir dos valores da base e altura de um triângulo, calcular e exibir sua área. 

*/

    public class TP01Ex04{

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        int b=0, h=0, area=0;
        System.out.println("Digite valor de b");
          b=scan.nextInt();
        System.out.println("Digite valor de h");
          h=scan.nextInt();
          area=(b*h) / 2;
        System.out.printf("A área do triângulo de base  %d e altura %d é igual a %d cm²", b, h, area);

   }
}
