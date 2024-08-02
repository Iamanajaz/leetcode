//1. two sum 
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++)
        {
			    for(int j=0; j<i; j++) 
            {
                if(nums[i] + nums[j] == target)
                    return new int[]{j,i};
            }
        }
        return null;
  }

    public static void main(String[] args){
        int[] ar={3,2,4};
        int t=6;
        Solution b = new Solution();
        b.twoSum(ar,t);
    }
}
