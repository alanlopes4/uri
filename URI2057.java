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
public class URI2057 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int v[] = new int[3];
        for(int i=0;i<3;i++){
            v[i] = entrada.nextInt();
        }
        
        int hf = (v[0] + v[1] + v[2]);
        if(hf==24)
            System.out.println(0);
        else if(hf>24)
            System.out.println(hf-24);
        else if(hf<0)
            System.out.println(24 + hf);
        else
            System.out.println(hf);
        
        
    }
}
