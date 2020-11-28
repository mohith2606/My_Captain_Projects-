/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_captain_java;

import java.util.Scanner;

/**
 *
 * @author MOHITH
 */
public class Minutes_Convertor {
    public static void main(String[] args){
        Scanner x = new Scanner (System.in);
        System.out.println("Enter No/of Minutes :");
        int y = (int) x.nextDouble();
        long years = (long)(y/(60*24*365));
        long days = (long)(y/60/24)%365;
        System.out.println(y +" minutes is approximately "+ years +" years and "+ days +" days ");
        
        
        
    }
}
