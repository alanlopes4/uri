/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri;

import java.util.Scanner;


public class URI1329 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        while(n !=0){
            int m = 0, j =0;
            for(int i=0;i<n;i++){
                int p = entrada.nextInt();
                if(p == 0)
                   m++;
                else
                   j++;
            }
            System.out.println("Mary won "+m+" times and John won "+j+" times");
            n = entrada.nextInt();
        }
        
    }
}
