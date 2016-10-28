/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class URI2163 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int v[] = new int[2];
        int x = 0,y = 0;
        for(int i=0;i<2;i++){
            v[i] = entrada.nextInt();
        }
        int m[][] = new int[v[0]][v[1]];
        for(int i=0;i<v[0];i++){
            for(int j=0;j<v[1];j++){
                m[i][j] = entrada.nextInt();
            }
        }
        for(int i=0;i<v[0];i++){
            for(int j=0;j<v[1];j++){
                if(m[i][j] == 42 && i>=1 && j>=1 && i<(v[0]-1) && j<(v[1]-1)){
                    if(m[i-1][j-1] == 7 && m[i-1][j] == 7 && m[i-1][j+1] == 7 &&
                            m[i][j-1] == 7 && m[i][j+1] == 7 &&
                            m[i+1][j-1] == 7 && m[i+1][j] == 7 && m[i+1][j+1] == 7){
                        x=i+1; y=j+1;
                        break;
                    }
                }
            }
            if(x!=0 && y!=0)
                break;
        }
        System.out.printf("%d %d\n", x,y);
    }
}
