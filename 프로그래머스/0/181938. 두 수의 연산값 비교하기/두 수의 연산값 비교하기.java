class Solution {
    public int solution(int a, int b) {
        String str1 = String.valueOf(a);
        String str2 = String.valueOf(b);
        return Math.max(Integer.parseInt(str1+str2), 2*a*b);
    }
}