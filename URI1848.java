
package uri;

import java.util.Scanner;

public class URI1848 {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int count = 3;
        int soma=0;
        while(count>0){
            String s = entrada.nextLine();
            if(s.equals("caw caw")){
                count--;
                System.out.println(soma);
                soma = 0;
            }
            else if(s.equals("--*")){
                soma +=1;
            }
            else if(s.equals("*--")){
                soma +=4;
            }
            else if(s.equals("-*-")){
                soma +=2;
            }
            else if(s.equals("-*-")){
                soma +=2;
            }
            else if(s.equals("-**")){
                soma +=3;
            }
            else if(s.equals("**-")){
                soma +=6;
            }
            else if(s.equals("***")){
                soma +=7;
            }
            else if(s.equals("---")){
                soma +=0;
            }
        }
    }
}
