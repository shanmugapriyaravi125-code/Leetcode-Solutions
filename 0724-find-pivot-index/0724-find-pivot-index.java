class Solution {
    public int pivotIndex(int[] nums) {
        int sum =0,n= nums.length;
        for(int i=0;i<n;i++)
        sum+=nums[i];
        int left =0,right=sum;
        for(int i=0;i<n;i++)
        {
           right -=nums[i];
           if(left==right)return i;
           left+=nums[i];
        }
    return -1;
    }
}