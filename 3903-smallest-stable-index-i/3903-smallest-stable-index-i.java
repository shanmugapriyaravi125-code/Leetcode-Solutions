class Solution {
    public int firstStableIndex(int[] nums, int k) {
        
        int n=nums.length;
        int max=nums[0];

        for(int i=0;i<n;i++)
        {
            max=Math.max(nums[i],max);
           int min=nums[i];
            for(int j=i;j<n;j++)
               min=Math.min(nums[j],min);   
          if(max-min <=k)
           return i;
        }
    return -1;
    }
}