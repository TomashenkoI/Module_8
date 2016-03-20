package ua.goit.java;

/**
 * Created by 7 on 20.03.2016.
 */
public class TextFile extends File {

    public TextFile(String name, double size) {
        this.name = name;
        this.type = "doc";
        this.size = size;
    }

    public String toString() {
        return "| " + name + "              | " + type + " | " + size + " mb |";
    }
}
