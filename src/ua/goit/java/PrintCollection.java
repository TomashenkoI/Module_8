package ua.goit.java;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by 7 on 20.03.2016.
 */
public class PrintCollection {
    public static void main(String[] args) {

        AudioFile audioFile1 = new AudioFile("Smoke on the water", 18.1);
        AudioFile audioFile2 = new AudioFile("Stairway to heaven", 12.3);
        AudioFile audioFile3 = new AudioFile("Nothing else matters", 9.6);
        Picture picture1 = new Picture("photo1", 4.9);
        Picture picture2 = new Picture("photo2", 5.3);
        TextFile textFile1 = new TextFile("referat", 2.98);

        ArrayList<File> direction = new ArrayList<>();
        direction.add(audioFile1);
        direction.add(audioFile2);
        direction.add(audioFile3);
        direction.add(picture1);
        direction.add(picture2);
        direction.add(textFile1);

        ArrayList<AudioFile> MyMusic = new ArrayList<>();
        MyMusic.add(audioFile1);
        MyMusic.add(audioFile2);
        MyMusic.add(audioFile3);

        System.out.println();
        System.out.println("Files in the direction");
        System.out.println("________________________________________");
        System.out.println("| Name                 | type | size   |");
        for (File d : direction) {
            System.out.println("________________________________________");
            System.out.println(d);
        }
        System.out.println("________________________________________");
    }
}


