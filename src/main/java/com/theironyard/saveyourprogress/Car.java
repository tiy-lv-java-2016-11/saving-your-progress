package com.theironyard.saveyourprogress;

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by melmo on 12/7/16.
 */
public class Car {
    private String make;
    private String model;
    private String year;
    private String color;
    private String miles;

    public Car(){};

    public Car(String make, String model, String year, String color, String miles) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.miles = miles;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMiles() {
        return miles;
    }

    public void setMiles(String miles) {
        this.miles = miles;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", miles=" + miles +
                '}';
    }

    public void saveCar() throws IOException {
        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.serialize(this);

        File f = new File("cars.json");
        FileWriter fw = new FileWriter(f);
        fw.write(json);
        fw.close();
    }

    public static Car loadCar() throws FileNotFoundException {
        File f = new File("cars.json");
        Scanner scanner = new Scanner(f);
        scanner.useDelimiter("\\Z");
        String contents = scanner.next();

        JsonParser parser = new JsonParser();
        return parser.parse(contents, Car.class);
    }

    public static Car inputCar() throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWhat is the make?");
        String make = input.nextLine();
        System.out.println("\nWhat is the model?");
        String model = input.nextLine();
        System.out.println("\nWhat is the year?");
        String year = input.nextLine();
        System.out.println("\nWhat is the color?");
        String color = input.nextLine();
        System.out.println("\nHow many miles does it have?");
        String miles = input.nextLine();
        return new Car(make, model, year, color, miles);
    }

}
