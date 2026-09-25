class Solution {
    
    class Pair{
        char ch;
        int freq;
        Pair(char ch, int freq){
            this.ch=ch;
            this.freq=freq;
        }
    }
    public int leastInterval(char[] tasks, int n) {
        int m=tasks.length;
        HashMap<Character,Integer> freq=new HashMap<>();
        HashMap<Character,Integer> free=new HashMap<>();

        for(char ch:tasks){
            freq.put(ch,freq.getOrDefault(ch,0)+1);
            free.put(ch,0);
        }

        PriorityQueue<Pair> pq=new PriorityQueue<>(

            (a,b)->b.freq-a.freq
        );

        for(char ch:freq.keySet()){
            pq.add(new Pair(ch,freq.get(ch)));
        }
        
        int seat=0;
        while(!pq.isEmpty()){
            ArrayList<Pair> pulled=new ArrayList<>();
            boolean executed=false;
            while(!pq.isEmpty()){
                Pair p=pq.poll();
                char ch=p.ch;
                int fr=p.freq;
                

                if(free.get(ch)<=seat){
                    seat++;
                    executed=true;
                    if(fr>1){
                        pq.add(new Pair(ch,fr-1));
                        free.put(ch,seat+n);
                        
                    }
                    break;
                }else{
                    pulled.add(p);
                }
            }
            for(Pair p:pulled){
               pq.add(p);
            }

                if(!executed && !pq.isEmpty()){
                    seat++;
                }
            
        }
        return seat;
    }
}