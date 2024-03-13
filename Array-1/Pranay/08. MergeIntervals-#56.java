class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> answer = new ArrayList<>();
        //2D array sorting
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        //start comparing from the 0th element of interval
        int[] currentInterval = intervals[0];
        //starting from 1st index, compare the current latest updated interval
        for (int i = 1; i < intervals.length; i++) {
            //if endInterval is smaller than next start, so merge depending on the bigger end
            if (currentInterval[1] >= intervals[i][0]) {
                currentInterval[1] = Math.max(currentInterval[1], intervals[i][1]);
            } // otherwise just add and update the currentInterval as the current value
            else {
                answer.add(currentInterval);
                currentInterval = intervals[i];
            }
        }
        //if the last iterated interval was updated, then it wasn't added
        //if the last iterated interval was not updated, then the 2nd last interval got added, but not the last..
        answer.add(currentInterval);//add manually

        return answer.toArray(new int[answer.size()][2]);
    }
}
