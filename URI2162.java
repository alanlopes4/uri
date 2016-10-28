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
public class URI2162 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        int v[] = new int[n];
        int qm =0, qM = 0;
        boolean np = false;
        for(int i=0;i<n;i++){
            v[i] = entrada.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(i!=j){
                    if(v[i]==v[j]){
                        np = true;
                    }
                    if(v[i]<v[j]){
                        qm+=1;
                        qM=0;
                        if(qm>1)
                            np=true;
                        
                        break;
                    }else{
                        qM+=1;
                        qm=0;
                        if(qM>1)
                            np=true;
                        break;
                    }
                }
            }
        }
        if(np)
            System.out.println(0);
        else
            System.out.println(1);
        
    }
}
