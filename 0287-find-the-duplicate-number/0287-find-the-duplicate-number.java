class Solution {
    public int findDuplicate(int[] nums) {
        int[] count = new int[nums.length+1];
        
        for(int idx=0; idx<nums.length; idx++){
            count[nums[idx]]++;
        }

        for(int idx=0; idx<count.length; idx++){
            if(count[idx]>1){
                return idx;
            }
        }
        return -1;
    }
}