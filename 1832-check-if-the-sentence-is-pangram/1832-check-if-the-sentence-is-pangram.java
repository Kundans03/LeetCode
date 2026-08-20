class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] alphabet = new boolean[26];

        for(int idx=0; idx<sentence.length(); idx++){
            int chCode = sentence.charAt(idx)-'a';
            alphabet[chCode] = true;
        }

        for(int idx=0; idx<alphabet.length; idx++){
            if(!alphabet[idx]) return false;
        }

        return true;
    }
}