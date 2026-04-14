class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()){
            if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){
                sb.append(Character.toLowerCase(ch));
            }
            else if(ch >= '0' && ch <= '9'){
                sb.append(ch);
            }
        }
        System.out.print(sb.toString());
        if(sb.toString().equals(sb.reverse().toString())){
            return true;
        }
        else{
            return false;
        }
    }
}
