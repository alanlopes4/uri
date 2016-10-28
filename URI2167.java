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
public class URI2167 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        int x = 0;
        int v[] = new int[n];
        for(int i=0;i<n;i++){
            v[i] = entrada.nextInt();
        }
        for(int i=0;i<n-1;i++){
            if(v[i+1]<v[i]){
              x = i+2; break;
            }
        }
        System.out.println(x);
    }
}
