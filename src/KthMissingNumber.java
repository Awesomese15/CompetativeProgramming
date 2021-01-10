public class KthMissingNumber {

    public int findKthPositive(int[] arr, int k) {
            int result=0;
            int dummy=0;
            if(arr.length==1){

            }

            for(int i=0; i<=arr.length-2; i++){
               int first , second;
               if(i==0 && dummy<arr[i]){
                   while (!(arr[i]==dummy+1)){
                       dummy++;
                       result=dummy;
                       k--;
                   }
               }
               first=arr[i];
               second=arr[i+1];
                if(k<=1){
                    break;
                }
                while(!(second==first+1) && k>1){
                    first++;
                    result=first;
                    k--;

                }


            }
            if(k>1){
                result=arr[arr.length-1]+k;
            }
           /* if(k==check){
                result=arr[arr.length-1]+k;
            }*/
       System.out.println(result);
            return  result;
    }

    public static  void main(String args []){
        int numbers []={2};
        int k=2;
        KthMissingNumber number=new KthMissingNumber();
        number.findKthPositive(numbers, 1);
    }
}
