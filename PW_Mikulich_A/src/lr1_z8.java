public class lr1_z8 {
	 public static void main(String[] args) {
	      double[] myList = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
	      double max = myList[0];
	      for (int i = 1; i < myList.length; i++) {
	         if (myList[i] > max) max = myList[i];
	      }
	      System.out.println("Наибольший элемент: " + max);
	      double sumPCh = 0;
	      for (int i = 0; i < myList.length; i++) {
	        if (myList[i]>0) sumPCh += myList[i];
	      }
	      System.out.println("Сумма положительных чисел " + sumPCh);
	      double sumOCh = 0;
	      for (int i = 0; i < myList.length; i++) {
	        if ((myList[i]<0) & (myList[i]%2 == 0)) sumOCh += myList[i];
	      }
	      System.out.println("Сумма четных отрицательных чисел " + sumOCh);
	      double kolP = 0;
	      for (int i = 0; i < myList.length; i++) {
	        if (myList[i]>0) kolP++;
	      }
	      System.out.println("Количество положительных чисел " + kolP);
	      double sumOCh1 = 0;
	      double kolO = 0;
	      for (int i = 0; i < myList.length; i++) {
	        if (myList[i]<0) {
	        	kolO++; 
	        	sumOCh1 += myList[i];
	        }
	      }
	      System.out.println("Среднее арифметическое отрицательных чисел " + sumOCh1/kolO);
}
	 
	 
}