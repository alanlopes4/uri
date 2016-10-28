/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class URI2028 {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int n,aux,c = 0, num = 1;
        while(entrada.hasNext()){
            n = entrada.nextInt();
            c++;
            for(int i=1;i<=n;i++){
                aux = i;
                for(int j=0;j<aux;j++){
                    num++;
                }
            }
            if(n==0)
                System.out.printf("Caso %d: %d numero\n", c, num);
            
            else
                System.out.printf("Caso %d: %d numeros\n", c, num);
            
            
            System.out.printf("%d ", 0);
            for(int i=1;i<=n;i++){
                aux = i;
                for(int j=0;j<aux;j++){
                    System.out.printf("%d ", i);
                }
            }
            System.out.println();
            num = 1;
        }
    }
}
