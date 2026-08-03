/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */
var findMedianSortedArrays = function (nums1, nums2) {
 
let arr = new Array(nums1.length + nums2.length);

    let i = 0;
    let j = 0;
    let k = 0;

    while (i < nums1.length && j < nums2.length) {
        if (nums1[i] < nums2[j]) {
            arr[k++] = nums1[i++];
        } else {
            arr[k++] = nums2[j++];
        }
    }

    if(i >= nums1.length){
         for(let m=j; m<nums2.length; m++){
        arr[k++] = nums2[j++];
         }

    }else if(j >= nums2.length){
        for(let m=i; m<nums1.length; m++){
        arr[k++] = nums1[i++];
        }
        
    }

    if(arr.length%2 === 0){
        let n = arr[(arr.length/2)-1];
        let m = arr[(arr.length/2)];
        return (arr[(arr.length/2)-1]+arr[(arr.length/2)])/2
    } else{
        return arr[(arr.length-1)/2]
    }
};