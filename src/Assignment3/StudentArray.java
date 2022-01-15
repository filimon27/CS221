package Assignment3;

import java.util.Arrays;

public class StudentArray {
    private Student[] a;
    private int nElems;

            public StudentArray(int max){
               a= new Student[max];
            }
            public Student find(int id){
                for (int i = 0; i < nElems; i++) {
                    if(id==a[i].getId())
                        return a[i];
                }
                return null;
            }
            public void insert(int id,String name, int mark){
                if(nElems==a.length)throw new IndexOutOfBoundsException("no space");
                for (int i = 0; i < a.length; i++) {
                    if (a[i]!=null && a[i].getId()==id)
                        System.out.println("student exists");
                    if(a[i]==null){
                        a[i]=new Student(id,name,mark);
                        nElems++;
                        break;
                    }


                }


                    }
    public boolean delete(int id) {
        int index=0;
        int i;
        for (i = 0; i < a.length; i++) {
            if(a[i]!=null && a[i].getId() == id ) {
                index=i;
                break;
            }
        }
        if(i==a.length)
            return false;
        for(int j=index+1;j<a.length;j++){
            a[j-1]=a[j];
        }
        nElems--;
        return  true;
    }

    public void displayAll() {
        for(int i = 0; i < nElems; i++) {
            if(a[i] != null)
                System.out.print("Id: " + a[i].getId() + " "+ "Name: "+  a[i].getName() + " " +"Mark: " + a[i].getMark()  + " \n");
        }
    }


    public static void main(String[] args) {

        StudentArray std = new StudentArray(4);
        std.insert(2134,"nrb",90);
        std.insert(8901,"Fili",99);
        std.insert(7346,"Taye",100);
        std.insert(7801,"Keyo",95);
        System.out.println("Display all: ");
        std.displayAll();

        System.out.println();

        System.out.println("Find Id 7801: " + std.find(7801));
        System.out.println();

        std.delete(7801);
        System.out.println("After Id 7801 deleted: ");
        std.displayAll();




    }}


