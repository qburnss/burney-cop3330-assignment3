/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Quentin_Burney
 */
package ex45;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class solution45 {
    public static void main(String[] args) {
        String prompt = null;
        File inputFile = new File("C:\\Users\\18137\\IdeaProjects\\burney-cop3330-ex0\\burney-cop3330-assignment3\\src\\main\\java\\ex45\\exercise45_input.txt");
        //read input file
        try {
            prompt = Files.readString(inputFile.toPath());
        } catch (IOException q) {
            q.printStackTrace();
        }
        //replace utilize with use
        String output = prompt.replace("utilize", "use");
        //create file and output
        File outputFile = new File("C:\\Users\\18137\\IdeaProjects\\burney-cop3330-ex0\\burney-cop3330-assignment3\\src\\main\\java\\ex45\\exercise45_output.txt");
        try {
            FileWriter myWriter = new FileWriter(outputFile);
            myWriter.write(output);
            myWriter.close();
        }
        catch (Exception q)
        {
            System.out.print("Error.");
        }
    }

    }


