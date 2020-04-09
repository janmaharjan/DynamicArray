/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4;

/**
 *
 * @author Maharjan
 */
public class Day4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic heretr
        try{
        int[] data={1,2,5,7};
        int[] neww={4,3,4,5};
        int length=(data.length+neww.length);
        
        int[] temp = new int[data.length+neww.length];
        for(int i=0;i<length;i++)
        {
            if(i<=(data.length-1))
            {
            temp[i]=data[i];
                System.out.println(i);
            }
            else
            {
                temp[i]=neww[i-data.length];
                System.out.println(i);
            }
        } 
        for(int j=0;j<(data.length+neww.length);j++)
        {
            System.out.println(temp[j]);
        }}
    catch(Exception e)
    {
        
    }
    }}

    
