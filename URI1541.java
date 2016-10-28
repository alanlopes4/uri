package uri;

import java.util.Scanner;

public class URI1541 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int a = 0;
        do {
            a = entrada.nextInt();
            if(a==0)
            break;
            int b = entrada.nextInt();
            int c = entrada.nextInt();
            
            int casa = a*b;
            int terreno = 0;
            double lado = 0;
            while(terreno<casa){
                terreno = (int)(Math.pow(lado, 2)*c)/100;
                lado = lado+0.1;
            }
            int resultado = (int) lado;
            System.out.println(resultado);
            terreno =0; lado = 0;
        }while(a!=0);
    }
}
