package com.theironyard.savingprogress;

import java.util.Scanner;

/**
 * Created by darionmoore on 12/8/16.
 */
public class Hoodie {
    private String size;
    private String color;
    private String category;
    private String pockets;
    private String drawstring;
    private Scanner input = new Scanner(System.in);

    public Hoodie(){

    }

    public Hoodie(String size, String color, String category, String pockets, String drawstring){
        this.size = size;
        this.color = color;
        this.category = category;
        this.pockets = pockets;
        this.drawstring = pockets;
    }

    public String getSize() {
        return size;
    }

    public void setSize() {
        this.size = input.nextLine();
    }

    public String getColor() {
        return color;
    }

    public void setColor() {
        this.color = input.nextLine();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory() {
        this.category = input.nextLine();
    }

    public String isPockets() {
        return pockets;
    }

    public void setPockets() {
        this.pockets = input.nextLine();
    }

    public String isDrawstring() {
        return drawstring;
    }

    public void setDrawstring() {
          this.drawstring = input.nextLine();
    }



}
