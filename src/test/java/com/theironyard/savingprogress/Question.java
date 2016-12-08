package com.theironyard.savingprogress;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

public class Question {
    public static void main(String[] args) throws IOException {
        File question = new File("question.txt");
        FileWriter fw = new FileWriter(question);
        fw.write("Were you satisfied with your most recent customer service experience?\n%s");
        fw.append("If not, what could we do to make the next time a more enjoyable experience?\n");
        fw.append("If so, what's one thing about your experience that was particularly memorable?\n ");
        fw.append("What can we do as a company to improve your next visit with us?\n");
        fw.append("Would you recommend our services to a friend or family member?\n");
        fw.close();
        JsonSerializer serializer = new JsonSerializer();

        Scanner scanner = new Scanner(question);
        scanner.useDelimiter("\\Z");
        String survey = scanner.next();
        System.out.println(survey);




    }





}
