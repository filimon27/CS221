package Assignment5;

import java.util.ArrayList;
import java.util.Collections;

import java.util.Arrays;


    public class Main {

        public static void main(String[] args) {
            ArrayList<Student> students=new ArrayList<Student>();
            Student s1=new Student(1234,"Taye",90);
            Student s2=new Student(5678,"Fili",95);
            Student s3=new Student(3421,"Nebiyu",78);
            Student s4=new Student(8765,"Abel",60);
            Student s5=new Student(1278,"Abraham",89);
            students.add(s1);
            students.add(s2);
            students.add(s3);
            students.add(s4);
            students.add(s5);
            System.out.println(students);
            System.out.println("----------------------------------");
            Collections.sort(students);                   // Sort using comparable in the Student class.
            System.out.println(students);
            System.out.println("-----------------------------------");
            StudentComparator scoreComparator=new StudentComparator();
            Collections.sort(students,scoreComparator);   //Sorting using Student comparator class
            System.out.println(students);

        }
    }


