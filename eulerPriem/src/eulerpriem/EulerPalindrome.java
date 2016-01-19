/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eulerpriem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author delano
 */
public class EulerPalindrome {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       boolean run = true;
       int a = 999;
       int b = 999;
       List palins = new ArrayList();
       
       while(run){    
           if(IsPalin(a, b) == true && a != 0){
               palins.add(a * b);
               a--;
           }
           else if(a != 0) a--;
           else if(a == 0 && b != 0){ b--; a = 999;}
           else if (a == 0 && b == 0){ 
            System.out.println(Collections.max(palins));
            break;
           }
       }
    }

    private static boolean IsPalin(int a, int b) {
        int posPal = a * b;
        String num = Integer.toString(posPal);
        StringBuilder rev = new StringBuilder();
        rev.append(num);
        rev.reverse();
        
        String reversed = rev.toString();
        
        if(num.equals(reversed))return true;
        else return false;
    }     
}
    
    

