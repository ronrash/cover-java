package com.global.streams;


import static java.util.stream.Collectors.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxNumberValidator {

    public Optional<Integer> calculate(final List<Integer> list) {



        if (null==list|| list.isEmpty())
            throw new IllegalStateException("List should not be empty ");

        return list.stream()
                .filter(s->s!=null)
                .max(Integer::compareTo);
      
    }
}
