package ru.netology.sqr;

public class SQRService {
    public int sqrtCount(int minRange, int maxRange) {
        int count = 0;
        for (int i = 0; i * i <= maxRange; i++) {
            if (minRange <= i * i && i * i <= maxRange) {
                count++;
            }
        }
        return count;
    }
}
