package sorter;

import java.util.*;

public class SortingTool {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total=0;
        int amount=0;
        long max=Long.MIN_VALUE;
        while (scanner.hasNextLong()) {
            long number = scanner.nextLong();
            // write your code here
            total++;
            if(max<number) {
                max = number;
                amount=1;
            } else if(max==number) amount++;
        }
        System.out.format("Total numbers: %d\n",total);
        System.out.format("The greatest number: %d (%d time(s))",max,amount);
    }
}
