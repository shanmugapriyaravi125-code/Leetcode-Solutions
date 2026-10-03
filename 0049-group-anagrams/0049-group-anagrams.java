class Solution {
    boolean isAnagram(String s1,String s2)
    {
       
       char a[]=s1.toCharArray();   
       char b[]=s2.toCharArray();
      
       Arrays.sort(a);
       Arrays.sort(b);
       return Arrays.equals(a,b);
    
    }
    public List<List<String>> groupAnagrams(String[] str) {
     Set<List<String>> l =new HashSet<>();
     int n=str.length;
     for(int i=0;i<n;i++)
     {
        List<String> temp = new ArrayList<>();
        for(int j=0;j<n;j++)
        {
            if(str[i].length()==str[j].length()&&isAnagram(str[i],str[j]))
              temp.add(str[j]);
             
        }
    l.add(temp);
     }
    List<List<String>>  res = new ArrayList<>();
    for(List<String> k:l)
     res.add(k);
    return res;
          
    }
}