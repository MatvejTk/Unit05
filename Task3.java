package by.id.unit05.main;

public class Task3 {
    public static void task3() {
   
        double[] array = new double[5];
        int flag = 0;

        ExportArray.enterArrayFromConsole(array);

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                flag++;
                break;
            }
        }

        if (flag > 0) {
            System.out.println("Последовательность возрастающая");
        } else {
            System.out.println("Последовательность не возрастающая");
        }
        System.out.println();
    }
}