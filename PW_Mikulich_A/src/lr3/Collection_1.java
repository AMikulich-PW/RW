package lr3;

	 import java.util.Arrays;

	 public class Collection_1<T> {
	     T[] items;
	     int count;

	     public Collection_1() {
	         this.count = 10;
	     }

	     public Collection_1(int count) {
	         items =(T[]) new Fruit[count];
	         this.count = 0;
	     }

	     public void add(T item) {
	         if (count >= items.length) {
	             increaseCollection();
	         }
	         items[count++] = item;
	     }

	     private void increaseCollection() {
	         T[] tmp = (T[]) new Fruit[items.length + 2];
	         System.arraycopy(items, 0, tmp, 0, items.length);
	         items = tmp;
	     }

	     public void remove(int index) {
	         for (int i = index; i < items.length - 1; i++) {
	             items[i] = items[i + 1];
	         }
	         items[items.length - 1] = null;
	         count--;
	     }

	     public void remove(Fruit item) {
	         int index = 0;
	         boolean nashel = false;
	         while (index < count) {
	             if (items[index] == item) {
	                 remove(index);
	                 nashel = true;
	                 break;
	             }
	             index++;
	         }
	         if (nashel) {
	             System.out.println("Ok!");
	         } else System.out.println("Не найден");
	     }

	     public void print() {
	         Arrays.stream(items).forEach(items -> System.out.println(items));
	         System.out.println((count));
	         System.out.println(items.length);
	     }

	     public int size() {
	         return count;
	     }

	     public T get(int index) {
	         if (index < count) {
	             return items[index];
	         } else {
	             System.out.println("Нет такого элемента");
	             return null;
	         }
	     }

	     public void clear()
	     {
	         for(int i=0;i<count;i++)
	         {
	             items[i]=null;
	         }
	         count=0;
	     }
	     public static void main(String[] args){
	         Apple A1 = new Apple(1);
	         Orange O1 = new Orange(3);
	         Orange O2 = new Orange(4);
	         Collection_1 stringCollection = new Collection_1(3);
	         stringCollection.add(A1);
	         stringCollection.add(O1);
	         stringCollection.add(O2);
	         stringCollection.print();
	         stringCollection.remove(3);
	         stringCollection.remove(O1);
	         stringCollection.remove(O2);
	         System.out.println(stringCollection.get(1));
	         System.out.println(stringCollection.get(3));
	         stringCollection.clear();
	         stringCollection.print();
	     }

	 }

