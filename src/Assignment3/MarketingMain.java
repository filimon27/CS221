package Assignment3;

import java.util.ArrayList;
import java.util.List;

public class MarketingMain {

    private List<Marketing> list;
    private int size;

    public MarketingMain(){
        list = new ArrayList<>();
    }

    public void add( Marketing name){
        list.add(name);
    }

    public void remove(Marketing name){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getEmployeeName().equalsIgnoreCase(name.getEmployeeName()) && list.get(i).getProductName().equalsIgnoreCase(name.getProductName()) && list.get(i).getSalesAmount()==list.get(i).getSalesAmount())
                list.remove(i);
        }
    }
    public Marketing set(int index, Marketing newItem){
        return list.set(index,newItem);
    }



    @Override
    public String toString() {
        return list.toString();
    }

    public int size(){
        size=list.size();
        return size;
    }

    public double saleAmount(){
        double sum = 0;
        for(int i = 0; i < list.size(); i++) {
            sum += list.get(i).getSalesAmount();
        }
        return sum;
    }

    public List<Marketing> getList() {
        return list;
    }
    public void clear(List<Marketing>list){
        list.clear();
        System.out.println("The list is cleared");
    }

    public static void main(String []args) {
        MarketingMain test = new MarketingMain();
        test.add(new Marketing("abel", "jamica", 130));
        test.add(new Marketing("john", "Iphone", 1100));
        test.add(new Marketing("Phil", "ramsey", 400));

        System.out.println(test);
        System.out.println("--------------------");
        System.out.println(test.size());
        System.out.println("--------------------");
        System.out.println(test.saleAmount());
        System.out.println("--------------------");
        test.remove(new Marketing("john","iphone",1100));
        System.out.println(test);
        System.out.println("--------------------");
        test.set(1, new Marketing("Fili", "Niki", 233));
        System.out.println(test);
        System.out.println("--------------------");
        System.out.println(test.getList());
        test.clear(test.list);
        System.out.println(test);
    }
}
