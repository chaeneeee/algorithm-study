class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        int last = num_list[num_list.length - 1];
        int secLast = num_list[num_list.length - 2];

        for(int i=0; i<num_list.length; i++){
            answer[i] = num_list[i];
        }
        if(last > secLast){
            answer[num_list.length] = last - secLast;
        } else{
            answer[num_list.length] = last * 2;
        }
        
        return answer;
    }
}