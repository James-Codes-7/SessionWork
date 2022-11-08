package sessiontask;

import javax.swing.*;
import java.util.*;

public class PushSevenLastPossition {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        PushSevenLastPossition placeSevenLastPossition = new PushSevenLastPossition();
        placeSevenLastPossition.programLogic();
    }

    private void programLogic() {
        System.out.println("Enter the array size");
        int size = scanner.nextInt();

        System.out.println("Enter the element to the array");
        int array[] = new int[size], i = 0, temp = 0, j = 0;
        for (i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        for (i = 0; i < size; ) {
            if (array[i] != 7) {
                i++;
                j++;
                continue;
            } else {
                if (j == size) break;
                while (j < size && array[j] == 7) {
                    j++;
                }
            }
            if (j < size && i < size) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
