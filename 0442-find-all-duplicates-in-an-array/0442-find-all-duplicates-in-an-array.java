class Solution {
    public List<Integer> findDuplicates(int[] nums) {
    List<Integer> l = new ArrayList<>();
      int n= nums.length;
    int arr[] = new int[1000000];
    for(int i=0;i<n;i++)
     arr[nums[i]]++;
    for(int i=0;i<100000;i++)
     if(arr[i]==2)
       l.add(i);

     
    return l;
    }
}