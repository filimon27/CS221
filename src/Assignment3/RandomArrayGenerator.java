package Assignment3;

import java.util.Random;
import java.util.Arrays;
import java.util.Random;
public class RandomArrayGenerator {



        private static Random rd = new Random();
        private static int[] array = new int[100];

        int size=0;

        public void insert() {
            array[size]=  rd.nextInt(100);
            size++;
        }
        public  int getSize(){
            return  size;
        }


        public boolean isContain(int[] a, int v){
            for (int i = 0; i < a.length; i++) {
                if (a[i]==v)
                    return true;
            }
            return  false;
        }
        //   System.out.println(ri.subList(2,6));
        public int set(int index,int newvalue) {
            if(index>=size || index<0) {
                throw new ArrayIndexOutOfBoundsException("Invalid Index");
            }
            else{
                int temp=array[index];
                array[index]=newvalue;
                return temp;
            }

        }
        public int get(int index) {
            if(index>=size || index<0) {
                throw new ArrayIndexOutOfBoundsException("Invalid Index");
            }
            else{
                return array[index];
            }

        }
        public int[] subList(int start, int end){
            int sub_size= end-start;
            if(sub_size>=size ||  end>=size || start<=0 ) {
                throw new ArrayIndexOutOfBoundsException("Invalid Index");
            }
            else{
                int[] arr= new int [sub_size+1];
                for (int i = 0; i <= sub_size; i++) {
                    arr[i]=array[start+i];

                }
                return arr;
            }
        }

        public void displayArray(){
            int[] temp= new int[size];
            for (int i = 0; i < size; i++) {
                temp[i]=array[i];
            }
            System.out.println(Arrays.toString(temp));
        }
        public void removeDuplicates(){

            int [] temp= new int[size];
            int counter=0;
            RandomArrayGenerator obj= new RandomArrayGenerator();

            for (int i = 0; i < size; i++) {
                boolean isc=obj.isContain(temp,array[i]);
                //System.out.println(Arrays.toString(temp));
                if (!isc){
                    // System.out.println();
                    temp[counter] =array[i];//   = rd.nextInt(100);
                    counter++;
                }

            }
            int [] temp2= new int[counter];
            for (int i = 0; i <counter ; i++) {
                temp2[i]=temp[i];
            }
            size=--counter;

            array =temp2;

        }
        public  static void clear(){
            int[] arr= new int[50];
            array= arr;
        }
        public static void main(String[] args) {
            RandomArrayGenerator ri = new RandomArrayGenerator();
            for (int i = 0; i <50; i++) {
                ri.insert();
            }

            ri.displayArray();
            ri.removeDuplicates();
            ri.displayArray();
            ri.subList(2,6);
            ri.displayArray();
            ri.insert();
            ri.displayArray();



        }
    }