
import java.util.*;
import java.io.*;

public class Task2 {
    public static void main(String[] args) {
        Collection  alpha = new ArrayList<>();

        Random random = new Random();

        for(int i = 0; i < 150; i++) alpha.add(random.nextInt(200) + 1);


        ArrayList arr = new ArrayList<>();
        arr.addAll(alpha);
        Collections.sort(arr, Comparator.reverseOrder());

        Collection betta = new ArrayList<>();
        betta.addAll(arr.subList(0,15));

        System.out.println(betta.toString());
        try(FileWriter output = new FileWriter("Result2.txt", false);){
            output.write(betta.toString());
            output.close();
        }
        catch (IOException ex) { System.out.println(ex.getMessage()); }
    }

    }

