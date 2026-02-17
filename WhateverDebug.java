public class WhateverDebug {
    public static void main(String[] args) {
        char rangeStart = 'A';
        char rangeEnd = 'Z';
        char findLetter = 'Q';
        for (char c = rangeStart; c <= rangeEnd; c++) {
            if (c == findLetter) {
                System.out.printf("Character %s is withing range %s-%s", findLetter, rangeStart, rangeEnd);
                return;
            }
        }
        System.out.printf("Character %s is not withing range %s-%s", findLetter, rangeStart, rangeEnd);
    }
}