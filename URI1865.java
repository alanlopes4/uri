
package uri;

import java.util.Scanner;

public class URI1865 {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int quantidade = entrada.nextInt();
        for(int i=0;i<quantidade+1;i++){
            String linha = entrada.nextLine();
            String s[] = linha.split(" ");
            if(!s[0].equals("")){
                if(s[0].equals("Thor")){
                    System.out.println("Y");
                }
                else{
                    System.out.println("N");
                }
             }
        }
        
    }
}
