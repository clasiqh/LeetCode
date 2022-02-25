class Solution {
    public int compareVersion(String version1, String version2) {
        
        List<Integer> a = new ArrayList();
        List<Integer> b = new ArrayList();
        
        stringToList(version1, a);
        stringToList(version2, b);
        
        int i=0;
        while(i<Math.max(a.size(),b.size())){
            int x = 0, y = 0;
            if(i<a.size())
                x = a.get(i);
            if(i<b.size())
                y = b.get(i);
            if(x>y || x<y)
                return x>y ? 1 : -1;
            i++;
        }
        return 0;
    }
    
    static void stringToList(String str, List temp){
        int num=0;
        for(char ch: str.toCharArray()){
            if(ch=='.'){
                temp.add(num);
                num = 0;
                continue;
            }
            num = num*10+ (ch-'0');
        }
        temp.add(num);
    }
}