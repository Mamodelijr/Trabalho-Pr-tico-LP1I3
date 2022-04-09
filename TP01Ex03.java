/*Alunos: Benildes Menezes e Marcelo Modesto

Exercícios:
3. Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será
digitado.*/

import java.util.Scanner;


public class TP01Ex03{
public static void main(String args[]){

Scanner scan= new Scanner(System.in); 

System.out.println("Digite a diagonal do quadrado (metros):");
int diagonal = scan.nextInt();



double lado = (diagonal/Math.sqrt(2));

double area = lado*lado;

System.out.println("A area do quadrado e: " + lado + "m²");


}
}