package com.chanin;

import java.util.*;

public class PalindromeIndex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        while (testCases > 0){
            System.out.println(checkForPalindrome(scanner.next()));
            testCases--;
        }
    }

    static int checkForPalindrome(String input){
        int j;
        StringBuilder sb = new StringBuilder(input);

        for (int i = 0; i < input.length()/2; i++){
            j = input.length() - i - 1;

            if (sb.charAt(i) != sb.charAt(j)) {
                if (i > 1) {
                    if (sb.charAt(i) == sb.charAt(j - 1) && sb.charAt(j - 2) == sb.charAt(i + 1)) {
                        return j;
                    } else {
                        return i;
                    }
                }else{
                    if (sb.charAt(i) == sb.charAt(j - 1) && sb.charAt(j - 2) == sb.charAt(0)) {
                        return j;
                    } else {
                        return i;
                    }
                }

            }
        }
        return -1;
    }

}
