class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
    
    int n=messages.length;
    int m=senders.length;
    Map<String,Integer> map=new HashMap<>();
    for(int i=0;i<n;i++)
    {
        String[] s = messages[i].split(" ");
        map.put(senders[i],map.getOrDefault(senders[i],0)+s.length);
    }
   List<Map.Entry<String,Integer>> l = new ArrayList(map.entrySet());
   l.sort((a,b)->{
   if(Integer.compare(b.getValue(),a.getValue())==0)
       return b.getKey().compareTo(a.getKey());
    else
     return Integer.compare(b.getValue(),a.getValue());
    });
   
return l.get(0).getKey();
        
    }
}