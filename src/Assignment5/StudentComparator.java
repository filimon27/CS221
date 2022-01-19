package Assignment5;

import java.util.Comparator;

    public class StudentComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            // TODO Auto-generated method stub
            return o1.getScore()-(o2.getScore());
            //return o1.getSName().compareTo(o2.getSName());
        }

    }


