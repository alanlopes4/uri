
package uri;

import java.util.Scanner;


public class URI1984 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        long a = entrada.nextLong();
        String n =""+a;
        String n2 = "";
        for(int i=n.length()-1;i>=0;i--){
            n2 +=n.charAt(i);
        }
        System.out.println(n2);
    }
}
