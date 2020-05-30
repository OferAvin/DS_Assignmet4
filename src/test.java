
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
		hashOfer.insert("ab");
		hashOfer.insert("ba");
		hashOfer.insert("cd");
		hashOfer.insert("ad");
		hashOfer.insert("ef");
		hashOfer.insert("fh");
		hashOfer.insert("cg");
		System.out.println(hashOfer.toString());
		
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