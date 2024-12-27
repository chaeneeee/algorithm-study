import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        
        for(char t : a.toCharArray()){
            if(Character.isUpperCase(t)){
                answer += Character.toLowerCase(t);
            }else{
                answer += Character.toUpperCase(t);
            }
        }
        System.out.println(answer);
    }
}
