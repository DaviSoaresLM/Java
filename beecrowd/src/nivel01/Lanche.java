/* Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.

Entrada
O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.

Saída
O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal. */
import java.util.Scanner;

public class Lanche {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String codigo = scan.next();
        int qtde = scan.nextInt();
        double precoTotal = 0;
        if(codigo.equals("1")){
            precoTotal=qtde*4.00;
        }
        else if(codigo.equals("2")){
            precoTotal=qtde*4.50;
        }
        else if(codigo.equals("3")){
            precoTotal=qtde*5.00;
        }
        else if (codigo.equals("4")) {
            precoTotal=qtde*2.00;            
        }
        else if(codigo.equals("5")){
            precoTotal=qtde*1.50;
        }
        else{
        }
        System.out.printf("Total: R$ %.2f%n",precoTotal);
        scan.close();
        }
}
