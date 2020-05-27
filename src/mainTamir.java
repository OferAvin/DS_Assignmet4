
public class mainTamir {

	public static void main(String[] args) {
		BTree<Integer>tamir = new BTree<Integer>(2);
		tamir.insert(2);
		tamir.insert(4);
		tamir.insert(6);
		tamir.insert(1);
		tamir.insert(3);
		tamir.insert(5);
		tamir.insert(7);
		tamir.insert(8);
		System.out.println(tamir.toString());
		tamir.remove(5);
		System.out.println(tamir.toString());
		tamir.remove(8);
		System.out.println(tamir.toString());
		tamir.remove(2);
		System.out.println(tamir.toString());
		tamir.remove(4);
		System.out.println(tamir.toString());
		
	}

}
