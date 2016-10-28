
package uri;

import java.util.Scanner;


public class URI1138 {
    
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
   int x,y;
    int n0=0,n1=0,n2=0,n3=0,n4=0,n5=0,n6=0,n7=0,n8=0,n9=0;
    do{
    
       x = entrada.nextInt();
       y = entrada.nextInt();
     if(x!=0 && y!=0){
         for(int i=x;i<=y;i++){
             String numero = ""+i;
             for(int k=0;k<numero.length();k++){
                     String digito =""+ numero.charAt(k);
                     
                     
                 if(digito.equals("0")){
                    n0++;
                 }
                 else if(digito.equals("1")){
                     n1++;
                    
                 }
                 else if(digito.equals("2")){
                     n2++;
                    
                 }
                 else if(digito.equals("3")){
                     n3++;
                    
                 }
                 else if(digito.equals("4")){
                     n4++;
                    
                 }
                 else if(digito.equals("5")){
                    n5++;
                    
                 }
                 else if(digito.equals("6")){
                     n6++;
                    
                 }
                 else if(digito.equals("7")){
                     n7++;
                    
                 }
                 else if(digito.equals("8")){
                     n8++;
                    
                 }
                 else if(digito.equals("9")){
                     n9++;
                    
                 }
                 
             }
             
             
         }
         
                 System.out.printf("%d %d %d %d %d %d %d %d %d %d",n0,n1,n2,n3,n4,n5,n6,n7,n8,n9);
             
             System.out.println();
             n0=0;n1=0;n2=0;n3=0;n4=0;n5=0;n6=0;n7=0;n8=0;n9=0;
         
     }
     
    }while(x!=0 && y!=0);
    
    }

}
