package Strategy.Sample;

import java.util.Random;

public class WinningStrategy implements Strategy{
    private Hand prevHand;
    private boolean won = false;
    private Random random;

    public WinningStrategy(int seed){
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if(!won){
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
