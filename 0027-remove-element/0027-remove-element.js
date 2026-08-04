/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
var removeElement = function (nums, val) {
    let i=0;
    let j=nums.length-1;
    let k=0;

    if(nums.length === 1 && nums[0]===val) return 0;

    while(i<=j){
        if(nums[i] === val){
            nums[j]=nums[i]+nums[j];
            nums[i]=nums[j]-nums[i];
            nums[j]=nums[j]-nums[i];
            j--;
        
        }else{
            i++;
            k++;
        }
    }
    return k;
};