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
public class URI1478 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int n = 0, dM = 2, dm = 3;
        do{
            n = entrada.nextInt();
            if(n!=0){
                int m[][] = new int[n][n];
                for(int i=0;i<n;i++){
                    dm = i+1;
                    for(int j=0;j<n;j++){
                        if(i==j){
                            m[i][j]=1;
                        }
                        else if(j>i){
                            m[i][j] = dM++;
                        }
                        else if(i>j){
                           m[i][j] = dm;
                        }
                        dm--;  
                        
                        if(j!=(n-1))
                            System.out.printf("%d  ", m[i][j]);
                        else
                            System.out.printf("%d", m[i][j]);
                    }
                    System.out.println();
                    dM = 2;
                }
                
            }
            
            
        }while(n != 0);
    }
}
