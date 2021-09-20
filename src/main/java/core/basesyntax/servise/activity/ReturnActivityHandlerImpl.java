package core.basesyntax.servise.activity;

import java.util.Map;

public class ReturnActivityHandlerImpl implements ActivityHandler {
    @Override
    public void act(String fruit, String quantity, Map<String, Integer> goalMap) {
        Integer intQuantity = Integer.valueOf(quantity);
        if (goalMap.get(fruit) == null) {
            throw new RuntimeException("Balance isn't first activity");
        }
        goalMap.put(fruit, goalMap.get(fruit) + intQuantity);
    }
}