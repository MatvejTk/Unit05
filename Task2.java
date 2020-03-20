 package by.id.unit05.main;

public class Task2 {
    public static void task2() {
  
        int[] array = new int[8];
        int[] newArray = new int[8];

        ExportArray.enterArrayFromConsole(array);

        for (int i = 0, n = 0; i < array.length; i++) {
            if (array[i] == 0) {
                newArray[n] = i;
                n++;
            }
        }

        System.out.println("Массив с нулевыми элементами:");

        ExportArray.printArray(newArray);
        System.out.println();
    }
}