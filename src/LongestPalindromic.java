public class LongestPalindromic {


    public boolean isPalindrom(String s){
/*

            int length=s.length();
            if(length%2==0){
                String sub1=s.substring(0, (length/2));
                String sub2=s.substring(length/2, length);
                StringBuilder stringBuilder1= new StringBuilder(sub1);
                StringBuilder stringBuilder2= new StringBuilder(sub2);
                stringBuilder1=stringBuilder1.reverse();
                return stringBuilder1.toString().equals(stringBuilder2.toString()) ;
            }else{
                String sub1=s.substring(0, (length/2));
                String sub2=s.substring((length/2)+1, length);
                StringBuilder stringBuilder1= new StringBuilder(sub1);
                StringBuilder stringBuilder2= new StringBuilder(sub2);
                stringBuilder1=stringBuilder1.reverse();
                return stringBuilder1.toString().equals(stringBuilder2.toString()) ;
            }
*/

           int i=0, j=s.length();
           while(i<j){
               if(s.charAt(i)==s.charAt(j-1)){
                   i++;
                   j--;
               }

           }
        return true;
    }

    public String longestPalindrome(String s) {

/*        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);*/
        String ans = new String();
        if (s.length() == 1) {
            return Character.toString(s.charAt(0));
        } else {


        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sendingString = s.substring(i, j);
                if (isPalindrom(sendingString) && (ans.length() < j - i)) {
                    ans = sendingString;
                }
            }
        }

    }

            return ans;
    }

    private int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }



    public static void main(String args []){
        LongestPalindromic palindromic=new LongestPalindromic();
        String a=palindromic.longestPalindrome("babad");
        System.out.println(a);
    }
}
