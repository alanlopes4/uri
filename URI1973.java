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
public class URI1973 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        int v[] = new int[n];
        int c = 0, total = 0, a = 0;
        for(int i=0;i<n;i++){
            v[i] = entrada.nextInt();
            total += v[i];
        }
        int i = 0;
        while(a<n){
           if(v[i]%2!=0){
                c++; i++; a++;
            }else{
                c++; i--;
            }
        }
        
        System.out.println(total - c);
    }
}
