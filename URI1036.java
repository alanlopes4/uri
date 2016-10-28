
package uri;

import java.util.Scanner;

public class URI1036 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();
        
        double d = (Math.pow(b, 2)) - (4*a*c);
        if(d>0 && a>0){
            double r1 = (-b + Math.sqrt(d))/(2*a);
            double r2 = (-b - Math.sqrt(d))/(2*a);
            System.out.printf("R1 = %.5f\n",r1);
            System.out.printf("R2 = %.5f\n",r2);
        }else{
            System.out.println("Impossivel calcular");
        }
                
    }
}
