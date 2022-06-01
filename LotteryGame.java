package TasksAgain;

import java.util.Random;

public class LotteryGame {
    public static void main(String[] args) {

        int[] ticket = new int[6];
        int generatedNumbers = 0;
        Random random = new Random();

        while (generatedNumbers < ticket.length) {
            int luckyNumber = random.nextInt(30) + 1;
            boolean isUnique = true;

            for (int i = 0; i < generatedNumbers; i++) {
                if (luckyNumber == ticket[i]) {
                    isUnique = false;
                }
            }

            if (isUnique) {
                ticket[generatedNumbers] = luckyNumber;
                generatedNumbers++;
            }
        }
        System.out.println("The lucky numbers are:");
        for (int i = 0; i < ticket.length; i++) {
            System.out.print(ticket[i] + " ");
        }
    }
}
