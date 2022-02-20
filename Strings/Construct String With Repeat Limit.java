class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        int[] arr = new int[26];
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)  // make frequency array.
            arr[s.charAt(i)-'a']++;
        
        int i=25;
        while(i>-1){  // traverse array from the end
            if(arr[i]==0){  // if empty, continue.
                i--;
                continue;
            }
            
            boolean check = true;  // when to stop. (you'll see)
            while(arr[i]!=0 && check){
                int lim = 0;
                while(lim!=repeatLimit && arr[i]!=0){  // append till limit
                    sb.append((char)(i+'a'));
                    arr[i]--;
                    lim++;
                }
                
                if(lim==repeatLimit && arr[i]!=0){ // if we reached the limit
                    int temp = i-1;
                    while(temp!=-1 && arr[temp]==0)  // find index of previous not empty character.
                        temp--;
                    if(temp==-1)  // if it doesn't exit, stop.
                        check = false;
                    else{
                        sb.append((char)(temp+'a'));  // append that character once
                        arr[temp]--;
                    }
                }
            }
            i--;
        }
        return sb.toString();
    }
}   