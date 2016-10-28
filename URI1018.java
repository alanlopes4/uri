
package uri;

import java.util.Scanner;

public class URI1018 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int c = entrada.nextInt();
        int n = c;
        int q1=0, q2=0,q3=0,q4=0,q5=0,q6=0,q7=0;
        if(c>=100){
            q1 = c/100;
            c %=100;
        }if(c<100 && c>=50){
            q2 = c/50;
            c %=50;
        } if(c<50 && c>=20){
            q3 = c/20;
            c %=20;
        } if(c<20 && c>=10){
            q4 = c/10;
            c %=10;
        } if(c<10 && c>=5){
            q5 = c/5;
            c %=5;
        } if(c<5 && c>=2){
            q6 = c/2;
            c %=2;
        } if(c<2 && c>=1){
            q7 = c/1;
            c %=1;
        }
        System.out.println(n);
        System.out.println(q1+" nota(s) de R$ 100,00");
        System.out.println(q2+" nota(s) de R$ 50,00");
        System.out.println(q3+" nota(s) de R$ 20,00");
        System.out.println(q4+" nota(s) de R$ 10,00");
        System.out.println(q5+" nota(s) de R$ 5,00");
        System.out.println(q6+" nota(s) de R$ 2,00");
        System.out.println(q7+" nota(s) de R$ 1,00");
    }
}
