class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        
        int temp = 0;
        int a = 0;
        int b = 0;
        
        for(int i = 0; i < queries.length; i++){
                
                a = queries[i][0];
                b = queries[i][1];
                
                temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;
        }
        
        answer = arr;
        return answer;
    }
}