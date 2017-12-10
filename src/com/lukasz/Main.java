package com.lukasz;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<String> getInput() {
        Scanner lineScanner = new Scanner(System.in);
        System.out.println("Enter numbers (press enter 2 times to confirm");
        String line = " ";
        List<String> lines = new ArrayList<>();

        while(!(line = lineScanner.nextLine()).isEmpty()) {
            lines.add(line);
        }

        return lines;
    }

    public static void main(String[] args) {
        List<String> lines = getInput();

        int checksum = Solution.calculateChecksum(lines);
        int checksum2 = SolutionPart2.calculateChecksum(lines);
        System.out.println("Checksum is " + checksum);
        System.out.println("Checksum part II is " + checksum2);

    }
}
