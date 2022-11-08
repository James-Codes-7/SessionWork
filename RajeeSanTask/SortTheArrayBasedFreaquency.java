package sessiontask;

import java.util.*;

public class SortTheArrayBasedFreaquency {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SortTheArrayBasedFreaquency sortTheArrayBasedFreaquency = new SortTheArrayBasedFreaquency();
        sortTheArrayBasedFreaquency.programLogic();
    }

    private void programLogic() {
        System.out.println("Enter the array size");
        int size = scanner.nextInt(), i = 0, j = 0, temp = 0;

        System.out.println("Enter the element to the array");
        TreeSet<Integer> hashSet = new TreeSet<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (i = 0; i < size; i++) {
            temp = scanner.nextInt();
            hashSet.add(temp);
            arrayList.add(temp);
        }
        int max = 0, frequency = 0, value = 0;
        Collections.sort(arrayList);
        while (!hashSet.isEmpty()) {
            for (Integer integer1 : hashSet) {
                frequency = Collections.frequency(arrayList, integer1);
                if (frequency > max) {
                    max = frequency;
                    value = integer1;
                }
            }
            for (i = 0; i < max; i++) System.out.print(value + " ");
            hashSet.remove(value);
            max = 0;
        }
    }
}
