protected static Node{
		Object val;
		Node left;
		Node right;

		Node (Object val){
			this.val = val;
		}

		Node (Object val, Node left, Node right){
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}