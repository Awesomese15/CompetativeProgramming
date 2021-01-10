import java.util.Scanner;

public class LenghtOfLastWord {
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
/*        String [] inputArray=input.trim().split(" ");
        int length=inputArray.length;
        System.out.println(inputArray[length-1].length());*/
        System.out.println(input.trim().length()- input.trim().lastIndexOf(" ")-1);
    }
}
