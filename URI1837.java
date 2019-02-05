
package uri;

import java.util.Scanner;

public class URI1837 {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        if(a>b){
            System.out.println(a/b+" "+ a%b);
        }else{
//           a = b × q + r
//            q + r = (a/b);
//            0<=r < Math.abs(b);
        }
    }
}
