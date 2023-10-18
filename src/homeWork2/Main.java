package homeWork2;

import example1.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws LimitException {
        BankAccount input = new BankAccount();
        while (true) {
            input.setWithDraw(6000);
            input.setWithDraw(6000);
            input.setWithDraw(6000);
            try {
                input.setWithDraw(6000);
            }catch (LimitException e){
                e.printStackTrace();
            }

        }
    }
}
