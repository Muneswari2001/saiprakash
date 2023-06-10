package task1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Lists {

/**This is a comment Added manually */

	public static void main(String[] ages) {

		Scanner scanner = new Scanner(System.in);

		List<Integer> list1 = new LinkedList<>(); // using arraylist (or) likedlist
		List<Integer> list2 = new LinkedList<>();
		System.out.println("how many elements you have list1");
		int n = scanner.nextInt();

		System.out.println("Enter elements for list1:");
		for (int i = 0; i < n; i++) {
			list1.add(scanner.nextInt());
		}
		removeDuplicates(list1);
		System.out.println("how many elements you have list2");
		int m = scanner.nextInt();
		System.out.println("Enter elements for list2:");
		for (int i = 0; i < m; i++) {
			list2.add(scanner.nextInt());
		}
		List<Integer> commonElements = new ArrayList<>(list1);
		commonElements.retainAll(list2);
		System.out.println("list1 and list2 common elements \n" + commonElements);
		System.out.println("......palindrome elements.....");
		for (Integer element : commonElements) {

			if (isPalindrome(element)) {

				System.out.println(element);
			}
			
		}
		System.out.println("no palindrome elements");

	}

	public static void removeDuplicates(List<Integer> list) {
		HashSet<Integer> set = new HashSet<>(list);// using linkehashset (or)threeset
		list.clear();
		list.addAll(set);
	}

	private static boolean isPalindrome(Integer element) 
	{
		String str = String.valueOf(element);
		int a = 0;
				int  b = str.length() - 1;
		while ( a < b )
		{
			if (str.charAt(a) != str.charAt(b))
			{
				return false;
			}
			a++;
			b--;
		}

		return true;
	}

}
