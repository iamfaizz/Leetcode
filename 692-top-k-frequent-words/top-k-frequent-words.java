class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        HashMap<String,Integer> map=new HashMap<>();

        for(String x:words){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        PriorityQueue<String> pq=new PriorityQueue<>(
            (x,y)-> {
                if(map.get(x).equals(map.get(y))){
                    return y.compareTo(x);
                }
            return map.get(x)-map.get(y);
            }
        );

        for(String x:map.keySet()){
            pq.add(x);

            if(pq.size()>k){
                pq.poll();
            }
        }

        List<String> ans=new ArrayList<>();
        while(!pq.isEmpty()){
            ans.add(pq.poll());
        }
        Collections.reverse(ans);

        return ans;
    }
}