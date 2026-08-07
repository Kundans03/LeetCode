class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";

        StringBuilder ans = new StringBuilder(strs[0]);

        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < ans.length()) {
                ans.setLength(0);
                ans.append(strs[i]);
            }
        }

        for (int i = 0; i < strs.length; i++) {
            if (ans.length() == 0) return "";
            if (strs[i].compareTo(ans.toString()) == 0) continue;
            for (int n = 0; n < ans.length(); n++) {
                if (strs[i].charAt(n) != ans.charAt(n)) {
                    ans.delete(n, ans.length());
                }
            }
        }

        return ans.toString();
    }
}