class Solution {
    public String convertDateToBinary(String date) {
        String[] parts = date.split("-");
        String yearBinary = Integer.toBinaryString(Integer.parseInt(parts[0]));
        String monthBinary = Integer.toBinaryString(Integer.parseInt(parts[1]));
        String dayBinary = Integer.toBinaryString(Integer.parseInt(parts[2]));
        return yearBinary + "-" + monthBinary + "-" + dayBinary;
    }
}