
package uri;

import java.util.Scanner;


public class URI1015 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double x1 = entrada.nextDouble();
        double y1 = entrada.nextDouble();
        double x2 = entrada.nextDouble();
        double y2 = entrada.nextDouble();
        double dx = Math.pow((x2-x1), 2);
        double dy = Math.pow((y2-y1), 2);
        double distancia = Math.sqrt((dx+dy));
        System.out.printf("%.4f\n", distancia);
    }
}
