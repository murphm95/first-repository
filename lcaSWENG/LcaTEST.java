package lcaSWENG;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;



public class LcaTEST {
	BT_NoParentPtr_Solution1 test;
	Node rootTest;
	private List<Integer> path1 = new ArrayList<>();
	private List<Integer> path2 = new ArrayList<>();

	@Before
	public void setUp() throws Exception {
		
		BT_NoParentPtr_Solution1 test = new BT_NoParentPtr_Solution1();
		test.root = new Node(1);
		test.root.left = new Node(2);
		test.root.right = new Node(3);
		test.root.left.left = new Node(4);
		test.root.left.right = new Node(5);
		test.root.right.left = new Node(6);
		test.root.right.right = new Node(7);
	}

	@Test
	public void test() {
		Assert.assertEquals(2,  test.findLCA(4, 5));
	}

}
