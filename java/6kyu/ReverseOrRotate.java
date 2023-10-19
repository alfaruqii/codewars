import java.util.ArrayList;
import java.util.List;

public class RevRot {
    public static String revRot(String str, int sz) {
        if (sz <= 0 || str.equals("") || sz > str.length()) return "";
        int chunksize = str.length() / sz;
        List<String> data = new ArrayList<>();
        String arrofchunk;
        for (int i = 0; i < chunksize; i++) {
            arrofchunk = str.substring(sz * i, sz * (i + 1));
            data.add(arrofchunk);
        }
        if (data.get(data.size() - 1).length() != sz) {
            data.remove(data.size() - 1);
        }
        for (int j = 0; j < data.size(); j++) {
            int temptotal = 0;
            for (int k = 0; k < data.get(j).length(); k++) {
                temptotal += Integer.parseInt(String.valueOf(data.get(j).charAt(k)));
            }
            if (temptotal % 2 == 0) {
                StringBuilder sb = new StringBuilder(data.get(j));
                data.set(j, sb.reverse().toString());
            } else {
                char temp = data.get(j).charAt(0);
                data.set(j, data.get(j).substring(1));
                data.set(j, data.get(j) + temp);
            }
        }
        StringBuilder result = new StringBuilder();
        for (String chunk : data) {
            result.append(chunk);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "1234567890";
        int sz = 3;
        System.out.println(revrot(str, sz));
    }
}
