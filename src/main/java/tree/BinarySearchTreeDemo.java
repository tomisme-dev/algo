package tree;

import java.util.Arrays;
import java.util.List;

/**
 * 二叉查找树
 * */
public class BinarySearchTreeDemo {
	static List<Integer> is = Arrays.asList(100, 101, 76, 98, 158, 48, 89, 180, 89, 145);
//	static List<Integer> is = Arrays.asList(100);
	public static void main(String[] args) {
		BinarySearchTree<Integer> tree = new BinarySearchTree<>();
		
		for (Integer i : is) {
			tree.add(i);
		}
		
		String s = tree.toString();
		
		System.out.println(tree.contains(79));
		System.out.println(tree.contains(98));
		
	}
}
