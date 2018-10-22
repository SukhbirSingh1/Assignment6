/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author 1794054
 */
public class JavaApplication4 {
    private static Object scanner;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("HOW MANY LINES?" );
        Scanner code = new Scanner(System.in);
        int linenumber;
        linenumber = code.nextInt();
        for(int i=1;i<linenumber;i++){
        for(int j=linenumber;j>i;j--){
        System.out.print(" *");
        }
        System.out.println(" ");
        for(int k=0;k<=i;k++){
        System.out.print(" ");
        }
        
    }
    }
}
