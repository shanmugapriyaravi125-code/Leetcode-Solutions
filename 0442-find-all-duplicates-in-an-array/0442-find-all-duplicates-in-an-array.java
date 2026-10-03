class Solution {
    public List<Integer> findDuplicates(int[] nums) {
    List<Integer> l = new ArrayList<>();
     Set<Integer> st = new TreeSet<>();
     for(int i:nums)
     {
     if(st.add(i)){}
       
     else
     l.add(i);  
     }
return l;
    }
}