package by.id.unit05.main;

public class Task1 {
	    public static void task1() {
	        int k = 5;
	        int[] a = new int[8];
	        int sum = 0;

	        ExportArray.enterArrayWithRandom(a);
	        ExportArray.printArray(a);

	        for (int i = 0; i < a.length; i++) {
	            if (a[i] % k == 0) {
	                sum += a[i];
	            }
	        }

	        System.out.println("Сумма элементов, кратных " + k + ", равна " + sum);
	        System.out.println();
	    }
	}
