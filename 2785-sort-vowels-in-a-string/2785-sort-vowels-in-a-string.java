class Solution {
    boolean isVowel(char c)
    {
        char ch = Character.toLowerCase(c);
        if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
         return true;
        return false;
           
        }
    public String sortVowels(String s) {
        int  n= s.length();
        List<Character> l = new ArrayList<>();
        for(char c:s.toCharArray())
        {
            if(isVowel(c))
             l.add(c);
            }
          Collections.sort(l);
          System.out.println(l);
            int i=0;
    StringBuffer sb = new StringBuffer("");
        for(char c:s.toCharArray())
    {
        if(isVowel(c))
         sb.append(l.get(i++));
        else
        sb.append(c);
    }
return new String(sb);
    }
}