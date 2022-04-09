import java.util.Scanner;

/*Alunos: Benildes Menezes e Marcelo Modesto

Exercícios:
2. Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será 
digitado. */

    public class TP01Ex02{

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        int L1=0, L2=0, area=0;
        System.out.println("Digite valor de L1");
          L1=scan.nextInt();
        System.out.println("Digite valor de L2");
          L2=scan.nextInt();
          area=L1*L2;
        System.out.printf("A area do quadrado de lado1 %d e lado2 %d e igual a %d cm²", L1, L2, area);

   }
}
