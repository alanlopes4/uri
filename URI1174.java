
package uri;

import java.util.Scanner;

public class URI1174 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double a[] = new double[5];
        for(int i=0;i<a.length;i++){
            a[i] = entrada.nextDouble();
        }
        for(int i=0;i<a.length;i++){
            if(a[i]<=10){
                System.out.println("A["+i+"] = "+a[i]);
            }
        }
    }
}
