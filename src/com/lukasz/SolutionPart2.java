package com.lukasz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SolutionPart2 {
    public static int calculateChecksum(List<String> lines) {

        return processAllLines(lines);
    }

    private static int processAllLines(List<String> lines) {

        int sum = 0;

        for(String currentLine : lines) {
            sum += resultOfDivisionInLine(currentLine);
        }

        return sum;
    }

    private static int resultOfDivisionInLine(String currentLine) {

        List<Integer> numbersInLine = addNumbersInLineToList(currentLine);

        for(int i = 0; i < numbersInLine.size(); i++) {
            int currentNumber = numbersInLine.get(i);
            for(int j = 0; j < numbersInLine.size(); j++) {
                int numberToDivideBy = numbersInLine.get(j);
                if ( resultOfDivisionIsWholeNumber(currentNumber, numberToDivideBy) ) {
                    return currentNumber / numberToDivideBy;
                }
            }
        }

        return 0;
    }

    private static List<Integer> addNumbersInLineToList(String currentLine) {
        List<Integer> numbersInLine = new ArrayList<>();

        Scanner scanner = new Scanner(currentLine);
        while(scanner.hasNextInt()) {
            numbersInLine.add(scanner.nextInt());
        }

        return numbersInLine;
    }

    private static boolean resultOfDivisionIsWholeNumber(int currentNumber, int numberToDivide) {
        return (currentNumber != numberToDivide) && (currentNumber % numberToDivide == 0);
    }
}
