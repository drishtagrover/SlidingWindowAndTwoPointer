class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int ws=0;
        int we=0;
        int len=Integer.MIN_VALUE;
        HashSet<Character> set= new HashSet<>();
        while(we<n){
            char ch=s.charAt(we);
            if(set.contains(ch)){
                while(ws<we && set.contains(ch)){
                    set.remove(s.charAt(ws));
                    ws++;
                }
            }
            set.add(ch);
            len=Math.max(len,we-ws+1);
            we++;
        }
        return (len==Integer.MIN_VALUE)? 0: len;
    }
}
