
package uri;

import java.util.Scanner;

public class URI1061 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String l1 = entrada.nextLine();
        String l2 = entrada.nextLine();
        String l3 = entrada.nextLine();
        String l4 = entrada.nextLine();
        
        String dia1[] = l1.split(" ");
        String tempo1[] = l2.split(" : ");
        int d1 = Integer.parseInt(dia1[1]);
        int h1 = Integer.parseInt(tempo1[0]);
        int m1 = Integer.parseInt(tempo1[1]);
        int s1 = Integer.parseInt(tempo1[2]);
        
        String dia2[] = l3.split(" ");
        String tempo2[] = l4.split(" : ");
        int d2 = Integer.parseInt(dia2[1]);
        int h2 = Integer.parseInt(tempo2[0]);
        int m2 = Integer.parseInt(tempo2[1]);
        int s2 = Integer.parseInt(tempo2[2]);
        
        int tds = 0;
        int dd = 0;
        int tts1 = 0;
        int tts2 = 0;
        int tdias = 0;
        int thoras = 0;
        int tminutos = 0;
        int tsegundos = 0;
         //total de tempo do dia 1 convertido para segundos
        tts1 = (((h1*60)+m1)*60)+s1;
        //total do tempo do dia 2 convertido para segundos
        tts2 = (((h2*60)+m2)*60)+s2;
        
        if(d1<d2 || d1==d2){
            dd = (d2-d1)*24*60*60;
            tds = dd-tts1+tts2;
            tdias = (tds/(24*60*60));
            thoras = tds-(tdias*24*60*60);
            thoras /= (60*60); 
            tminutos = ((tds-(tdias*24*60*60))%(60*60))/60;
            tsegundos = ((tds-(tdias*24*60*60))%(60));
            System.out.println(tdias+" dia(s)");
            System.out.println(thoras+" hora(s)");
            System.out.println(tminutos+" minuto(s)");
            System.out.println(tsegundos+" segundo(s)");
        }
       
    }
}
