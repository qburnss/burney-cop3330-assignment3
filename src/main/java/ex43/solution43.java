/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Quentin_Burney
 */
package ex43;


import java.util.Scanner;

public class solution43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String siteName, author, JSFile, CSSFile;

        //website name
        System.out.print("Site name: ");
        siteName = scanner.nextLine();
        //author name
        System.out.print("Author: ");
        author = scanner.nextLine();
        //Prompt for JS File
        System.out.print("Do you want a folder for JavaScript? ");
        JSFile = scanner.nextLine();
        //Prompt for CSS File
        System.out.print("Do you want a folder for CSS? ");
        CSSFile = scanner.nextLine();
        //call generatewebsite class to main
        generatewebsite createWeb = new generatewebsite();

        //initialize variables
        createWeb.siteName = siteName;
        createWeb.author = author;

        //display output
        System.out.println("Created " + createWeb.Website());
        System.out.println("Created " + createWeb.HTML());
        //call and initialize js and css file creation functions
        jsandcssfolders newFile = new jsandcssfolders();
        newFile.JSFolder();
        newFile.CSSFolder();

        //display/create folders if the user prompts for them
        if(JSFile.equals("y"))
            System.out.println("Created " + "./website/" + siteName + newFile.JSFolder());
        if(CSSFile.equals("y"))
            System.out.println("Created " + "./website/" + siteName + newFile.CSSFolder());

    }
}
