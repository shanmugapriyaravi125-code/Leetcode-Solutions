class Solution {
    static boolean isPrime[] = new boolean[101];
 static 
 {
     
     Arrays.fill(isPrime,true);
     isPrime[0]=false;
     isPrime[1]=false;
     for(int i=2;i<101;i++)
     {
        if(isPrime[i])
        {
            for(int j=i+i;j<=101;j+=i)
              isPrime[j]=false;
        }
     }
   
 }

    public int maximumPrimeDifference(int[] nums) {
       int n=nums.length;
   

     int i=0,j=n-1;
       while(i<=j)
       {
           if(isPrime[nums[i]] && isPrime[nums[j]])
             return j-i;
           else if( !isPrime[nums[i]] )i++;
           else  if(! isPrime[nums[j]])j--;
       }
    return 0;
    }
}