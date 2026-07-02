class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int[][] units = new int[boxTypes.length][3];
        for(int i=0; i<boxTypes.length; i++){
            units[i][0] = i;
            units[i][1] = boxTypes[i][0];
            units[i][2] = boxTypes[i][1];
        }
        Arrays.sort(units, Comparator.comparingDouble(o -> o[2]));
        int sum = 0;
        for(int i=units.length - 1; i>=0; i--){
            if(truckSize >= units[i][1]){
                sum += (units[i][1] * units[i][2]);
                truckSize -= units[i][1];
            }
            else{
                sum += (truckSize * units[i][2]);
                truckSize = 0;
                break;
            }
        }
        return sum;
    }
}