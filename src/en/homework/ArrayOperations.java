package en.homework;

public class ArrayOperations {
	

	public static void main(String[] args) {
		int[] numbers= {1, -4, 5};
		ArraySort as;
		as=ArraySort.SORTUP;
		as.getSort(numbers);
		for (int i : numbers) {
			System.out.print(i+" ");
		}
		as=ArraySort.SORTDOWN;
		as.getSort(numbers);
		System.out.println();
		for (int i : numbers) {
			System.out.print(i+" ");
		}
	}
}
