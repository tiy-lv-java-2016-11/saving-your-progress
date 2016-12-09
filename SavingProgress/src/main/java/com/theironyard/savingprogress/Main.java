package com.theironyard.savingprogress;
import java.util.Scanner;
import java.io.IOException;
/**
 * Created by sparatan117 on 12/7/16.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        Gamer gamer;
        try{
            gamer = Gamer.loadGamer();
            System.out.println(gamer);
            System.out.println("\nWould you like to update the file? y or n?");
            if(input.nextLine().equalsIgnoreCase("y")){
                gamer = new Gamer();
                gamer.addGamer();
                gamer.saveGamer();
            }
        }
        catch (Exception e){
            gamer = new Gamer();
            gamer.addGamer();
        }
    }
}
