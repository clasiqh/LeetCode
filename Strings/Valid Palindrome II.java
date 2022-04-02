class Solution {
    public boolean validPalindrome(String s) {
        char[] arr = s.toCharArray();
        return check(arr, 0, s.length()-1, false);
    }
    
    public boolean check(char[] arr, int left, int right, boolean deleted){
        while(left<right){
            if(arr[left]!=arr[right]){
                if(deleted) return false;
                return check(arr, left+1, right, true) || check(arr, left, right-1, true);
            }
            left++;
            right--;
        }
        return true;
    }
}