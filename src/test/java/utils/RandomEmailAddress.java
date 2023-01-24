package utils;

import java.util.Random;

public class RandomEmailAddress {

//    public static void main(String[] args){
//        System.out.println(RandomEmailAddress.getEmailAddress());
//
//    }

    public static String getEmailAddress(){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        return randomInt+"@gmail.com";
    }


}
