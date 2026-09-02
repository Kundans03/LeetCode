class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;

        for(int weight : weights){
        low = Math.max(low, weight);
        high += weight;

        }

        int minCapacity = high;

        while(low <= high){

            int midCapacity = low + (high-low) / 2;
            
            int dayPassed = 1;
            int cap = 0;

                for(int weight : weights){
                    if(dayPassed > days){
                        break;
                    }

                    if(cap + weight > midCapacity){
                        dayPassed++;
                        cap = 0;
                    }
                    cap += weight;
                }

            if(dayPassed <= days){
                high = midCapacity - 1;
                minCapacity = midCapacity;
            }else{
                low = midCapacity + 1;
            }
            
        }

        return minCapacity;
    }
}