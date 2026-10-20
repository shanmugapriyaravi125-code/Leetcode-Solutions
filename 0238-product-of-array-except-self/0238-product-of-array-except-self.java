class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length,p=0;
        
        int res[]=new int[n];
        int s=1,f=0;
        for(int i=0;i<n;i++)
        {
            s*=nums[i];
        }
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                int temp=1;
                for(int j=0;j<n;j++)
                {
                     if(i!=j)
                      temp*=nums[j];
                }
                res[p++]=temp;
                   
            }
            else
              res[p++]=(int)s/nums[i];
            
        }
return res;
    }
}