class Solution {
    public double average(int[] salary) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        double sum = 0;
        for(int sal : salary){
            if(max<sal) max = sal;
            if(sal<min) min = sal;
            sum+= sal;
        }
        return (sum-min-max)/(salary.length-2);
    }
}