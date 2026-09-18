class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
      int m= happiness.length;
      long ans=0;
      Arrays.sort(happiness);
      for(int i=0;i<k;i++)
        if(happiness[--m]-i >0)
         ans+=happiness[m]-i ;
         
        
      
    return ans;
    }
}