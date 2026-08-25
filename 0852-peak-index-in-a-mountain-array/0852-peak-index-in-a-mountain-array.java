class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        return binarySearch(arr,0,arr.length-1);
    }

    public int binarySearch(int[] arr,int low, int high){
        while(low<=high){
             int mid = low + (high-low) / 2;

            if(arr[mid-1]>arr[mid]){
                high = mid;
            }else if(arr[mid+1] > arr[mid]) {
                low = mid;
            }else{
                return mid;
            }
        }
        return -1;
    }
}