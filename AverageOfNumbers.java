/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package averageofnumbers;

/**
 *
 * @author Makhubele 240764986
 */
import java.util.Scanner;
public class AverageOfNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input=new Scanner(System.in);
        int testOne;
        System.out.print("Please enter Test 1 Mark: ");
        testOne=input.nextInt();
        
     
        int testTwo;
        System.out.print("Please enter Test 2 Mark: ");
        testTwo=input.nextInt();
        
     
        int testThree;
        System.out.print("Please enter Test 3 Mark: ");
        testThree=input.nextInt();
        
        int Average= (testOne+testTwo+testThree)/3;
        
        if (Average >= 80 ){
        System.out.println("PASS WITH DISTINCTION");
        
        } else if (Average <=40) {
        System.out.println("FAIL");
        }
        else {
        System.out.println("PASS");
       
    }   
    }
}
