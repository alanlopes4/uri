
package uri;

import java.util.Arrays;
import java.util.Scanner;


public class URI1914 {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        int qt = entrada.nextInt();
        for(int i=0;i<qt;i++){
            String linha = entrada.nextLine();
            String je[]=linha.split(" ");
            entrada = new Scanner(System.in);
            entrada2 = new Scanner(System.in);
            int a=entrada2.nextInt();
            int b=entrada2.nextInt();
            if((a+b)%2==0){
                int p = Arrays.binarySearch(je, "PAR");
                System.out.println(je[p-1]);
            }
            else{
                int p = Arrays.binarySearch(je, "IMPAR");
                System.out.println(je[p-1]);
            }
        }
    }
}
