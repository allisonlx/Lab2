package com.edu.miracosta.cs113;

public class Powers {

    public static boolean isPowerOf2(int x){
        while (x % 2 == 0){
            if (x == 2 || x == 0){
                return true;
            }
            x = x/2;
        }
        return false;
    }
}
