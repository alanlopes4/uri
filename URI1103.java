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
public class URI1103 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int v[] = new int[4];
        int c = 0;
        do{
            for(int i=0;i<4;i++){
                v[i] = entrada.nextInt();
                if(v[i] == 0){
                    c++;
                }
            }
            if(c<4){
                int h1=60*v[0]+v[1];
                int h2=60*v[2]+v[3];

                if(h1<h2){
                    System.out.println(h2-h1);
                }
                else if(h1 > h2){
                    int hf = 60*23+60;
                    System.out.println((hf-h1)+h2);
                }else{
                    System.out.println(0);
                }
                c=0;
            }
            
        }while(c<4);
    }
}
