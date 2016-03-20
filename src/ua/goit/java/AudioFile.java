package ua.goit.java;

/**
 * Created by 7 on 20.03.2016.
 */
public class AudioFile extends File {

    public AudioFile(String name, double size) {
        this.name = name;
        this.type = "mp3";
        this.size = size;
    }

    public String toString() {
        if (name.length() < 20) {
            return "| " + name + "   | " + type + " | " + size + " mb |";
        } else return "| " + name + " | " + type + " |  " + size + " mb |";
    }
}
