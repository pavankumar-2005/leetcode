class Solution {
    public double angleClock(int hour, int minutes) {
        double min1 =  Math.abs((30 * hour) - (5.5 * minutes));
        return Math.min(min1, Math.abs(360 - min1));
    }
}