package by.id.unit05.main;

public class Task4 {

    public static void task4() {

        int[] array = new int[8];
        int[] newArray = new int[8];
        int flag = 0;

        ExportArray.enterArrayFromConsole(array);

        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                newArray[j] = array[i];
                j++;
                flag++;
            }
        }

        if (flag > 0) {
        	ExportArray.printArray(newArray);
        } else {
            System.out.println("Последовательность не содержит четных чисел");
        }
        System.out.println();
    }
}
