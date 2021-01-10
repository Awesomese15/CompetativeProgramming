import java.util.*;

public class StackProblem {


    public static void main(String []argh )
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();
            Stack<Character> stringStack=new Stack<>();
            char [] charArray= input.toCharArray();
            stringStack.push(charArray[0]);
           for(int i=1; i< charArray.length; i++){
               if(stringStack.size()==0){
                   stringStack.push(charArray[i]);
               }else{
                   switch (charArray[i]){
                       case '}':

                           if(stringStack.size()>0 && stringStack.peek().equals('{')){
                               stringStack.pop();
                           }
                           break;
                       case ']':
                           if(stringStack.size()>0 && stringStack.peek().equals('[')){
                               stringStack.pop();
                           }
                           break;
                       case ')':
                           if(stringStack.size()>0 && stringStack.peek().equals('(')){
                               stringStack.pop();
                           }
                           break;
                       default:
                           stringStack.push(charArray[i]);
                   }
               }

           }

            if(stringStack.isEmpty()){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }



    }
}
