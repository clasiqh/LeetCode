public List<Integer> findLonely(int[] nums) {
    
    HashSet<Integer> x = new HashSet<>();
    HashSet<Integer> dup = new HashSet<>();
    
    for(int i: nums){
        if(x.contains(i))
            dup.add(i);
        else
            x.add(i);
    }
	
	List<Integer> res = new ArrayList<>();
    for(int i : nums){
        if(dup.contains(i) || x.contains(i-1) || x.contains(i+1))
            continue;
        res.add(i);
    }
    
    return res;
}