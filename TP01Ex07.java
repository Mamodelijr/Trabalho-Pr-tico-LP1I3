import java.util.Scanner;


/*Alunos: Benildes Menezes e Marcelo Modesto

Exercícios:
 7. Calcular e exibir a média geométrica de dois valores quaisquer que serão 
digitados. 
*/

    public class TP01Ex07{

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        double V1, V2, media;
       
        System.out.println("Digite o primeiro valor V1: ");
          V1=scan.nextDouble();
	System.out.println("Digite o segundo  valor V2: ");
          V2=scan.nextDouble();
	
        
        media = Math.sqrt(V1 + V2 );
 
        System.out.printf("A média geométrica será de: "+ media);

   }
}
