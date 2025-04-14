package L14_04_2025.impl;

import L14_04_2025.Apple;
import L14_04_2025.predicate.ApplePredicate;

public class AppleHeavyWeightPredicate implements ApplePredicate<Apple> {

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
