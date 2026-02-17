class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int start[], int end[]) {
        // add your code here
        int n = start.length;
         //  meetings as (end_time, start_time)
        int[][] meeting = new int[n][2];
        for ( int i = 0 ; i < n ; i++){
            meeting[i][0] = end[i];
            meeting[i][1] = start[i]; 
        }
        // sort end time asc
        Arrays.sort(meeting, (a,b) -> a[0]- b[0]);
        //greed to pick meet
        int cnt = 1 ;
        int lastEnd = meeting[0][0];
        
        for ( int i = 1 ; i <n ; i++){
            if (meeting[i][1]> lastEnd){
                cnt++;
                lastEnd = meeting[i][0];
            }
        }
        return cnt;
        
    }
}
