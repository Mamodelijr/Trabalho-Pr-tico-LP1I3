/*Alunos: Benildes Menezes e Marcelo Modesto

18. Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um 
valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco 
que deverá ser devolvido.*/

import java.util.Scanner;

public class TP01Ex18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double soma = 0.0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o valor do " + (i + 1) + "° produto: R$ ");
            soma += scan.nextDouble();
        }
        
        System.out.println("O Total dos Produtos é R$ " + soma);
        System.out.print("Digite um valor a pagar: R$ ");
        double troco = scan.nextDouble() - soma;

        System.out.println("O troco a ser devolvido é R$ " + troco);
        scan.close();
    }
}