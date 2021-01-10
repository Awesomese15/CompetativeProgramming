/*

Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

Find the kth positive integer that is missing from this array.
Example:
Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.

Input: arr = [1,2,3,4], k = 2
Output: 6
Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.
 */



import java.util.HashSet;

import java.util.Set;

public class MissingNumber {

    public int findKthPositive(int[] arr, int k) {
        Set<Integer> set=new HashSet<>();
        for(int el : arr){
            set.add(el);
        }
        int start=1;
        while(k>0){
            if (set.contains(start)){
                start++;
            }else{
                k--;
                start++;
            }
        }
        System.out.println(start-1);
        return  start-1;
    }

    public static void main(String args []){

        int numbers []={2};
        int k=5;
        MissingNumber obj=new MissingNumber();
        obj.findKthPositive(numbers, k);

    }
}
