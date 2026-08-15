class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            int len = 1;
            HashSet<Character> map = new HashSet<>();
            map.add(s.charAt(i));

            for (int j = i + 1; j < s.length(); j++) {
                if (!map.contains(s.charAt(j))) {
                    map.add(s.charAt(j));
                    len++;
                } else {
                    break;
                }
            }

            if (maxLen < len)
                maxLen = len;

        }
        return maxLen;
    }
}