/* Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
duas casas decimais. */
package exercicios;

import java.util.Scanner;

public class Exer08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Renda                       Imposto de Renda");
        System.out.println("De 0,00 a R$ 2000,00                Isento");
        System.out.println("De R$ 2000,01 a R$ 3000,00              8%");
        System.out.println("De R$ 3000,01 a R$ 4500,00              18%");
        System.out.println("acima de R$ 4500,00                     28%");

        System.out.println("Digite sua renda: R$");
        double salario = scan.nextDouble();

        double imposto = 0.00;

        if (salario <= 2000) {
            imposto = 0.0;
            
        }
         else if (salario <= 3000) {
            imposto = (salario - 2000.00) * 0.08;            
        }
         else if (salario <= 4500.00 ){
            imposto = (1000.00 * 0.08);
            imposto += (salario - 3000) * 0.18;
        } 
        else {
            imposto = (1000.00 * 0.08);

            imposto += (1500*0.18);

            imposto+= (salario - 4500) * 0.28;

        }
        System.out.printf("Imposto: %.2f",imposto);
        scan.close();;

    }

}
