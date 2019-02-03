package sorter;

import java.util.*;

public class SortingTool {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        ArrayList<Long> myList = new ArrayList<>();

        while (scanner.hasNextLong()) {
            final long number = scanner.nextLong();
            myList.add(number);}

        Collections.sort(myList);

        long X = myList.size();
        long Y = myList.get(myList.size()-1);

        System.out.println("Total numbers: " + X +".");

        System.out.println("The greatest number: " + Y + " (1 time(s))"+".");

       
    }
}
