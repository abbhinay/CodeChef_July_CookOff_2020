import java.util.*;
import java.io.*;

class EVENTUAL {
    public static void main(String[] args) throws IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int z = 0; z < t; z++) {
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            HashMap<Character, Integer> map = new HashMap<>();
            int i = 0;
            for (i = 0; i < n; i++) {
                if (!map.containsKey(str.charAt(i))) {
                    map.put(str.charAt(i), 1);
                } else {
                    map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
                }
            }
            boolean flag = true;
            for (Map.Entry m : map.entrySet()) {
                if ((int) m.getValue() % 2 != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}