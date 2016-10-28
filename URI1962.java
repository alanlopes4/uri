package uri;

import java.util.Scanner;


public class URI1962 {
    
    public static void main(String[] args){
         Scanner entrada = new Scanner(System.in);
    int n = entrada.nextInt();
    for(int i=0;i<n;i++){
        int t = entrada.nextInt();
        int resultado = 2015 - t;
        if(resultado<0 || resultado == 0){
            System.out.println(Math.abs(resultado-1)+ " A.C.");
        }
        else{
            System.out.println(resultado + " D.C.");
        }
    }
    }
   
}
