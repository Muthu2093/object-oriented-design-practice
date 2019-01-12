protected class doublyList{
	private static dNode{
		Node val;
		Node prev;
		Node next;

		dNode(Node val){
			this.val = val;
		}

		dNode(Node val, Node prev, Node next){
			this.val= val;
			this.prev = prev;
			this.next = next;
		}
	}

	private dNode head;
	private dNode tail;
	private int size;

	doublyList(){
		this.head = new dNode(new Node(new Object()));
		this.tail = new dNode(new Node(new Object()));
		head.next = tail;
		tail.prev = head;
	}

	public void addFront(Node front){
		dNode temp = new dNode(front, head, hext.next);
		head.next.prev = temp;
		head.next = dNode;
		size++;
	}

	public void addBack(Node back){
		dNode temp = new dNode (back, tail.prev, tail);
		tail.prev.next = temp;
		tail.prev = temp;
		size++;
	}

	public Node pollFront(){
		if (size == 0){
			return null;
		}
		Node temp = head.next;
		head.next = head.next.next;
		head.next.prev = head;
		size--;
		return temp;
	}

	public Node pollBack(){
		if (size == 0){
			return null;
		}
		Node temp = tail.prev;
		tail.prev = tail.prev.prev;
		tail.prev.next = tail;
		size--;
		return temp;
	}

	public Node peekFront(){
		return size == 0 ? null : head.next;
	}

	public Node peekBack(){
		return size == 0 ? null : tail.prev;
	}

	public int getSize(){
		return size;
	}

}