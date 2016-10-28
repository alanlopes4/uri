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
public class URI2165 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String t = entrada.nextLine();
        if(t.length()<=140)
            System.out.println("TWEET");
        else
            System.out.println("MUTE");
    }
}
