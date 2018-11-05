package sorter;

import java.util.Scanner;

public class SortingTool {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        long greatest = 0;
        int times = 1;
        while (scanner.hasNextLong()) {
            final long number = scanner.nextLong();
            total++;
            if (number>greatest) {
                greatest = number;
            }
            else if(number==greatest) {
                times++;
            }
        }
        System.out.println("Total numbers: " + total);
        System.out.println("The greatest number: " + greatest + "( " + times + " time(s))");
    }
}
