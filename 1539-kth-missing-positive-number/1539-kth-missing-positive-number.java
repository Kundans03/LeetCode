class Solution {
    public int findKthPositive(int[] arr, int k) {
        int num = 1;
        int arrIdx = 0;

        while(k>0){
            if(arrIdx < arr.length && arr[arrIdx] == num){
                arrIdx++;
            }else{
               k--;
            }
            num++;
        }

        return --num;
    }
}