package com.theironyard.savingprogress;

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

/**
 * Created by sparatan117 on 12/7/16.
 */
public class Gamer {
    private String name;
    private String displayname;
    private String platform;
    private String type;
    private String favorite;
    private String leastfavorite;
    private Scanner input = new Scanner(System.in);

    public Gamer(){}

    public Gamer(String name, String displayname, String platform, String type, String favorite, String leastfavorite) {
        this.name = name;
        this.displayname = displayname;
        this.platform = platform;
        this.type = type;
        this.favorite = favorite;
        this.leastfavorite = leastfavorite;

    }

    public void addGamer(){
        System.out.println("what is your name? ");
        this.name = input.nextLine();
        System.out.println("what is your display name? ");
        this.displayname = input.nextLine();
        System.out.println("what is your preferred platform? ");
        this.platform = input.nextLine();
        System.out.println("what is your favorite type of game? ");
        this.type = input.nextLine();
        System.out.println("what is your favorite game?");
        this.favorite = input.nextLine();
        System.out.println("what is your least favorite game?");
        this.leastfavorite = input.nextLine();
    }

    public void saveGamer() throws IOException {
        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.serialize(this);
        File f = new File("gamers.json");
        FileWriter fw = new FileWriter(f);
        fw.write(json);
        fw.close();
    }

    public static Gamer loadGamer() throws FileNotFoundException {
        File f = new File("gamers.json");
        Scanner scanner = new Scanner(f);
        scanner.useDelimiter("\\Z");
        String contents = scanner.next();

        JsonParser parser = new JsonParser();
        return parser.parse(contents,Gamer.class);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFavorite() {
        return favorite;
    }

    public void setFavorite(String favorite) {
        this.favorite = favorite;
    }

    public String getLeastfavorite() {
        return leastfavorite;
    }

    public void setLeastfavorite(String leastfavorite) {
        this.leastfavorite = leastfavorite;
    }

    @Override
    public String toString(){
        return "name: ~" + getName() + "\ndisplay name: ~" + getDisplayname() +  "\nType of games: ~" + getType()
                +  "\nplatform: ~" + getPlatform() +  "\nfavorite game: ~" + getFavorite()
                +  "\nleast favorite game: ~" + getLeastfavorite();
    }
}
