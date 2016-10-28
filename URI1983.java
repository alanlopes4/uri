
package uri;

import java.util.Scanner;
import java.util.Arrays;

public class URI1983 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int q = entrada.nextInt();
        int p[] = new int[q];
        double n[] = new double[q];
        for(int i=0;i<q;i++){
            p[i] = entrada.nextInt();
            n[i] = entrada.nextDouble();
        }
        double n2[] = n;
        Arrays.sort(n2);
        
        if(n2[q-1]>=8){
          int posicao = Arrays.binarySearch(n, n2[q-1]);
          System.out.println(p[posicao-1]);
        }else{
          System.out.println("Minimum note not reached");
        }
    }
}
