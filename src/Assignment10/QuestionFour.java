package Assignment10;

import java.util.*;

public class QuestionFour {
    public static void main(String[] args) {
        Course course1= new Course("CS221", "DS",4);
        Course course2= new Course("CS205", "OOP",4);
        Course course3= new Course("CS105", "CM",4);
        List<Course>courseList= new ArrayList<>();
        courseList.add(course1);
        courseList.add(course2);
        courseList.add(course3);

            courseDescription(courseList);



    }

    public static void courseDescription(List<Course> list){
        Map<String ,Course> courseMap=  new HashMap<>();

        for(int i=0;i<list.size();i++){

            courseMap.put(list.get(i).getCid(),list.get(i));
            System.out.println(list.get(i).getCid() + "," + courseMap.get(list.get(i).getCid()));

        }


    }


}
