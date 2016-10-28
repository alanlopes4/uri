
package uri;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class URI1179 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int im[] = new int[5];
        int pa[] = new int[5];
        int ic = 0, pc = 0;
        for(int i=0;i<15;i++){
            int v = entrada.nextInt();
            if(v%2==0){
                pa[pc] = v;
                pc++;
            }else{
                im[ic] = v;
                ic++;
            }
            if(pc==5){
            for(int x=0;x<5;x++){
                System.out.println("par["+x+"] = "+pa[x]);
               
            }
                 pc=0;
                 pa = new int[5];
            }       
            if(ic==5){
                
            for(int x=0;x<5;x++){
                System.out.println("impar["+x+"] = "+im[x]);
               
            }
                ic=0;
                im = new int[5];     }
            
        }
        for(int i=0;i<im.length;i++){
            if(im[i]!=0)
            System.out.println("impar["+i+"] = "+im[i]);
        }
         for(int i=0;i<pa.length;i++){
            if(pa[i]!=0)
            System.out.println("par["+i+"] = "+pa[i]);
        }
    }
}
