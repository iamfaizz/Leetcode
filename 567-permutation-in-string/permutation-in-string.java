class Solution {
    public static String sorted(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    public boolean checkInclusion(String s1, String s2) {
        int right = 0, left = 1;
        int k = s1.length();
        s1 = sorted(s1);
        if (s1.length() > s2.length()) {
            return false;
        }

        if (s1.equals(sorted(s2.substring(0, k)))) {
            return true;
        }

        for (int i = k; i < s2.length(); i++) {
            if (s1.equals(sorted(s2.substring(left, i + 1)))) {
                return true;
            } else {
                left++;
            }
        }
        return false;
    }
}