/*Given a set of candidate numbers (candidates) (without duplicates) and a target number (target), find all unique combinations in candidates where the candidate numbers sums to target.

        The same repeated number may be chosen from candidates unlimited number of times.

        Note:

        All numbers (including target) will be positive integers.
        The solution set must not contain duplicate combinations.
        Example 1:

        Input: candidates = [2,3,6,7], target = 7,
        A solution set is:
        [
        [7],
        [2,2,3]
        ]
        Example 2:

        Input: candidates = [2,3,5], target = 8,
        A solution set is:
        [
        [2,2,2,2],
        [2,3,3],
        [3,5]
        ]


        Constraints:

        1 <= candidates.length <= 30
        1 <= candidates[i] <= 200
        Each element of candidate is unique.
        1 <= target <= 500*/

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    List<List<Integer>> res=new ArrayList<>() ;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
            calculateresult(candidates, target, new ArrayList<>(),0, 0);
            return  res;

    }

    private void calculateresult(int[] candidates, int target, ArrayList<Integer> currentList, int currentSum, int i) {
        if(currentSum == target) res.add(new ArrayList<Integer>(currentList));
        if(currentSum >= target || i > candidates.length-1) return;
        if(currentSum+candidates[i]<=target){
            currentList.add(candidates[i]);
            calculateresult(candidates, target, currentList,currentSum+candidates[i],i );
            currentList.remove(currentList.size()-1);
        }

        calculateresult(candidates, target, currentList,currentSum,i+1 );
    }


    public static  void main(String args []){
            CombinationSum sum=new CombinationSum();
            int [] numbers={2,3,6,7};
            int target=7;
            sum.combinationSum(numbers, target);
    }
}
