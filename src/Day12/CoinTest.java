package Day12;

import java.util.Stack;

public class CoinTest {
    public static void main(String[] args) {
        Stack<Coin> coins = new Stack<>();

        coins.push(new Coin(100));
        coins.push(new Coin(500));
        coins.push(new Coin(10));
        coins.push(new Coin(50));

        while(!coins.isEmpty()){
            System.out.println(coins.pop().getValue());
        }

    }
}
