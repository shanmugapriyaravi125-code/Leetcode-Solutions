class Solution {
 boolean  isPrime(int n)
 {
    if(n==2)return true;
    else if(n==1||n%2==0)return false;
    else
    {
        
        for(int i=3;i<=Math.sqrt(n);i+=2)
          if(n%i==0)
            return false;
        return true;
    }
 }

    public int maximumPrimeDifference(int[] nums) {
       int n=nums.length;
   
    for(int i=0;i<n;i++)System.out.println(isPrime(nums[i]));
     int i=0,j=n-1;
       while(i<=j)
       {
           if(isPrime(nums[i]) && isPrime(nums[j]))
             return j-i;
           else if( !isPrime(nums[i]) )i++;
           else  if(! isPrime(nums[j]))j--;
       }
    return 0;
    }
}