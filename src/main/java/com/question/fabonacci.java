package com.question;

public class fabonacci {
    public long fabonacci(long num) {

        if(num < 0){
            return -1;
        }
        else if(num <= 1){
            return num;
        }
        else {
            return fabonacci(num-1) + fabonacci(num - 2);
        }
    }
    public void printFabonacci(long number){
        for (int i = 0; i < number; i++) {
            System.out.print(" " + fabonacci(i));
        }
    }
}
