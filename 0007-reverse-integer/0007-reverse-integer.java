class Solution {
    public int reverse(int x) {
        String s = Integer.toString(x);
        StringBuilder sb = new StringBuilder();

        if (s.charAt(0) == '-') {
            sb.append('-');
            s = s.substring(1);
        }

        sb.append(new StringBuilder(s).reverse());

        try {
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}