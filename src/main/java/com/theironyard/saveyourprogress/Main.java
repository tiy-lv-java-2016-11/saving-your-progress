package com.theironyard.saveyourprogress;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by melmo on 12/7/16.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        try {
            Car car = Car.loadCar();
            System.out.println(car);
            System.out.println("\nWould you like to update this info? Y/N");
            if(input.nextLine().equalsIgnoreCase("y")){
                car = Car.inputCar();
                car.saveCar();
            }
        }
        catch (Exception e){
            Car car = Car.inputCar();
            car.saveCar();
        }


    }


}
