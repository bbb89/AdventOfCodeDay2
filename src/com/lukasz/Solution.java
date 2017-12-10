package com.lukasz;

import java.util.List;
import java.util.Scanner;

public class Solution {
    public static int calculateChecksum(List<String> lines) {

        return processAllLines(lines);
    }

    private static int processAllLines(List<String> lines) {

        int sum = 0;

        for(String currentLine : lines) {
            sum += differenceBetweenMinAndMaxInLine(currentLine);
        }

        return sum;
    }

    private static int differenceBetweenMinAndMaxInLine(String currentLine) {

        int min = -1;
        int max = 0;
        Scanner scanner = new Scanner(currentLine);
        while(scanner.hasNextInt()) {
            int currentNumber = scanner.nextInt();
            if(currentNumber > max) {
                max = currentNumber;
            }
            if(min == -1 || currentNumber < min) {
                min = currentNumber;
            }
        }

        return max - min;
    }
}
