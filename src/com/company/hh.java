package com.company;

public class hh {
    public class LongestRepeatingSequence {
        public static void main(String[] args) {
            String input = "asakdudadkasdsaddddkkkkwwwwmsaassjwiwwwwwwwwwaudhwdkdosooowwwwttttwweee";
            char longestChar = '\0';
            int longestPos = 0;
            int currPos = 0;
            int currLen = 1;
            int longestLen = 0;
            char prevChar = '\0';

            for (char c : input.toCharArray()) {
                if (c == prevChar) {
                    currLen++;
                } else {
                    if (currLen > longestLen) {
                        longestLen = currLen;
                        longestChar = prevChar;
                        longestPos = currPos - currLen;
                    }
                    currPos++;
                    currLen = 1;
                    prevChar = c;
                }
            }

            if (currLen > longestLen) {
                longestLen = currLen;
                longestChar = prevChar;
                longestPos = currPos - currLen;
            }

            System.out.println("The character '" + longestChar + "' has longest repeating sequence starting from position " + longestPos);
        }
    }
}
