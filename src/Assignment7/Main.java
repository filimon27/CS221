package Assignment7;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<Customer> list = new LinkedList<>();
        list.add(new Customer("neba", 2, 30.00));
        list.add(new Customer("fila", 3, 45.00));
        list.add(new Customer("Yonas", 4, 60.00));
        list.offer(new Customer("taye", 4, 34.0));
       // System.out.println( list.peek().getWaitTime());
//        while(!list.isEmpty()){
//            System.out.println(list.poll().getWaitTime());
//        }

        System.out.println( "The first customer processing time is: " + processingTime(list.poll()) + " min");
        list.poll();
        System.out.println("The second customer Processing time: " + processingTime(list.poll()) + "min");
//        if(list.poll().getWaitTime()==0){
//            return 0;
//        }else{
//            return list.poll().getWaitTime();
    }
    public static double processingTime(Customer customer){
        final double MIN_WAIT = 15;
        if(customer.getWaitTime()<=MIN_WAIT){
            return 15;
        }else{
            return customer.getWaitTime() + MIN_WAIT;
        }
    }
}