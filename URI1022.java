
package uri;

import java.util.Scanner;

public class URI1022 {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        entrada.nextLine();
        int  numerador = 0, denominador = 0, na = 0, da = 0;
        int num[] = new int[4];
        for(int i=0;i<n;i++){
            String exp = entrada.nextLine();
            String p[] = exp.split("[\\W][ ]");
            num[0] = Integer.parseInt(p[0].trim());
            num[1] = Integer.parseInt(p[1].trim());
            num[2] = Integer.parseInt(p[2].trim());
            num[3] = Integer.parseInt(p[3].trim());
            
            
            if(exp.contains("+")){
                numerador = (num[0]*num[3] + num[2]*num[1]); denominador =  (num[1]*num[3]);
            }
            else if(exp.contains("-")){
                numerador = (num[0]*num[3] - num[2]*num[1]); denominador =  (num[1]*num[3]);
            }
            else if(exp.contains("*")){
                numerador = num[0]*num[2]; denominador =  (num[1]*num[3]);
            }
            else{
                numerador = num[0]*num[3]; denominador = num[2]*num[1];
            }
            na = numerador; da = denominador;
            
                int resto;  
                while (da != 0) {  
                    resto = na % da;  
                    na = da;  
                    da = resto;  
                }  
            
                System.out.printf("%d/%d = %d/%d\n",numerador, denominador, (numerador/na), (denominador/na));
                
        }
    }
}
