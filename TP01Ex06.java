import java.util.Scanner;


/*Alunos: Benildes Menezes e Marcelo Modesto

Exercícios:
 6. Calcular e exibir a média aritmética de quatro valores quaisquer que serão 
digitados.
*/

    public class TP01Ex06{

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        double V1, V2, V3, V4, media;
       
        System.out.println("Digite o primeiro valor V1: ");
          V1=scan.nextDouble();
	System.out.println("Digite o segundo  valor V2: ");
          V2=scan.nextDouble();
	System.out.println("Digite o terceiro valor V3: ");
          V3=scan.nextDouble();
	System.out.println("Digite o quarto valor V4: ");
          V4=scan.nextDouble();
        
        media = (V1 + V2 + V3 + V4) /4;
 
        System.out.printf("A média Aritimética será de: "+ media);

   }
}

