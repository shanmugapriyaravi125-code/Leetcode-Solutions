class Solution {
    public List<Integer> findLonely(int[] nums) {
    int a[]= new int[10000001];
    List<Integer> l = new ArrayList<>();
    for(int i:nums)
       a[i]++;
    for(int i:nums )
    {
     if(i==0 &&a[i+1]==0 && a[i]==1)
          l.add(0); 
     else if (i!=0 && a[i+1]==0 && a[i-1]==0 && a[i]==1)
      l.add(i); 
    
    }
return l;
    }
}