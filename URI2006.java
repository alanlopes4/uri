
package uri;

import java.util.Scanner;


public class URI2006 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int t= entrada.nextInt();
        int p[] = new int[5];
        int tt=0;
        for(int i=0;i<5;i++){
            p[i] = entrada.nextInt();
        }
        for(int i=0;i<5;i++){
            if(p[i] == t){
                tt++;
            }
        }
        System.out.println(tt);
    }
}
