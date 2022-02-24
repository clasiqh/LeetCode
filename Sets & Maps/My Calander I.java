class MyCalendar {

    TreeMap<Integer,Integer> x = new TreeMap<>();
    
    public boolean book(int start, int end) {
        if(x.containsKey(start))
            return false;

        Integer low = x.lowerKey(start); // key lower or equal to start
        Integer high = x.ceilingKey(start);  // key greater or equal to start
        
        if( (low==null || x.get(low)<=start) && (high==null || high>=end) ) {
            x.put(start, end);
            return true;
        }
        return false;
    }
}