package com.edu.miracosta.cs113;

import static org.junit.jupiter.api.Assertions.*;

class PowersTest {



    @org.junit.jupiter.api.Test
    void testIsPowerOf2() {

        int[] truePowers = {2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
        int[] falsePowers = {1, 3, 6, 9, 12, 20, 81, -3, -72, 100, 200, -50};

        for (int i : truePowers){
            assertEquals(true, Powers.isPowerOf2(i));
        }
        for (int i : falsePowers){
            assertEquals(false, Powers.isPowerOf2(i));
        }

    }
}