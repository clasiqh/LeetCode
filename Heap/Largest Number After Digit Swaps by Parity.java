class Solution {
    public int largestInteger(int num) {
        PriorityQueue<Integer> even = new PriorityQueue<>();
        PriorityQueue<Integer> odd = new PriorityQueue<>();
        int temp = num, count = 0;
        while(temp!=0){
            if(temp%2==0) even.add(temp%10);
            else odd.add(temp%10);
            temp /= 10;
        }
        
        temp = 0;
        while(num!=0){
            if(num%2==0)
                temp += even.poll()*Math.pow(10, count);
            else
                temp += odd.poll()*Math.pow(10, count);
            num /= 10;
            count++;
        }
        return temp;
    }
}