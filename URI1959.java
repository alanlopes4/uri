/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class URI1959 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double x = entrada.nextDouble();
        double y = entrada.nextDouble();
        BigDecimal p = new BigDecimal(x*y);
        System.out.println(p);
    }
}
