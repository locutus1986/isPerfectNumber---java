package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(28));
    }

    public static boolean isPerfectNumber(int number){

        if(number > 1){
            int i = 0;
            int factors = 0;
            while(i < number-1){
                i++;
                if(number%i==0){
                    factors+=i;
                }
            }
            if(number == factors){
                return true;
            }
        }

        return false;
    }
}
