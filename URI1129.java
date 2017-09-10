
package uri;

import java.util.Scanner;


public class URI1129 {
    public static void main(String[] agrs){
        Scanner entrada = new Scanner(System.in);
        int n,a,b,c,d,e;
        String correta =  "";
        do {
            n = entrada.nextInt();
            for(int i=0;i<n;i++){
                int total =0;
                a = entrada.nextInt();
                b = entrada.nextInt();
                c = entrada.nextInt();
                d = entrada.nextInt();
                e = entrada.nextInt();
                
                if(a <= 127){
                    correta = "A";
                    total++;
                }
                    
                if(b <= 127){
                    correta = "B";
                    total++;
                }
                    
                if(c <= 127){
                    correta = "C";
                    total++;
                }
                    
                if(d <= 127){
                    correta = "D";
                    total++;
                }
                    
                if(e <= 127){
                     correta = "E";
                     total++;
                }
                
                if(total ==1){
                    System.out.println(correta);
                }else{
                    System.out.println("*");
                }
            }
    
        }while(n != 0);
    }
        
}
