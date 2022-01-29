package Assignment10;

import java.util.*;


public class QuestionOne {

    public static void main(String[] args) {

        List<String>list= new ArrayList<String>();
        list.add("Dean");
        list.add("Dave");
        list.add("Zaineh");
        list.add("yasmeen");
        list.add("Zaineh");




        System.out.println( noDuplicates(list));


    }

    public  static Set noDuplicates( List<String> list){


        Set<String> set= new HashSet<>();

        for (int i = 0; i <list.size(); i++) {
            set.add(list.get(i));
        }
        return set;
    }

}
