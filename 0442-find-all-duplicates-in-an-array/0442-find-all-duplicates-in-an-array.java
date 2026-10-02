class Solution {
    public List<Integer> findDuplicates(int[] nums) {
    List<Integer> l = new ArrayList<>();
      int n= nums.length;
      if(n<2)return l;
    int arr[] = new int[n+1];
    for(int i=0;i<n;i++)
     arr[nums[i]]++;
    for(int i=0;i<n+1;i++)
     if(arr[i]==2)
       l.add(i);

     
    return l;
    }
}