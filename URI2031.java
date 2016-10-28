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
public class URI2031 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        for(int i=0;i<n;i++){
            String j1 = entrada.next();
            String j2 = entrada.next();
            
            if(j1.equals("ataque") && j2.equals("pedra"))
                System.out.println("Jogador 1 venceu");
            else if(j1.equals("pedra") && j2.equals("ataque"))
                System.out.println("Jogador 2 venceu");
            else if(j1.equals("pedra") && j2.equals("papel"))
                System.out.println("Jogador 1 venceu");
            else if(j1.equals("papel") && j2.equals("pedra"))
                System.out.println("Jogador 2 venceu");
            else if(j1.equals("papel") && j2.equals("ataque"))
                System.out.println("Jogador 2 venceu");
            else if(j1.equals("ataque") && j2.equals("papel"))
                System.out.println("Jogador 1 venceu");
            else if(j1.equals("papel") && j2.equals("papel"))
                System.out.println("Ambos venceram");
            else if(j1.equals("pedra") && j2.equals("pedra"))
                System.out.println("Sem ganhador");
            else if(j1.equals("ataque") && j2.equals("ataque"))
                System.out.println("Aniquilacao mutua");
            
            
                   
        }
    }
}
