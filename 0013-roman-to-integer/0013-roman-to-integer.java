class Solution {
    public static int getValue(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && getValue(s.charAt(i)) < getValue(s.charAt(i + 1)))
                result -= getValue(s.charAt(i));
            else
                result += getValue(s.charAt(i));
        }

        return result;
    }
}