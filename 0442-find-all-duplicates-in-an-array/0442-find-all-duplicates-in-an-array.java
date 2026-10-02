class Solution {
    public List<Integer> findDuplicates(int[] nums) {
    List<Integer> l = new ArrayList<>();
    int n= nums.length;
    Arrays.sort(nums);
    for(int i=1;i<n;i++)
      if(nums[i]==nums[i-1])
       l.add(nums[i]);
return l;
    }
}