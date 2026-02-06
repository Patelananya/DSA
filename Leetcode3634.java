import java.util.*;
class Leetcode3634 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 2;
        Arrays.sort(nums);
        int n = nums.length;
        int maxSize = 0;

        int left = 0;
        for (int right = 0; right < n; right++) {
            while (nums[right] > (long) nums[left] * k) {
                left++;
            }
            maxSize = Math.max(maxSize, right - left + 1);
        }

        System.out.println(n - maxSize);
    }
    
}