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
public class URI2059 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int v[] = new int[5];
        for(int i=0; i<5; i++){
            v[i] = entrada.nextInt();
        }
        if(v[0] == 1){
            if((v[1]+v[2])%2==0){
                if(v[3] == 1){
                    if(v[4] == 1){
                       System.out.println("Jogador 2 ganha!");
                    }else{
                       System.out.println("Jogador 1 ganha!"); 
                    }
                }else{
                    if(v[4] == 1){
                       System.out.println("Jogador 1 ganha!"); 
                    }else{
                       System.out.println("Jogador 1 ganha!");
                    }
                }
            }else{
                if(v[3] == 1){
                    if(v[4] == 1){
                       System.out.println("Jogador 2 ganha!");
                    }else{
                       System.out.println("Jogador 1 ganha!"); 
                    }
                }else{
                    if(v[4] == 1){
                       System.out.println("Jogador 1 ganha!"); 
                    }else{
                       System.out.println("Jogador 2 ganha!");
                    }
                }
            }
            
        }else{
             if((v[1]+v[2])%2!=0){
                if(v[3] == 1){
                    if(v[4] == 1){
                       System.out.println("Jogador 2 ganha!");
                    }else{
                       System.out.println("Jogador 1 ganha!"); 
                    }
                }else{
                    if(v[4] == 1){
                       System.out.println("Jogador 1 ganha!"); 
                    }else{
                       System.out.println("Jogador 1 ganha!");
                    }
                }
            }else{
                if(v[3] == 1){
                    if(v[4] == 1){
                       System.out.println("Jogador 2 ganha!");
                    }else{
                       System.out.println("Jogador 1 ganha!"); 
                    }
                }else{
                    if(v[4] == 1){
                       System.out.println("Jogador 1 ganha!"); 
                    }else{
                       System.out.println("Jogador 2 ganha!");
                    }
                }
            }
        }
        
    
    }
}
