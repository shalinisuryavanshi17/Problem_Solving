import java.util.*;

public class EncryptString {
    public static String getEncrypString(String str) {

        char arr[] = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != '%' && arr[i] != '-' && arr[i] != ':' && arr[i] != ';' && arr[i] != ',' && arr[i] != '.') {
                if (arr[i] >= 65 && arr[i] <= 90) {
                    char s = arr[i];
                    s += 4;
                    if (s >= 90) {
                        s = 'A';
                        s += 2;
                    }
                    arr[i] = s;
                } else if (arr[i] >= 97 && arr[i] <= 122) {
                    char S = arr[i];
                    S += 4;
                    arr[i] = S;

                } else if (arr[i] >= '0' && arr[i] <= '9') {
                    char d = arr[i];

                    d += 4;

                    arr[i] = d;
                }

            } else {
                continue;
            }

        }
        String encrytedString = "";
        for (int i = 0; i < arr.length; i++) {
            encrytedString += arr[i];
        }
        return encrytedString;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        System.out.println(getEncrypString(str));
    }
}
