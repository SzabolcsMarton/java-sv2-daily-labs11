package day02;

import java.util.List;

public class Hiking {

    public int getPlusElevation(List<Integer> elevations) {
        int sum = 0;
        for (int i = 0; i < elevations.size() - 1; i++) {
            if (elevations.get(i) < elevations.get(i + 1)) {
                sum += (elevations.get(i + 1) - elevations.get(i));
            }
        }
        return sum;
    }
}