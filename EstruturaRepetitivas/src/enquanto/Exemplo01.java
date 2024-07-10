package enquanto;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in );

        int x = sc.nextInt();

        int soma = 0;

        while (x != 0){
            soma = soma + x;
            x = sc.nextInt();
        }
        sc.close();

        System.out.println(soma);
        
    }

}
