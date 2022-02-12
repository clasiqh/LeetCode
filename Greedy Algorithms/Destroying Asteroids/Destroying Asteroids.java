class Solution {
    public boolean asteroidsDestroyed(int m, int[] asteroids) {
        long mass = m;
        Arrays.sort(asteroids);
        for(int i: asteroids){
            if(mass<i)
                return false;
            mass+=i;
        }
        return true;
    }
}