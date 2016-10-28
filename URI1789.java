
package uri;

import java.util.Scanner;

public class URI1789 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int n;

	   while(entrada.hasNext()){
		   n = entrada.nextInt();
		   int v[] = new int[n];
		   for(int i=0;i<n;i++){
		       v[i] = entrada.nextInt();
		   }
		       int aux = 0;
		       for(int i=0;i<n;i++){
		               if(v[i]>aux)
		                   aux = v[i];
		       }
		       
		   if(aux>=20){
		       System.out.println(3);
		   }else if(aux>=10 && aux<20){
		       System.out.println(2);
		   }else if(aux<10){
		       System.out.println(1);
		   }
	}

    }
}
