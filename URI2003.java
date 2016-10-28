
package uri;

import java.util.Scanner;


public class URI2003 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        while(entrada.hasNext()){
            String t1 = entrada.nextLine();
            String h1[] = t1.split(":");
            int min = (Integer.parseInt(h1[0]) * 60) + Integer.parseInt(h1[1]);
            int atraso =(8*60);
            if((min +60) > atraso){
                System.out.println("Atraso maximo:"+((min +60)-atraso));
            }else{
                System.out.println("Atraso maximo:"+0);
            }
        } 
    }
}
