public class Maskify {
    public static String maskify(String str) {
        if (str.length() <= 4) {
            return str;
        }

        String res = "";
        for (int i = 0; i < str.length() - 4; i++) {
            res += "#";
        }

        return res + str.substring(str.length() - 4);
    }
}

