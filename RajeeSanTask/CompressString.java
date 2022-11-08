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
        int size = word.length(), i = 0, count = 0;
        for (i = 0; i < size; i++) {
            temp += word.charAt(i);
            count = word.lastIndexOf(word.charAt(i));
            if (i != count) temp += (count - i + 1);
            i = count;
        }
        System.out.println(temp);
    }
}
