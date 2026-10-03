class Solution {
    public List<Integer> findDuplicates(int[] nums) {
    List<Integer> l = new ArrayList<>();
   
   int n= nums.length;
   int index;
   for(int i=0;i<n;i++)
   {
     index = Math.abs(nums[i])-1;
     if(nums[index]>0)
      nums[index]=- nums[index];
    else
     l.add(Math.abs(nums[i]));
   }

return l;
    }
}