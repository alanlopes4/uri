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
public class URI2061 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int v[] = new int[2];
        for(int i=0;i<2;i++){
            v[i] = entrada.nextInt();
        }
        String a;
        for(int i=0;i<v[1];i++){
            a = entrada.next();
            if(a.equals("fechou"))
                v[0]+=1;
            else
                v[0]-=1;
        }
        System.out.println(v[0]);
    }
}
