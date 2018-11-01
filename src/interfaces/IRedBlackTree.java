package interfaces;

import collections.RedBlackNode;

public interface IRedBlackTree<A extends Comparable<A>> {
	
	public RedBlackNode<A> getRoot();
	public void insert_balance(RedBlackNode<A> z);
	public void leftRotate(RedBlackNode<A> x);
	public void rightRotate(RedBlackNode<A> x);
	public void insertRB(A elem);
	public void Limpiar();
	public void deleteSentinels(RedBlackNode<A> x);
	public void creatSentinel(RedBlackNode<A> x);
	public void deleteRB(A elem);
	public void fixedUp(RedBlackNode<A> x);
	public void inOrder(RedBlackNode<A> r);
	public void preOrder(RedBlackNode<A> r);
	public void postOrder(RedBlackNode<A> r);
	
	

}
