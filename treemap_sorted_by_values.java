//Question - find top k elements by frequency in an array

class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>(
        // new Comparator<Map.Entry<Integer,Integer>>() {
        //     @Override public int compare(Map.Entry<Integer,Integer> e1, Map.Entry<Integer,Integer> e2) {
        //         int res = e1.getValue().compareTo(e2.getValue());
        //         return res != 0 ? res : 1;
        //     }
        // }
            // new ValueComparator()
        );
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i], map.get(nums[i])+1);
            }
        }
        
        
        
//         for(Map.Entry<Integer,Integer> entry: map.entrySet()){            
//             System.out.println(entry.getKey()+" "+entry.getValue());
//         }
        
        Map<Integer, Integer> sortedmap = sort(map);
        
        for(Map.Entry<Integer,Integer> entry: sortedmap.entrySet()){            
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        
        
        // Iterator it;
        int j=0;
        List<Integer> ans = new ArrayList<>();
        // while(j<k){
            
            for(Map.Entry<Integer,Integer> entry: sortedmap.entrySet()){
                // it.next();   
                
                if(j>=k){
                    break;
                }
                // System.out.println(entry.getKey()+" "+entry.getValue()+" "+j);
                ans.add(entry.getKey());
                j++;
            }
            
        // }
        
        return ans;
        
        
    }
    
    public Map<Integer, Integer> sort(Map<Integer, Integer> map){
        
        List<Map.Entry<Integer,Integer>> list = new LinkedList<Map.Entry<Integer,Integer>>(map.entrySet());
        
        Collections.sort(list, new Comparator<Map.Entry<Integer,Integer>>(){
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2){
                return (o2.getValue()).compareTo(o1.getValue());
            }
            
            
        });
        
        Map<Integer, Integer> resp = new LinkedHashMap<Integer, Integer>();
        for(Map.Entry<Integer,Integer> entry: list){
            
            resp.put(entry.getKey(),entry.getValue());
        }
        
        return resp;
        
        
    }
}
