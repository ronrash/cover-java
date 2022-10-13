package com.corejava.streams;

import static java.util.stream.Collectors.toList;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import com.corejava.corejava.equalsandhascodes.Student;

public class ImportantStreamExamples {

    public static void main(String[] args) {

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

   public List<String> getPostcodes()
   {
       return StudentUtility.getStudentList().stream()
               .map(Student::getAddress)
               .filter(Objects::nonNull)
               .flatMap(Collection::stream)
               .filter(address -> address.getPostcode()!=null && address.getPostcode().startsWith("CRO"))
               .map(Address::getPostcode)
               .filter(Objects::nonNull)
               .collect(toList());
   }
}
