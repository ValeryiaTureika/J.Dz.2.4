package ru.netology.sqr;

public class SQRService {

    public int squareGivenNumbers(int lowerLimit, int upperLimit) {
        int count = 0;
        int squared;
        for (int i = 10; i <= 99; i++) {
            squared = i * i;
            if ((squared >= lowerLimit) && (squared <= upperLimit)) {
                count = count + 1;
            }
        }
        return count;
    }
}
