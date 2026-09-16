class Solution {
    public int waysToSplitArray(int[] nums) {
        int n= nums.length;
        long sum=0;
        for(int i=0;i<n;i++)
         sum+=nums[i];
        int c=0;
        long left =0,right=sum;
        for(int i=0;i<n-1;i++)
        {
            left+=nums[i];
            right-=nums[i];
            if(left >=right)
            {
                System.out.println(left +" "+right);
             c++;
            }
        }
    return c;
    }
}