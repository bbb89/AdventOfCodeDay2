package com.lukasz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {



    @org.junit.jupiter.api.Test
    void calculateChecksum_numbers() {
        String numbers =
                        "5 1 9 5 \n" +
                        "7 5 3 \n" +
                        "2 4 6 8";


        List<String> lines = scanLines(numbers);
        int expected = 18;
        int actual = Solution.calculateChecksum(lines);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void calculateChecksum_zero() {
        String numbers =
                        "0 0 0 0 \n" +
                        "0 0 0 \n" +
                        "0 0 0 0";


        List<String> lines = scanLines(numbers);
        int expected = 0;
        int actual = Solution.calculateChecksum(lines);

        assertEquals(expected, actual);
    }

    private List<String> scanLines(String numbers) {
        Scanner scanner = new Scanner(numbers);
        List<String> lines = new ArrayList<>();

        while(scanner.hasNextLine()) {
            lines.add(scanner.nextLine());
        }

        return lines;
    }
}