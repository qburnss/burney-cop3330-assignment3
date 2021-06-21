/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Quentin_Burney
 */
package ex41;



import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


public class solution41
{
    public static void main(String[] args) throws IOException {
        //Have filepath directed from text file placed inside of the same package
        String filePath = "C:\\Users\\18137\\IdeaProjects\\burney-cop3330-ex0\\burney-cop3330-assignment3\\src\\main\\java\\ex41\\exercise41_input.txt";
        //Read the Strings of names from the text file directed towards
        ArrayList<String> inputList = ReadNameList.read(filePath);
        //Have the file strings assorted into alphabetical order
        Collections.sort(inputList);
        //Display formatting to match requested assignment output
        System.out.println("Total of " + inputList.size() +  " names\n------------\n");
        //for loop to stop reading after the list of names in completed and display those names
        for (int i = 0; i < inputList.size(); i++) {
            System.out.println(inputList.get(i));
        }
        //This method writes the output into a folder in the target package...
        /*BufferedWriter writer = new BufferedWriter(new FileWriter(String.valueOf(inputList)));
        writer.write("Total of " + inputList.size() + " names\n-----------------\n");
        for(int i = 0; i < inputList.size(); i++)
            writer.write(inputList.get(i) + "\n");
        writer.close();*/
    }
}
