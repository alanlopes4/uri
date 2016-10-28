
package uri;

import java.io.IOException;
import java.util.Scanner;


public class URI {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
        int quantidade = entrada.nextInt();
        for(int vezes=0;vezes<quantidade;vezes++){
        String formula = entrada.next();
        String digito="",operacao="";
        int count=0;
        int numeros[] = new int[2];
        for(int i=0;i<formula.length();i++){
            Character a = formula.charAt(i);
            if(Character.isLetter(a)){
                numeros[0] = Integer.parseInt(digito);
                digito="";
                if(Character.isUpperCase(a)){
                    operacao="sub";
                }
                else{
                    operacao="soma";
                }
            }
            else if(Character.isDigit(a)){
                     digito +=a; 

                    }
        }
        numeros[1]=Integer.parseInt(digito);
        
        if(numeros[0]==numeros[1]){
            operacao="mult";
        }
   
 
        if(operacao.equals("sub")){
            System.out.println(numeros[1]-numeros[0]);
        }
        else if(operacao.equals("soma")){
            System.out.println(numeros[1]+numeros[0]);

        }
        else if(operacao.equals("mult")){
             System.out.println(numeros[0]*numeros[1]);

        }
        
        
    }
    }
    
}
