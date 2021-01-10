import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MatchPattern {



    public  static void  main( String [] args){
        Scanner sc=new Scanner(System.in);
        String pattern=sc.nextLine();
        String str=sc.nextLine();

        char [] charPattern= pattern.toCharArray();
        String [] charStr= str.split(" ");

        if(charPattern.length==charStr.length){

            boolean flag= true;
            Map<Character, String> map=new HashMap<Character, String>();
            for(int i=0; i<charPattern.length; i++ ){
                if(!map.containsKey(charPattern[i]) && map.containsValue(charStr[i])){
                   flag= false;
                   break;
                }else{
                    map.put(charPattern[i], charStr[i]);
                }

            }
            if(flag != false){
                for (int k=0; k< charPattern.length;k++){
                    if(map.containsKey(charPattern[k])){

                        if (!charStr[k].equals(map.get(charPattern[k]))){
                            flag=false;
                            break;
                        }
                    }
                }
            }



            System.out.println(flag);
        }else{
            System.out.println("false");
        }

    }
}
