public class Tree{
	private doublyList list;
	private root;
	private int size;

	public Tree(){
		this.list = new doublyList();
		this.size = 0;
	}

	public Tree(Object root){
		createRoot();
	}

	public void createRoot(Object val){
		this.root = new Node(root);
		list.addBack(root);
	}

	public void add(Object val){
		if (list.peekFront() == null){
			createRoot;
		}
		else {
			Node temp = new Node(val);
			list.add(temp);
			Node curr = list.peekFront();
			if (curr.left != null){
				curr.left = temp;
			}
			else{
				list.pollFront();
				curr.right = temp;
			}
		} 
	}

	public Object get(Object val){
		return checkIfPresent();
	}

	public Object checkIfPresent(Node root, Object target){
		if (val == null){
			return null;
		}
		if (root.val == target){
			return root;
		}
		Object left = checkIfPresent(root.left, target);
		if (left == null){
			return checkIfPresent(root.right, target);
		}
		return left;
	}


}