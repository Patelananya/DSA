import java.util.*;
public class Leetcode3379{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums= new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int res[]=constructTransformedArray(nums);
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
    }

    public static int[] constructTransformedArray(int[] nums) {
		int n = nums.length;
        int[] res = new int[n];
		for (int i = 0; i < n; i++) {
            if(nums[i]>0){
			    res[i] = nums[(i+nums[i])%n];
            }
            else if(nums[i]<0){
                res[i]=nums[((i + nums[i]) % n + n) % n];
            }else{
                res[i]=nums[i];
            }
		}
		return res;
	}
}