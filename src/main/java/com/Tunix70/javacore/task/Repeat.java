package main.java.com.Tunix70.javacore.task;

import java.util.Set;
import java.util.TreeSet;

public class Repeat {

    public static boolean repeadNumber(int[]num){
        Set<Integer> numbers = new TreeSet<>();
        for (int i = 0; i <num.length; i++) {
            if(!numbers.add(num[i]))
                break;
        }
        return false;
    }

    public static void main(String[] args) {
        int[]num = {4, 5, 5, 6, 6, 8, 8};
        repeadNumber(num);
    }
}
