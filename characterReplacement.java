class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int left=0;
        int right=0;
        int[] count=new int[26];
        int maxLen=0;
        int maxCount=0;
        while(right<n){
            count[s.charAt(right)-'A']++;
            maxCount=Math.max(maxCount,count[s.charAt(right)-'A']);
            int windowLen=right-left+1;
            if(windowLen-maxCount>k){
                count[s.charAt(left)-'A']--;
                left++;
            }
            maxLen=Math.max(maxLen,right-left+1);
            right++;
        }
        return maxLen;
    }
}
