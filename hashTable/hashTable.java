public class hashTable{
	private class Node{
		String key;
		Object value;
		Node next;

		public Node(String key, Object value){
			this.key = key;
			this.value = value;
		}
	}

	private Nodes mapEntry;

	public hashTable(int capacity){
		mapEntry = new Nodes[capacity];
	}

	public void put(Object key, Object value){
		int bucket = getHashCode(key.toString(), capacity);
		Node entry = new Node(key.toString(), value);
		if (mapEntry[bucket] == null){
			mapEntry[bucket] = entry;
		}
		else{
			Node temp = mapEntry[bucket].next;
			while (temp != null){
				temp = temp.next;
			}
			temp = entry;
		}
	}

	public Object get(Object obj){
		Object value = null;
		String key = obj.toString();
		Node list = mapEntry[getHashCode(key)];
		while (list.key != key && list.next != null){
			list = list.next; 
		}
		if (list.key != key){
			return value;
		}

		else return list.value;
	}


	private getHashCode(String key, int capacity){
		return key.hashCode() % capacity;
	}
}