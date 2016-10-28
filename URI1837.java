
package uri;

import java.util.Scanner;

public class URI1837 {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        
        int q = a/b;
        int r = a%b;
        if(r>=0 && r<Math.abs(b)){
            System.out.println(q+" "+r);
        }
        else{
            
        }
        
        r = a/b*q;
       
        
            
            
          
      
    }
}
