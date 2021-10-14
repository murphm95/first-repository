package lcaSWENG;

import static org.junit.Assert.*;



import org.junit.Test;

public class LCATestFile {
	@Test
	public void test() {
		Tree a=new Tree(2);
		Tree b=new Tree(3);
		a.left=b;
		
		Tree c=new Tree(4);
		a.right=c;
		
		Tree d=new Tree(5);
		Tree e=new Tree(6);
		b.right=e;
		b.left=d;
				
		Tree f=new Tree(7);
		Tree g=new Tree(8);
		Tree h=new Tree(9);
		c.right=g;
		c.left=f;
		
		d.left=h;
		
		LCA test= new LCA();
		assertEquals(5,test.lowestCommonAncestor(a, h, d).val);
	}
	@Test
	public void test2() {
		Tree a=new Tree(2);
		Tree b=new Tree(3);
		a.left=b;
		
		Tree c=new Tree(4);
		a.right=c;
		
		Tree d=new Tree(5);
		Tree e=new Tree(6);
		b.right=e;
		b.left=d;
				
		Tree f=new Tree(7);
		Tree g=new Tree(8);
		Tree h=new Tree(9);
		c.right=g;
		c.left=f;
		
		d.left=h;
		
		LCA test= new LCA();
		assertEquals(2,test.lowestCommonAncestor(a, h, f).val);
	}

}
