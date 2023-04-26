package com.corejava.java8.streams;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.corejava.corejava.equalsandhascodes.Student;

public class ImportantStreamExamples {

    public static void main(String[] args) {
        List<String> postcodes = getPostcodes();
        System.out.println(postcodes);

    }
//        return getResultedHearings()
//                .map(Hearings::getDefendants)
//                .filter(Objects::nonNull)
//                .flatMap(Collection::stream)
//                .filter(d -> defendantId.equals(d.getId()))
//                .map(Defendants::getJudicialResults)
//                .filter(Objects::nonNull)
//                .flatMap(Collection::stream)
//                .collect(toList());
//    }

    public static List<String> getPostcodes() {
//       return StudentUtility.getStudentList().stream()
//               .map(Student::getAddress)
//               .filter(Objects::nonNull)
//               .flatMap(Collection::stream)
//               .map(Address::getPostcode)
//               .filter(Objects::nonNull)
//               .collect(Collectors.toList());

//        return StudentUtility.getStudentList()
//                .stream()
//                .filter(Objects::nonNull)
//                .flatMap(student -> student.getAddress().stream())
//                .filter(Objects::nonNull)
//                .peek(address -> System.out.println(address.getPostcode()))
//                .map(Address::getPostcode)
//                .collect(toList());

         StudentUtility.getStudentList()
                .stream()
                .filter(Objects::nonNull)
                .flatMap(student -> student.getAddress().stream())
                .filter(Objects::nonNull)
                .peek(address -> System.out.println(address.getPostcode()))
                .collect(toList());


    return Arrays.asList("woolen");
               // students can be null
    }
}
