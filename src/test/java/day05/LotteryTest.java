package day05;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {



    @Test
    void lotteryTest(){
        Lottery lottery = new Lottery(6,45);
        List<Integer> result = lottery.startLottery();

        assertEquals( 6, result.size());
    }

    @Test
    void isAllDifferentTest(){
        Lottery lottery = new Lottery(6,45);
        List<Integer> result = lottery.startLottery();

        for(int i = 0; i < result.size(); i++){
            assertFalse(result.subList(i+1,result.size()).contains(result.get(i)));
        }
    }


}