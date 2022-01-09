package day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {

    private int numberOfRounds;
    private int maxNumber;
    private Random random = new Random();

    public Lottery(int numberOfRounds, int maxNumber) {
        this.numberOfRounds = numberOfRounds;
        this.maxNumber = maxNumber;
    }

    public List<Integer> startLottery(){
        List<Integer> numbers = new ArrayList<>();
        while (numbers.size() != numberOfRounds){
            int randomNumber = random.nextInt(1,maxNumber + 1);
            if(!numbers.contains(randomNumber)){
                numbers.add(randomNumber);
            }
        }
        return numbers;

    }

    private int getNewNumber(Random random){
        return random.nextInt(1,numberOfRounds + 1);

    }

    private boolean checkIfExist(List<Integer> numbers, Integer randomNr){
        return numbers.contains(randomNr);
    }



    public int getNumberOfRounds() {
        return numberOfRounds;
    }

    public int getMaxNumber() {
        return maxNumber;
    }


}
