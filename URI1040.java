
package uri;

import java.util.Scanner;


public class URI1040 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double n1 = entrada.nextDouble();
        double n2 = entrada.nextDouble();
        double n3 = entrada.nextDouble();
        double n4 = entrada.nextDouble();
        
        double m1 = ((n1*2) + (n2*3) + (n3*4) + n4)/10;
        System.out.printf("Media: %.1f\n", m1);
        if(m1>=7){
            System.out.println("Aluno aprovado.");
        }else if(m1<5){
            System.out.println("Aluno reprovado.");
        }else if(m1>=5 && m1<=6.9){
            System.out.println("Aluno em exame.");
            double n5 = entrada.nextDouble();
            System.out.printf("Nota do exame: "+n5);
            double m2 = (m1 +n5)/2;
            if(m2>=5){
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f\n", m2);
            }else{
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f\n", m2);
            }
        }
    }
}
