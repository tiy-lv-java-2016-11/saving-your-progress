package com.theironyard.savingprogress;

import com.theironyard.savingprogress.Question;
import jodd.json.JsonParser;
import jodd.json.JsonSerializer;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by darionmoore on 12/7/16.
 */
public class ReadWriteQuestion {
    public static void main(String[] args) throws IOException {
        User user = new User();
        Question question = new Question();
        File newQ = new File("com.theironyard.savingprogress.Question.json");


        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.serialize(User.class);
        FileWriter fw = new FileWriter(newQ);
        fw.write(json);
        fw.close();

        Scanner scanner = new Scanner(newQ);
        Scanner input = new Scanner(System.in);
        scanner.useDelimiter("\\Z");
        String contents = scanner.next();
        JsonParser parser = new JsonParser();
        User user1 = parser.parse(contents, User.class);

        System.out.println(User.class);
    }
}
