package com.streamfilter;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student(36, "abdul");
        Student student2 = new Student(35, "abcd");
        Student student3 = new Student(34, "b");
        Student student4 = new Student(22, "c");
        Student student5 = new Student(32, null);

        List<Student> students1  = new ArrayList<>();
        students1.add(student1);
        students1.add(student2);
        students1.add(student3);
        students1.add(student4);
        students1.add(student5);


        final List<Student> students2 = new ArrayList<Student>(){{
            add(new Student(36, "abdul"));
            add(new Student(35, "abcd"));
            add(new Student(34, "b"));
            add(new Student(22, "c"));
            add(new Student(32, null));
        }};

        long count = students2
                .stream()
                .filter(student -> student.age > 30)
                .map(student -> student.name)
                .filter(name -> name == null || name.length() <= 4).count();


        System.out.println(count);

//        List<String> count = students1
//                .stream()
//                .filter(student -> student.age > 30)
//                .map(student -> student.name)
//                .filter(name -> name == null || name.length() <= 4).collect(Collectors.toList());
//
//        System.out.println(count.size());
//
//        System.out.println(count);



//        int counter = 0;
//        for (Student student : students1) {
//
//            if (student.age > 30 && (student.name == null || student.name.length() <= 4)){
//                counter++;
//            }
//
//        }
//        System.out.println(counter);
    }

}
