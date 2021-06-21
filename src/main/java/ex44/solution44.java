/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Quentin_Burney
 */
package ex44;



import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;


public class solution44 {
    public static void main(String[] args) {
        //Read file
        String filePath = "C:\\Users\\18137\\IdeaProjects\\burney-cop3330-ex0\\burney-cop3330-assignment3\\src\\main\\java\\ex44\\exercise44_input.json";
        //introduce scanner for user input
        Scanner scanner = new Scanner(System.in);
        String in;
        //boolean to run while loop
        boolean found = false;
        //read file
        ArrayList<Map<String, Object>> array =jsonProducts.winspect(filePath);
        //While loop
        while(!found){
            //prompt user
            System.out.print("Enter a product name: ");
            //string asking for name of product and will be matched and inc price and quantity
            String name = scanner.nextLine();
            //search array of json parsed data and match
            in = jsonProducts.winsight(array, name);
            //print results
            System.out.println(in);
        }

    }
}
