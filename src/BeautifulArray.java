public class BeautifulArray {

    int count=0;

    public int countArrangement(int n) {

        int numArr [] = new int[n];
        for(int i=0; i<n; i++){
            numArr[i]=i+1;
        }
        permutation(numArr, 0);
        return  count;
    }

    public void permutation(int numArr [], int k){
        if(k==numArr.length){
            count++;
        }
        for(int i=k; i<numArr.length; i++){
            swap(numArr, k, i);
            if(numArr[k]%(k+1)==0 || (k+1)% numArr[k]==0)
                permutation(numArr, k+1);
            swap(numArr, k, i);
        }

    }

    public void swap(int numArr [], int i, int j){
            int temp=numArr[i];
            numArr[i]=numArr[j];
            numArr[j]=temp;
    }
    public static  void main(String args []){
        BeautifulArray beautifulArray=new BeautifulArray();
        System.out.println(beautifulArray.countArrangement(4));
    }
}
