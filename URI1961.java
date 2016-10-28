
package uri;

import java.util.Scanner;

public class URI1961 {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int p = entrada.nextInt();
        int n = entrada.nextInt();
        int v[] = new int[n];
        for(int i=0;i<n;i++){
            v[i] = entrada.nextInt();
        }
        boolean win = true;
        for(int i=0;i<n-1;i++){
            if((v[i+1]-v[i])>p || (v[i]-v[i+1])>p){
                win = false;
            }
            
        }
        if(win){
            System.out.println("YOU WIN");
        }
        else{
            System.out.println("GAME OVER");
        }
    }
}
