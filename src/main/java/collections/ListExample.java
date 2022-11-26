package collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListExample {

    public static void main(String[] args) {
        List<StudentNew> studentNewList = Arrays.asList(new StudentNew("rohit",32,"C"),
                new StudentNew("rahul",33,"B"),new StudentNew("pallavi",33,"D"),new StudentNew("priya",70,"B"));

        System.out.println("before"+studentNewList);
        studentNewList.stream()
                .filter(studentNew -> studentNew.getCode().equalsIgnoreCase("B"))
                .forEach(studentNew -> studentNew.setCode("BB"));

        final List<StudentNew> studentNewList1 = studentNewList.stream()
                .filter(studentNew -> studentNew.getCode().equalsIgnoreCase("B"))
                .map(studentNew -> new StudentNew(studentNew.getName(), studentNew.getAge(), "BBB"))
                .collect(Collectors.toList());

        System.out.println("after"+studentNewList);
        System.out.println(studentNewList1);
    }
}
