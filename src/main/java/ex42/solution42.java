/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Quentin_Burney
 */
package ex42;

import java.util.ArrayList;
import java.util.List;
import static ex42.ReadNameAndSalaryFile.ReadNAndSFile;

public class solution42 {
    public static void main(String[] args) {
        //import each list from ReadNameAndSalaryFile
        //Last Names
        List<String> Last = new ArrayList<>();
        //First Names
        List<String> First = new ArrayList<>();
        //Salary amounts
        List<Integer> Salary = new ArrayList<>();
        //Call class method
        ReadNAndSFile(Last,First,Salary);
        //Output formatting
        System.out.println("      Last       First    Salary\n-------------------------------");
        //loop to read each string to the end of text file
        for(int i = 0; i < Last.size(); i++){
            //String format needed to correctly space out each string/integer from another
           System.out.println(String.format("%10s %10s %10s \r",Last.get(i),First.get(i),Salary.get(i)));

           //System.out.println(Last.get(i) + "      " + First.get(i) + "        " + Salary.get(i) );
        }


    }
}
