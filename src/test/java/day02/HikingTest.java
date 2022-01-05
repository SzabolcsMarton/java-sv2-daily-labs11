package day02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HikingTest {


    @Test
    void getElevationTest() {
        List<Integer> elevations = Arrays.asList(10,20,15,18);
        Hiking hiking = new Hiking();

        assertEquals(13,hiking.getPlusElevation(elevations));
    }

}