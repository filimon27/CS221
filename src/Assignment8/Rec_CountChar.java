package Assignment8;

public class Rec_CountChar {
    public static int countCharacter(String str,int index, char c){
      if(index == str.length())
          return 0;
        {
            if(str.toLowerCase().charAt(index)==c)
                return 1 + countCharacter(str,index+1,c);
            else
                return 0 + countCharacter(str,index +1, c);
        }
    }


    public static void main(String[] args) {

        String str = "There is a mid term exam Saturday.";
       int x =  Rec_CountChar.countCharacter(str,0,'e');
        System.out.println(x);
    }
}
