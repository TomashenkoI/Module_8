package ua.goit.java;

/**
 * Created by 7 on 20.03.2016.
 */
public class Picture extends File {

    public Picture(String name, double size) {
        this.name = name;
        this.type = "bmp";
        this.size = size;
    }

    public String toString() {
        return "| "+name + "               | "+type+" |  "+ size+" mb |";
    }
}
