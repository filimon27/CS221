package Assignment10;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class QuestionThree{
    public static void main(String[] args) {
      List<Integer>list1= new ArrayList<>();
      list1.add((90));
     list1.add(80);
      list1.add(94);

        List<String>list2= new ArrayList<>();
        list2.add("Dean");
        list2.add("Dave");
        list2.add("Zaineh");


        addThemTogether(list1,list2);

    }

    public   static <T,E> Set addThemTogether(List< T> list1, List<E>list2){

        Set<T> set1= new TreeSet<>();
        Set<E> set2= new TreeSet<>();
        for (int i = 0; i <list1.size() ; i++) {
             set1.add(list1.get(i));
        }
        for (int i = 0; i < list2.size() ; i++) {
            set2.add(list2.get(i));
        }
       set1.addAll(set2);

   return  set1;
    }
}
