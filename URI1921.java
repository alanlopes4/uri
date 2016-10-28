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
public class URI1921 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();
        int resultado = (a-3);
        for(int i=(a-3);i>0;i--){
            resultado += i; 
        }
        if(resultado<0)
           resultado=0;
       
        System.out.println(resultado);
                
    }
}
