
package uri;

import java.util.Scanner;


public class URI1216 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int distTotal = 0, dist;
        String amigo, dist2;
        double amigos = 0;
         while(entrada.hasNext()){
              amigo = entrada.nextLine();
              amigos++;
              dist2 = entrada.nextLine();
              distTotal += Integer.parseInt(dist2);
        }
          double distMedia = distTotal/amigos;
          System.out.printf("%.1f\n", distMedia);
    }
}
