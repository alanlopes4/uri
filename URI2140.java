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
public class URI2140 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int v[] = new int[2];
        int notas[] = {100,50,20,10,5,2};
        int c = 0, t = 0;
        do{
            for(int i=0;i<2;i++){
                v[i] = entrada.nextInt();
            }
            if((v[0] == v[1] && v[0] != 0) || (v[0] != v[1])){
                t = (v[1] - v[0]);
                for(int i=0;i<notas.length;i++){
                    if(t>=notas[i]){
                        c+=1;
                        t-=notas[i];
                    }
                }
                if(c==2)
                    System.out.println("possible");
                else
                    System.out.println("impossible");
            }
            c=0;
        }while((v[0] == v[1] && v[0] != 0) || (v[0] != v[1]));
    }
}
