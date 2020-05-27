
public class test {

	public static void main(String[] args) {
		BTree<Integer> Ofer = new BTree<Integer>(2);
//		buildRandTree(Ofer,20,100);
//		buildTree(Ofer,20,100);
//		insertToTree(Ofer,10,5);
//		System.out.println("finish");
//		insertRandTree(Ofer,10,5);
		
		Ofer.insert(0);
		System.out.println(Ofer.toString());
		Ofer.insert(0);
		System.out.println(Ofer.toString());
		Ofer.insert(4);
		System.out.println(Ofer.toString());
		Ofer.insert(4);
		System.out.println(Ofer.toString());
		Ofer.insert(0);
		System.out.println(Ofer.toString());
		Ofer.insert(1);
		System.out.println(Ofer.toString());
		Ofer.insert(4);
		System.out.println(Ofer.toString());
		Ofer.insert(1);
		System.out.println(Ofer.toString());
		Ofer.insert(1);
		System.out.println(Ofer.toString());
		Ofer.insert(1);
		System.out.println(Ofer.toString());
		Ofer.delete(0);
		System.out.println(Ofer.toString());
//		Ofer.delete(6);
//		System.out.println(Ofer.toString());
//		Ofer.delete(7);
//		System.out.println(Ofer.toString());
//		Ofer.insert(9);
//		System.out.println(Ofer.toString());
//		System.out.println("Done \n");
//		Ofer.delete(4);
//		System.out.println(Ofer.toString());
//		Ofer.delete(8);
//		System.out.println(Ofer.toString());
//		
	}
	private static void buildRandTree(BTree<Integer> Tree,int size,int upperBound) {	
		for (int i = 0; i < size ; i ++) {
			int toAdd = (int)(Math.random()*upperBound);
			Tree.add(toAdd);
			System.out.println(Tree.toString());
		}
	}
	private static void buildTree(BTree<Integer> Tree,int size,int upperBound) {	
		for (int i = 0; i < size ; i ++) {
			Tree.add(i);
			System.out.println(Tree.toString());
		}
	}
	private static void insertToTree(BTree<Integer> Tree,int size,int upperBound) {	
		for (int i = 0; i < size ; i ++) {
			Tree.insert(i);
			System.out.println(Tree.toString());
		}
	}
	private static void  insertRandTree(BTree<Integer> Tree,int size,int upperBound) {	
		for (int i = 0; i < size ; i ++) {
			int toAdd = (int)(Math.random()*upperBound);
			Tree.insert(toAdd);
			System.out.println(Tree.toString());
		}
	}
}