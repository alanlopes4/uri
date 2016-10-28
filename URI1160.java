/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri;

import java.util.Scanner;


public class URI1160 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int t = entrada.nextInt();
        for(int i=0;i<t;i++){
            int pa = entrada.nextInt();
            int pb = entrada.nextInt();
            double ga = entrada.nextDouble();
            double gb = entrada.nextDouble();
            int ppa = (int)(pa*ga)/100;
            int ppb = (int) (pb*gb)/100;
            int anos = 0;
            while(pa<=pb){
                pa+=((pa*ga)/100);
                pb+=((pb*gb)/100);
                anos++;
                if(anos>100){
                    System.out.println("Mais de 1 seculo.");
                    break;
                }
            }
            if(anos<=100)
            System.out.println(anos+" anos.");
        }
    }
}
