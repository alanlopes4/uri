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
public class URI2172 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int v[] = new int[2];
        do{
             for(int i=0;i<2;i++)
        {
            v[i] = entrada.nextInt();
        }
             if(v[0]!=0 && v[1]!=0){
                 System.out.println(v[0]*v[1]);
             }
            
        }while(v[0]!=0 && v[1]!=0);
       
        
        
    }
}
