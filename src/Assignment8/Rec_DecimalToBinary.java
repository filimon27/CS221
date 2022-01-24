package Assignment8;

public class Rec_DecimalToBinary {

    public static int  deciamlToBinary(int decimalNum) {
        if(decimalNum == 0){
            return 0;
        }else{
            return (decimalNum %  2 + 10 * deciamlToBinary(decimalNum/2));
        }
    }


    public static void main(String[] args) {

        int decimalNum = 10;
        System.out.println(deciamlToBinary(decimalNum));

    }
}
