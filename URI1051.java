
package uri;

import java.util.Scanner;

public class URI1051 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double v = entrada.nextDouble();
        double resultado = 0;
        double resto = 0 ;
        if(v>4500){
             resto =v - 4500;
             v=4500;
             resultado = (resto*28)/100;
        }if(v>3000 && v<=4500){
             resto =v - 3000;
             v=3000;
             resultado += ((resto*18)/100);
        }if(v>2000 && v<=3000){
            resto = v - 2000;
            resultado += ((resto*8)/100);
            System.out.printf("R$ %.2f\n", resultado);
        }if(v>=0 && v<=2000){
            System.out.println("Isento");
        } 

    }
}
