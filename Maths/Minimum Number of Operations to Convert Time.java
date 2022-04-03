class Solution {
    public int convertTime(String current, String correct) {
        String[] a = current.split(":"), b = correct.split(":");
        int t1 = Integer.parseInt(a[0])*60 + Integer.parseInt(a[1]);
        int t2 = Integer.parseInt(b[0])*60 + Integer.parseInt(b[1]);
        int diff = t2-t1, step = 0;
        
        int[] operations = {60, 15, 5, 1};
        
        for(int x : operations){
            step += diff/x;
            diff -= x*(diff/x);
        }

        return step;
    }
}