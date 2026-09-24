class Solution {
    public String reorganizeString(String s) {
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char x:s.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        for(int freq:map.values()){
            if(freq>(n+1)/2){
                return "";
            }
        }
        PriorityQueue<Character> pq=new PriorityQueue<>(
            (x,y)->map.get(y)-map.get(x)
        );

        for(char x:map.keySet()){
            pq.add(x);
        }

        StringBuilder res=new StringBuilder();

        while(!pq.isEmpty()){
            char first=pq.poll();
            if(res.length()>0 && res.charAt(res.length()-1)==first){

                if(pq.isEmpty()){
                    return "";
                }

                char second=pq.poll();
                res.append(second);

                map.put(second,map.get(second)-1);
                if(map.get(second)>0){
                    pq.add(second);
                }
                pq.add(first);

            }else{

                res.append(first);

                map.put(first,map.get(first)-1);
                if(map.get(first)>0){
                    pq.add(first);
                }

            }
        }
        return res.toString();



    }
}