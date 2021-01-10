public class ZizZag {

    public void convert(String s, int numRows) {
        int length=s.length();
        int numColumns=length/(numRows-1);

        char [][] dp=new char [numRows][numColumns];
        int columnIndex=0;
        int charIndex=0;
        int rowIndex=0;
        for(; columnIndex< numColumns-1; columnIndex++)
        if(charIndex==0 || (charIndex)%numRows!=0){
            for( rowIndex=0; rowIndex<=numRows-1; rowIndex++){

                dp[rowIndex][columnIndex]=s.charAt(charIndex);
                charIndex++;



            }
            rowIndex--;

        }else{

                dp[--rowIndex][columnIndex]=s.charAt(charIndex);


        }

        String result="";
            for(int i=0; i<numRows-1; i++){
                for(int j=0; j<numColumns-1; j++){
                    if(dp[i][j]==0)
                     result=result.concat(Character.toString(dp[i][j]));
                }
            }
        System.out.println(result);

    }

    public static void main(String [] args){
        ZizZag obj=new ZizZag();
        obj.convert("PAYPALISHIRING", 3);
    }
}
