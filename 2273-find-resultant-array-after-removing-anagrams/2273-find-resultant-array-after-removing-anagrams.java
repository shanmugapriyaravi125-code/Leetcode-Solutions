class Solution {
    String sortChar(String s)
    {
        char c[] = s.toCharArray();
        Arrays.sort(c);
       return String.valueOf(c);
    }
    public List<String> removeAnagrams(String[] words) {
    List<String>  l = new ArrayList<>();
    int n = words.length;
    l.add(words[0]);
 
  
    for(int i=1;i<n;i++)
    {
        String s1=sortChar(l.getLast());
        String s2=sortChar(words[i]);
        if(!s1.equals(s2))
         l.add(words[i]);
    }
       
return l;    
    }
}