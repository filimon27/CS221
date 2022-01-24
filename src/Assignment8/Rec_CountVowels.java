package Assignment8;

public class Rec_CountVowels {
    public static int countVowels(String str, int index){

        if(index ==str.length())
            return 0;
        else{
            if(str.toLowerCase().charAt(index)=='a'|| str.toLowerCase().charAt(index)=='e'||str.toLowerCase().charAt(index)=='i'|| str.toLowerCase().charAt(index)=='o' || str.toLowerCase().charAt(index)=='u')
                return 1 + countVowels(str, index + 1);
            else
                return  0 + countVowels(str, index + 1);
        }
    }



    public static void main(String[] args) {

        String str = " count the vowels int this string";
        int count = countVowels(str,0);
        System.out.println(count);
    }
}
