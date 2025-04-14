package L14_04_2025.impl;

import L14_04_2025.Apple;
import L14_04_2025.Color;
import L14_04_2025.predicate.ApplePredicate;

public class AppleGreenColorPredicate implements ApplePredicate<Apple> {
    @Override
    public boolean test(Apple apple) {
        return Color.GREEN.equals(apple.getColor());
    }
}
