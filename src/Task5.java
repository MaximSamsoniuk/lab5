import java.nio.file.*;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import java.text.*;

public class Task5 {
    public static void main(String[] args) throws Throwable {
        System.out.print("filename: ");
        String filename = new Scanner(System.in).nextLine();

        Files.readAllLines(new File(filename).toPath())
                .stream()
                .flatMap(line ->
                        Stream.of(line.toLowerCase().split("\\s+"))
                                .filter(w -> !w.isEmpty())
                )
                .sorted(Collator.getInstance(new Locale("uk", "UA")))
                .forEach(System.out::println);
    }
}
