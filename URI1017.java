
package uri;

import java.util.Scanner;

public class URI1017 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int h = entrada.nextInt();
        int v = entrada.nextInt();
        double p = (h*v);
        double l = p/12;
        System.out.printf("%.3f\n", l);
    }
}
