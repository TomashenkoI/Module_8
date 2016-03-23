package ua.goit.java;

import java.util.Comparator;

/**
 * Created by 7 on 20.03.2016.
 */
public class File {

    String name;
    String type;
    double size;

    public double getSize() {
        return size;
    }

    // comparator
//    public static class CompSize implements Comparator<File> {
//        @Override
//        public int compare(File arg0, File arg1) {
//            return (int) (arg0.size - arg1.size);
//        }
//    }



}
