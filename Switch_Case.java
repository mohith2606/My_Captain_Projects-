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
public class Switch_Case {
    public static void main(String[] args){
       int flavour;
       System.out.println("Your Favorite Ice cream :\n1.Chocolate \t2.Butter skotch \t3.Venilla");
       Scanner x = new Scanner(System.in);
       flavour = x.nextInt();
       switch(flavour)
       {
           case 1:System.out.println("You selected Chocolate flavour");
           break;
           case 2:System.out.println("You selected Butter Skotch flavour");
           break;
           case 3:System.out.println("You selected Venilla flavour");
           default:System.out.println("You selected choice is invalid");
       }    
           
    }                 
}       
       


    
    