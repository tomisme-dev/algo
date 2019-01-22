package tree;

import org.apache.commons.lang3.StringUtils;

public class BinarySearchTree<T extends Comparable<? super T>> {
	BinaryNode<T> root = null;
	
	
	public BinarySearchTree(T element) {
		root = new BinaryNode<>(element);
	}
	

	public BinarySearchTree() {
		root = null;
	}
	
	
	public void add(T t) {
		if(root == null) {
			root = new BinaryNode<>(t);
			return;
		}
		
		BinaryNode<T> parent = root;
		BinaryNode<T> tmp = root;
		boolean isLeft = true;
		
		while(tmp != null) {
			parent = tmp;
			if(t.compareTo(tmp.getElement()) < 0) {
				tmp = tmp.leftChild;
				isLeft = true;
			} else {
				tmp = tmp.rightChild;
				isLeft = false;
			}
		}
		
		BinaryNode<T> newBinaryNode = new BinaryNode<>(t);
		if(isLeft) {
			parent.setLeftChild(newBinaryNode);
		} else {
			parent.setRightChild(newBinaryNode);
		}

	}

	@Override
	public String toString() {	
		printBinaryNode(root, 0, "");
		return "BinarySearchTree []";
	}
	
	
	public void printBinaryNode(BinaryNode<T> root, int depth, String prex) {
		if(root == null) {
			return;
		} else {
//			打印当前节点
			System.out.println(StringUtils.repeat(prex, depth) + root.getElement());
//			打印左叶子
			printBinaryNode(root.leftChild, depth + 1, "--");
//			打印右叶子
			printBinaryNode(root.rightChild, depth + 1, "++");
		}
	}
	
	/**
	 * @param element 需要删除的值
	 * @param root 需要删除的树的根节点
	 * @return 删除后的根节点
	 * 
	 * */
	public BinaryNode<T> remove(T element, BinaryNode<T> root) {
		if(element == null) {
			return root;
		}
		
		int cmp = element.compareTo(root.getElement());
		if(cmp == 0 && root.leftChild != null && root.rightChild != null) {
			root.element = findMin(root.rightChild);
			root.rightChild = remove(element, root.rightChild);
			return root;
		} else if(cmp < 0) {
			root.leftChild = remove(element, root.leftChild);
			return root;
		} else if(cmp > 0) {
			root.rightChild = remove(element, root.rightChild);
			return root;
		} else {
			return root.leftChild != null? root.leftChild: root.rightChild;
		}
	}
	
	private T findMin(BinaryNode<T> root) {
		if(root.leftChild == null) {
			return root.getElement();
		} else {
			return findMin(root.leftChild);
		}
	}


	public boolean contains(T element) {
		return contains(element, root);
	}
	
	private boolean contains(T element, BinaryNode<T> root) {
		if(root == null) {
			return false;
		}
		
		int cmp = element.compareTo(root.element);
		if(cmp == 0) {
			return true;
		} else if(cmp < 0) {
			return contains(element, root.leftChild);
		} else {
			return contains(element, root.rightChild);
		}
	}







	private static class BinaryNode<T> {
		T element;
		BinaryNode<T> leftChild;
		BinaryNode<T> rightChild;
		
		public BinaryNode(T element) {
			this(element, null, null);
		}

		public BinaryNode(T element, BinaryNode<T> leftChild, BinaryNode<T> rightChild) {
			super();
			this.element = element;
			this.leftChild = leftChild;
			this.rightChild = rightChild;
		}
		
		public T getElement() {
			return element;
		}
		public void setElement(T element) {
			this.element = element;
		}
		public BinaryNode<T> getLeftChild() {
			return leftChild;
		}
		public void setLeftChild(BinaryNode<T> leftChild) {
			this.leftChild = leftChild;
		}
		public BinaryNode<T> getRightChild() {
			return rightChild;
		}
		public void setRightChild(BinaryNode<T> rightChild) {
			this.rightChild = rightChild;
		}
	}
}
