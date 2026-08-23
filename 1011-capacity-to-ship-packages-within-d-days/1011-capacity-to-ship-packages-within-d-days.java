class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = Arrays.stream(weights).max().getAsInt();
        int right = Arrays.stream(weights).sum();

        while(left < right){
            int mid = left + (right - left) / 2;

            int NeededDays = daysNeeded(weights, mid);

            if(NeededDays <= days){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }

    private int daysNeeded(int[] weights, int capacity) {
        int day = 1;
        int load = 0;

        for (int w : weights) {
            if (load + w > capacity) {
                day++;
                load = w;
            } else {
                load = load + w;
            }
        }
        return day;
    }
}