class Solution {
    public String reverseWords(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        String[] arr = s.trim().split("\\s+"); // Trim and split by one or more spaces
        StringBuilder sb = new StringBuilder();
        
        for (int i = arr.length - 1; i > 0; i--) {
            sb.append(arr[i]);
            sb.append(" ");
        }
        
        sb.append(arr[0]); // Append the first element without extra space
        
        return sb.toString();
    }
}
