
package uri;

import java.util.Scanner;


public class URI1963 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        
        double aumento = ((b * 100)/a)-100;
        System.out.printf("%.2f", aumento);
        System.out.print("%");
        System.out.println();
        
    }
}
