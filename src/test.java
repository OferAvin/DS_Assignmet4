
public class test {

	public static void main(String[] args) {
//		BTree<Integer> Ofer = new BTree<Integer>(2);
//		insertRandTree(Ofer,20,100);
//		buildTree(Ofer,20,100);
//		insertToTree(Ofer,10,5);
//		System.out.println("finish");
//		insertRandTree(Ofer,10,5);
		StringHashMethods strHashOfer = new StringHashMethods();
		CuckooHashing hashOfer = new CuckooHashing(strHashOfer,6);
		hashOfer.insert("ag");
		System.out.println(hashOfer.toString());
		hashOfer.insert("ba");
		System.out.println(hashOfer.toString());
		hashOfer.insert("cd");
		System.out.println(hashOfer.toString());
		hashOfer.insert("ad");
		System.out.println(hashOfer.toString());
		hashOfer.insert("ef");
		System.out.println(hashOfer.toString());
		hashOfer.insert("fh");
		System.out.println(hashOfer.toString());
		hashOfer.insert("cg");
		System.out.println(hashOfer.toString()+ " insert till here");
		hashOfer.undo();
		System.out.println(hashOfer.toString()+ " 1st undo");
		hashOfer.undo();
		System.out.println(hashOfer.toString()+ " 2nd undo");
		hashOfer.remove("ad");
		System.out.println(hashOfer.toString()+ " 1st remove");
		hashOfer.undo();
		System.out.println(hashOfer.toString());

		

		Ofer.insert(0);
		System.out.println(Ofer.toString());
		Ofer.insert(4);
		System.out.println(Ofer.toString());
		Ofer.insert(8);
		System.out.println(Ofer.toString());
		Ofer.insert(3);
		System.out.println(Ofer.toString());
		Ofer.insert(2);
		System.out.println(Ofer.toString());
		Ofer.insert(1);
		System.out.println(Ofer.toString());
		Ofer.insert(5);
		System.out.println(Ofer.toString());
		Ofer.insert(9);
		System.out.println(Ofer.toString());
		Ofer.insert(7);
		System.out.println(Ofer.toString());
		Ofer.insert(6);
		System.out.println(Ofer.toString());
		Ofer.insert(6);
		System.out.println(Ofer.toString());
		Ofer.insert(0);
		System.out.println(Ofer.toString());
		Ofer.insert(4);
		System.out.println(Ofer.toString());
		Ofer.insert(8);
		System.out.println(Ofer.toString());
		Ofer.insert(3);
		System.out.println(Ofer.toString());
		Ofer.insert(2);
		System.out.println(Ofer.toString());
		Ofer.insert(1);
		System.out.println(Ofer.toString());
		Ofer.insert(5);
		System.out.println(Ofer.toString());
		Ofer.insert(9);
		System.out.println(Ofer.toString());
		Ofer.insert(7);
		System.out.println(Ofer.toString());
		Ofer.insert(6);
		System.out.println(Ofer.toString());
		Ofer.insert(6);
		System.out.println(Ofer.toString());
		Ofer.insert(0);
		System.out.println(Ofer.toString());
		Ofer.insert(4);
		System.out.println(Ofer.toString());
		Ofer.insert(8);
		System.out.println(Ofer.toString());
		Ofer.insert(3);
		System.out.println(Ofer.toString());
		Ofer.insert(2);
		System.out.println(Ofer.toString());
		Ofer.insert(1);
		System.out.println(Ofer.toString());
		Ofer.insert(5);
		System.out.println(Ofer.toString());
		Ofer.insert(9);
		System.out.println(Ofer.toString());
		Ofer.insert(7);
		System.out.println(Ofer.toString());
		Ofer.insert(6);
		System.out.println(Ofer.toString());
		Ofer.insert(6);
		System.out.println(Ofer.toString());
		
//		Ofer.insert2pass(0);
//		System.out.println(Ofer.toString());
//		Ofer.insert2pass(4);
//		System.out.println(Ofer.toString());
//		Ofer.insert2pass(8);
//		System.out.println(Ofer.toString());
//		Ofer.insert2pass(3);
//		System.out.println(Ofer.toString());
//		Ofer.insert2pass(2);
//		System.out.println(Ofer.toString());
//		Ofer.insert2pass(1);
//		System.out.println(Ofer.toString());
//		Ofer.insert2pass(5);
//		System.out.println(Ofer.toString());
//		Ofer.insert2pass(9);
//		System.out.println(Ofer.toString());
//		Ofer.insert2pass(7);
//		System.out.println(Ofer.toString());
//		Ofer.insert2pass(6);
//		System.out.println(Ofer.toString());
//		Ofer.insert2pass(6);
//		System.out.println(Ofer.toString());
//		Ofer.insert2pass(0);
//		System.out.println(Ofer.toString());
//		Ofer.insert2pass(4);
//		System.out.println(Ofer.toString());
//		Ofer.insert2pass(8);
//		System.out.println(Ofer.toString());
//		Ofer.insert2pass(3);
//		System.out.println(Ofer.toString());
//		Ofer.insert2pass(2);
//		System.out.println(Ofer.toString());
//		Ofer.insert2pass(1);
//		System.out.println(Ofer.toString());
//		Ofer.insert2pass(5);
//		System.out.println(Ofer.toString());
//		Ofer.insert2pass(9);
//		System.out.println(Ofer.toString());
//		Ofer.insert2pass(7);
//		System.out.println(Ofer.toString());
//		Ofer.insert2pass(6);
//		System.out.println(Ofer.toString());
//		Ofer.insert2pass(6);
//		System.out.println(Ofer.toString());
//		Ofer.insert2pass(0);
//		System.out.println(Ofer.toString());
//		Ofer.insert2pass(4);
//		System.out.println(Ofer.toString());
//		Ofer.insert2pass(8);
//		System.out.println(Ofer.toString());
//		Ofer.insert2pass(3);
//		System.out.println(Ofer.toString());
//		Ofer.insert2pass(2);
//		System.out.println(Ofer.toString());
//		Ofer.insert2pass(1);
//		System.out.println(Ofer.toString());
//		Ofer.insert2pass(5);
//		System.out.println(Ofer.toString());
//		Ofer.insert2pass(9);
//		System.out.println(Ofer.toString());
//		Ofer.insert2pass(7);
//		System.out.println(Ofer.toString());
//		Ofer.insert2pass(6);
//		System.out.println(Ofer.toString());
//		Ofer.insert2pass(6);
//		System.out.println(Ofer.toString());
		
		
		
		
		
		
		
//		Ofer.insert(1);
//		System.out.println(Ofer.toString());
//		Ofer.insert(4);
//		System.out.println(Ofer.toString());
//		Ofer.insert(1);
//		System.out.println(Ofer.toString());
//		Ofer.insert(1);
//		System.out.println(Ofer.toString());
//		Ofer.insert(1);
//		System.out.println(Ofer.toString());
//		Ofer.delete(0);
//		System.out.println(Ofer.toString());
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

		hashOfer.remove("ba");
		System.out.println(hashOfer.toString()+ " 2nd remove");
		hashOfer.insert("fh");
		System.out.println(hashOfer.toString()+ " insert fh");
		hashOfer.insert("fh");
		System.out.println(hashOfer.toString());
		hashOfer.undo();
		System.out.println(hashOfer.toString());
//		hashOfer.undo();
//		System.out.println(hashOfer.toString());
//		hashOfer.undo();
//		System.out.println(hashOfer.toString());
//		hashOfer.undo();
//		System.out.println(hashOfer.toString());

//		hashOfer.remove("ba");
//		System.out.println(hashOfer.toString()+ " remove");
//		hashOfer.undo();
//		System.out.println(hashOfer.toString()+ " done");
//		hashOfer.remove("ba");
//		System.out.println(hashOfer.toString());


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