package sessiontask;

import java.util.Arrays;
import java.util.Scanner;

public class CompressString {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        CompressString compressString = new CompressString();
        compressString.programPage();

    }

    private void programPage() {
        System.out.println("Enter the String");
        String word = scanner.next(), temp = "";
        int size = word.length(), i = 0, count = 1;
        temp += word.charAt(0);
        for (i = 1; i < size; ) {
            if (word.charAt(i - 1) != word.charAt(i)) {
                if (count != 1)
                    temp += "" + count;
                temp += word.charAt(i);
                count = 1;
                i++;
            } else {
                count++;
                i++;
            }
        }
        if (count > 1) temp += "" + count;
        System.out.println(temp);
    }
}
