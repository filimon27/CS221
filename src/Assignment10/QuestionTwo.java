package Assignment10;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class QuestionTwo {

    public static void main(String[] args) {

        List<String>list= new ArrayList<String>();
        list.add("Dean");
        list.add("Dave");
        list.add("Zaineh");
        list.add("yasmeen");
        list.add("Zaineh");

       countValues(list);

    }

    public  static void countValues(List<String> list){
        Set<String>set= new TreeSet<>();
        for(int i=0; i<list.size();i++){
            set.add(list.get(i));
        }

        System.out.println( set.size());
    }
}
