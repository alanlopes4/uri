
package uri;

import java.util.Scanner;

public class URI1866 {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int q = entrada.nextInt();
        for(int i=0;i<q;i++){
           int n = entrada.nextInt();
            if(n%2==0){
                System.out.println("0");
            }
            else {
                System.out.println("1");
            }
        }
    }
}
