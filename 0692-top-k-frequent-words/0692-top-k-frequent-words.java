class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        Map<String,Integer> map = new HashMap<>();
        for(String i:words)
         map.put(i,map.getOrDefault(i,0)+1);
        
        List<Map.Entry<String,Integer>> l  = new ArrayList<>(map.entrySet());
        l.sort((a,b)->
        {
            if(Integer.compare(b.getValue(),a.getValue())==0)
             return a.getKey().compareTo(b.getKey());
            else
             return Integer.compare(b.getValue(),a.getValue());
        });
        List<String> res =new ArrayList<>();
for(int i=0;i<k;i++){
    res.add(l.get(i).getKey());
}


     


 

return res;
    }
}