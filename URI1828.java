
package uri;

import java.util.Scanner;


public class URI1828 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int t = entrada.nextInt();
        for(int i=1;i<=t;i++){
            String partida = entrada.nextLine();
            String mao[] = partida.split(" ");
            if(mao[0].equals(""+mao[1])){
                System.out.println("Caso #"+i+": De novo!");
            }else{
                if(mao[0].equals("tesoura") && (mao[1].equals("papel") || mao[1].equals("lagarto"))){
                    System.out.println("Caso #"+i+": Bazinga!");
                }else if(mao[0].equals("papel") && (mao[1].equals("pedra") || mao[1].equals("Spock"))){
                    System.out.println("Caso #"+i+": Bazinga!");
                }else if(mao[0].equals("pedra") && (mao[1].equals("lagarto") || mao[1].equals("tesoura"))){
                    System.out.println("Caso #"+i+": Bazinga!");
                }else if(mao[0].equals("lagarto") && (mao[1].equals("papel") || mao[1].equals("Spock"))){
                    System.out.println("Caso #"+i+": Bazinga!");
                }else if(mao[0].equals("Spock") && (mao[1].equals("tesoura") || mao[1].equals("pedra"))){
                    System.out.println("Caso #"+i+": Bazinga!");
                }else{
                    System.out.println("Caso #"+i+": Raj trapaceou!");
                }
            }
        }
    }
}
