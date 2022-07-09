package com.global.streams;

import java.util.Collection;
import java.util.Optional;

public class MaxInteger {

    public Optional<Integer> findMax(Collection<Integer> numbers) {

        final Optional<Collection<Integer>> optionalCollection = Optional.ofNullable(numbers);


        final Optional<Integer> maxNumber = numbers.stream()
                    .filter(i -> i != null)
                    .reduce((a, b) ->a>b?a:b);

            return maxNumber.isPresent()?maxNumber:Optional.empty();

    }
}
