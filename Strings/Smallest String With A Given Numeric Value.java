class Solution {
    public String getSmallestString(int n, int k) {
        char[] arr = new char[n];
        int diff = k-n;
        for(int i=n-1;i>-1;i--){
            int curr = diff>25 ? 25 : diff;
            arr[i] = (char)('a'+curr);
            diff -= curr;
        }
        return new String(arr);
    }
}