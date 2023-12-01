import java.io.*;
import java.util.ListIterator;
import java.util.LinkedList;

public class B_1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine(); // 문자열 입력

        LinkedList<Character> text = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            text.add(str.charAt(i));
        }

        ListIterator<Character> t = text.listIterator(); // 인덱스 위치

        while (t.hasNext()) {
            t.next(); // 인덱스 맨 끝에 위치
        }

        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            String command = br.readLine();
            char c = command.charAt(0);

            switch (c) {
                case 'L' :
                    if (t.hasPrevious()) {
                        t.previous(); // 커서 앞
                    }
                    break;
                case 'D' :
                    if (t.hasNext()) {
                        t.next(); // 커서 뒤
                    }
                    break;
                case 'B':
                    if (t.hasPrevious()) {
                        t.previous();
                        t.remove();
                    }
                    break;
                case 'P':
                    char p = command.charAt(2);
                    t.add(p);
                    break;
            }


        }
        for (Character s : text) {
            bw.write(s);
        }
        bw.flush();
        bw.close();



    }
}
