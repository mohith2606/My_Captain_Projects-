/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_captain_java;

/**
 *
 * @author MOHITH
 */
public class Matrix_Addition_multiplication {
    public static void main(String agrs[]){
    int a[][]={{1,3,4},{2,4,3},{3,4,5}};
    int b[][]={{1,3,4},{2,4,3},{1,2,4}};
    int d[][]=new int[3][3];
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                d[i][j]=a[i][j]+b[i][j];
                System.out.print(d[i][j]+" ");
            }
            System.out.println();
            }
        System.out.println("Thus this is the sum of the given input");
    int c[][]=new int[3][3];
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
        c[i][j]=0;
        for(int k=0;k<3;k++)
        {
            c[i][j]+=a[i][k]*b[k][j];
        }
        System.out.print(c[i][j]+" ");
        }
        System.out.println();
        }
        System.out.println("Thus this is the product of the given input");
        
        
    }}    
    
    

