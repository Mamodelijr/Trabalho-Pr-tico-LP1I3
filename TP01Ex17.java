/*Alunos: Benildes Menezes e Marcelo Modesto

17. Entrar via teclado com dois valores quaisquer “X” e “Y”. Calcular e exibir o 
cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln.*/

import java.util.Scanner;


public class TP01Ex17{
public static void main(String args[]){

Scanner scan= new Scanner(System.in); 

System.out.println("Digite o valor da base:  ");
double base = scan.nextInt();

System.out.println("Digite o valor do expoente:  ");
double expoente = scan.nextInt();

double resultado = Math.pow(base,expoente);

System.out.println("O resultado e:  " + resultado);


}
}
