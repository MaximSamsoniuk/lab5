import java.util.*;
import java.io.*;
public class Task1
{
    public static void main(String[] args) {


    ArrayList<Integer> array = new ArrayList<>();
    LinkedList<Integer> link = new LinkedList<>();
    HashSet<Integer> hash = new HashSet<>();
    TreeSet<Integer> tree = new TreeSet<>();
        try(FileWriter writer = new FileWriter("Result1.txt", false))
        {
            // запись всей строки
            String text = "Hello Gold!";
            writer.write("      Adding time: ");
            writer.write("ArrayList(): " + add(array));
            writer.append('\n');
            writer.write("LinkedList(): " + add(link));
             writer.write("HashSet(): " + add(hash));
            writer.write("TreeSet(): " + add(tree));
            writer.write("      Removing time: ");
             writer.write("ArrayList(): " + remove(array));
            writer.write("LinkedList(): " + remove(link));
            writer.write("HashSet(): " + remove(hash));
            writer.write("TreeSet(): " + remove(tree));
            writer.write("      Search time: ");
            writer.write("ArrayList(): " + contains(array));
           writer.write("LinkedList(): " + contains(link));
            writer.write("HashSet(): " + contains(hash));
            writer.write("TreeSet(): " + contains(tree));
            writer.flush();
        }
        catch(IOException ex) {

            System.out.println(ex.getMessage());
        }



        System.out.println("      Adding time: ");
    System.out.println("ArrayList(): " + add(array));
    System.out.println("LinkedList(): " + add(link));
    System.out.println("HashSet(): " + add(hash));
    System.out.println("TreeSet(): " + add(tree));
    System.out.println("      Removing time: ");
    System.out.println("ArrayList(): " + remove(array));
    System.out.println("LinkedList(): " + remove(link));
    System.out.println("HashSet(): " + remove(hash));
    System.out.println("TreeSet(): " + remove(tree));
    System.out.println("      Search time: ");
    System.out.println("ArrayList(): " + contains(array));
    System.out.println("LinkedList(): " + contains(link));
    System.out.println("HashSet(): " + contains(hash));
    System.out.println("TreeSet(): " + contains(tree));

}

        public static long add(Collection<Integer> collection) {

            long start = System.nanoTime();
            for (int i = 0; i < 100; i++) {
                collection.add(i);
            }
            long end = System.nanoTime() - start;
            return end;
        }

        public static long remove(Collection<Integer> collection) {
            long start = System.nanoTime();
            for (int i = 0; i < 100; i++) {
                collection.remove(i);
            }
            long end = System.nanoTime() - start;
            return end;
        }

        public static long contains(Collection<Integer> collection) {
            long start = System.nanoTime();
            for (int i = 0; i < 100; i++) {
                collection.contains(i);
            }
            long end = System.nanoTime() - start;
            return end;
        }

}

