package savednote;

import java.util.Scanner;

public class note {
    private static int i = 0;
    private static String[] value;
    private static int ch;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ch = sc.nextInt();
        value = new String[6];
        while (ch == 1 || ch == 2) {
            if (ch == 1) {
                value[i++] = "English";
                getdata();

            } else if (ch == 2) {
                value[i++] = "Spanish";
                getdata();
            }
            ch = sc.nextInt();
        }
    }

    public static void getdata() {
        String[] obj = new String[6];
        for (int j = 0; j < i; j++) {
            obj[j] = value[j];
            System.out.println(obj[j]);
        }
    }
}
