// class Solution {
//     public int[][] merge(int[][] intervals) {
//         ArrayList<int[]> answer = new ArrayList<>();
//         //2D array sorting
//         Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
//         //start comparing from the 0th element of interval
//         int[] currentInterval = intervals[0];
//         //starting from 1st index, compare the current latest updated interval
//         for (int i = 1; i < intervals.length; i++) {
//             //if endInterval is smaller than next start, so merge depending on the bigger end
//             if (currentInterval[1] >= intervals[i][0]) {
//                 currentInterval[1] = Math.max(currentInterval[1], intervals[i][1]);
//             } // otherwise just add and update the currentInterval as the current value
//             else {
//                 answer.add(currentInterval);
//                 currentInterval = intervals[i];
//             }
//         }
//         //if the last iterated interval was updated, then it wasn't added
//         //if the last iterated interval was not updated, then the 2nd last interval got added, but not the last..
//         answer.add(currentInterval);//add manually

//         return answer.toArray(new int[answer.size()][2]);
//     }
// }

// class Solution {
//     public int[][] merge(int[][] intervals) {
//         int[][] ret = intervals;
//         int[][] prev = new int[0][0];
//         if(intervals.length==1) return intervals;
//         while (true){
//             if(ret.length == prev.length)
//             return ret;
//             prev = ret;
//             ret = func(ret);
//         }  
//     }
//     public int[][] func(int[][] intervals){
//         if(intervals.length==1) return intervals;
//         ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
//         Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
//         for(int i=0; i<intervals.length-1; i++){
//             ArrayList<Integer> temp = new ArrayList<>();
//             temp.add(intervals[i][0]);
//             if(intervals[i+1][1] <= intervals[i][1]){
//                 temp.add(intervals[i][1]);
//                 ans.add(temp);
//                 i++;
//                 continue;
//             } else if(intervals[i+1][0] <= intervals[i][1]){
//                 temp.add(intervals[i+1][1]);
//                 ans.add(temp);
//                 i++;
//                 continue;
//             } else {
//                 temp.add(intervals[i][1]);
//                 ans.add(temp);
//             }
//         }
//         int sz = ans.size();
//         int b = ans.get(sz-1).get(1);
//         if(intervals[intervals.length-1][1]<=b){
//           System.out.println("Skipping the last interval");
//         } else if(intervals[intervals.length-1][0]<=b){
//             ans.get(sz-1).set(1,intervals[intervals.length-1][1]);
//         } else {
//             ArrayList<Integer> temp = new ArrayList<>();
//             temp.add(intervals[intervals.length-1][0]);
//             temp.add(intervals[intervals.length-1][1]);
//             ans.add(temp);
//         }
//         System.out.println(ans);
//         int[][] answer = new int[ans.size() ][2];
//         int i=0;
//         for(ArrayList<Integer> arr : ans){
//             answer[i][0] = arr.get(0);
//             answer[i][1] = arr.get(1);
//             i++;
//         }
//         return answer;
//     }
// }


class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));

        List<int[]> ans = new ArrayList<>();
        int[] newInterval = intervals[0];
        ans.add(newInterval);

        for(int i = 1; i < intervals.length; i++){
            //overlap hoga ya nhi hoga
            if(intervals[i][0] <= newInterval[1]) {
                //overlap hone pe ending number kya hoga
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            } else {
            //overlap nhi hoga
                newInterval = intervals[i];
                ans.add(newInterval);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
