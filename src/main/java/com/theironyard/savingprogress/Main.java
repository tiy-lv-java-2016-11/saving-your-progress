package com.theironyard.savingprogress;

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by darionmoore on 12/8/16.
 */
public class Main {
    public static void main(String[] args) throws IOException {

            Scanner input = new Scanner(System.in);
            File file = new File("Hoodie.json");
        try {
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("\\Z");
            String contents = scanner.next();
            JsonParser parser = new JsonParser();
            Hoodie newHoodie = parser.parse(contents, Hoodie.class);
            System.out.println(contents);
        } catch (FileNotFoundException e){
            System.out.println("No such file found, we will have to recreate your hoodie!");
        }
        System.out.println("Would you like to change your selection?");
        boolean run = true;
        String options = input.nextLine();
        while (run) {
            if (options.equalsIgnoreCase("yes")) {
                    Hoodie hoodie = new Hoodie();
                    System.out.println("What size hoodie? \n");
                    hoodie.setSize();
                    System.out.println("What color hoodie?\n");
                    hoodie.setColor();
                    System.out.println("Light or heavy?\n");
                    hoodie.setCategory();
                    System.out.println("Pockets or no pockets?\n");
                    hoodie.setPockets();
                    System.out.println("Drawstring or no Drawstring?\n");
                    hoodie.setDrawstring();
                    JsonSerializer serializer = new JsonSerializer();
                    String json = serializer.serialize(hoodie);
                    FileWriter fw = new FileWriter(file);
                    fw.write(json);
                    System.out.println("Alright then, thank you for your choices! Have a nice day!");
                    fw.close();
                    run = false;
            } else if (options.equalsIgnoreCase("no")) {
                    System.out.println("Alright then, thank you for your choices! Have a nice day!");
                    run = false;


          }
        }

    }


}









//        JsonSerializer serializer = new JsonSerializer();
//        String json = serializer.serialize();
//        File file = new File("Hoodie.json");
//        FileWriter fw = new FileWriter(file);
//        fw.write(json);
//        fw.close();


