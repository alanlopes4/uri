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
public class URI1176 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int n, f;
        long fib[] = new long[61];
        n = entrada.nextInt();
    
        fib[0] = 0;
        fib[1] = 1;
        for(int j = 2; j <= 60; j++){
                fib[j] = fib[j-2] + fib[j-1];
        }

        for(int i = 0; i < n; i++){
                f = entrada.nextInt();
                System.out.printf("Fib(%d) = %d\n", f, fib[f]);
        }
    }
}
