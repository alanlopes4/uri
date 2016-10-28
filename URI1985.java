
package uri;

import java.util.Scanner;

public class URI1985 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        double t = 0;
        for(int i=0;i<n;i++){
            int p = entrada.nextInt();
            int q = entrada.nextInt();
            if(p == 1001){
                t+=(1.5*q);
            }else if( p == 1002){
                t+=(2.5*q);
            }else if( p == 1003){
                t+=(3.5*q);
            }else if( p == 1004){
                t+=(4.5*q);
            }else if( p == 1005){
                t+=(5.5*q);
            }
        }
        System.out.printf("%.2f\n", t);
    }
}
