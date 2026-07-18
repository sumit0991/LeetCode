class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        
       
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        
        
        return getGCD(min, max);
    }
    
    
    private int getGCD(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
}
