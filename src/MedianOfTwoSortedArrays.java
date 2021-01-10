import java.util.Arrays;

public class MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ans;
        int mergedArray []=new int [nums1.length+nums2.length];

        int j=0;
        for(int i=0; i< mergedArray.length; i++){

            if(i<nums1.length){
                mergedArray[i]=nums1[i];
            }else{
                mergedArray[i]=nums2[j];
                j++;
            }
        }


        Arrays.sort(mergedArray);
        int index=mergedArray.length/2;
        if(mergedArray.length%2==0){
            double a=((double)mergedArray[index-1]+(double)mergedArray[index])/2.0;
            ans=Math.round(a*100000.0)/100000.0;
            //ans=Math.round(((double) (mergedArray[index]+mergedArray[index+1])/2)*100000)/100000;
        }else{
            ans=Math.round((double)mergedArray[index]*100000)/100000;
        }
        System.out.println(ans);
        return  ans;

    }

    public static  void main(String args []){
        int [] num1={0,0};
        int [] num2={0,0};
        MedianOfTwoSortedArrays obj=new MedianOfTwoSortedArrays();
        obj.findMedianSortedArrays(num1, num2);

    }
}
