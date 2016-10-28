
package uri;

import java.util.Scanner;

public class URI1933 {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();
        int b= entrada.nextInt();
        
        if(a==b){
            System.out.println(a);
        }
        else if(a > b){
            System.out.println(a);
        }
        else if(b > a){
            System.out.println(b);
        }
    }
}
