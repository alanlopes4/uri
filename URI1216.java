
package uri;

import java.util.Scanner;


public class URI1216 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int distTotal = 0, dist = -1;
        double amigos = 0;
         while(entrada.hasNext()){
              String amigo = entrada.nextLine();
              amigos++;
              dist = entrada.nextInt();
              distTotal += dist;
              entrada = new Scanner(System.in);
        }
          double distMedia = distTotal/amigos;
          System.out.printf("%.1f\n", distMedia);
    }
}
