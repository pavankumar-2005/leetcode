class Solution {
    public String interpret(String command) {
        String res = "";
        for(int i=0; i<command.length(); i++){
            if(command.charAt(i) == 'G'){
                res += 'G';
            }
            else if((command.charAt(i) == '(') && (command.charAt(i+1) == ')')){
                res += 'o';
                i++;
            }
            else{
                res += 'a';
                res += 'l';
                i += 3;
            }
        }
        return res;
    }
}