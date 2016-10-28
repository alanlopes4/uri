
package uri;

import java.util.Scanner;

public class URI1864 {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String citacao = "LIFE IS NOT A PROBLEM TO BE SOLVED";
        int a= entrada.nextInt();
        String novo = "";
        for(int i=0;i<a;i++){
            novo=novo+""+citacao.charAt(i);
        }
        System.out.println(novo);
    }
}
