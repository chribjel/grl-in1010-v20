import java.util.Iterator;

class Lenkeliste<T> implements Iterable<T>{
	private class Node {
		T data;
		Node neste;

		Node(T data) {
			this.data = data;
		}
	}

	private Node start;

	public void settInnPaaStarten(T data) {
		if (start == null) {
			start = new Node(data);
		} else {
			Node node = new Node(data);
			node.neste = start;
			start = node;
		}
	}

	public T fjernPaaStarten() {
		if (start == null) {
			return null;
		} else {
			Node returNode = start;
			start = start.neste;
			return returNode.data;
		}
	}

	public Iterator<T> iterator() {
		return new ListeIterator();
	}

	private class ListeIterator implements Iterator<T> {

		//sier hvor vi skal starte iterasjonen
		Node current = start;

		// sjekker om vi har noe å hente
		public boolean hasNext() {
			if (current == null) {
				return false;
			}
			return true;
		}

		// henter og går til neste
		public T next() {
			if (hasNext()) {
				T data = current.data;
				current = current.neste;
				return data;
			}
			return null;
		}

		public void remove() {
			throw new UnsupportedOperationException("Remove is not eimplemented");
		}
	}
}

// while (hasNext()) {
// 	next();
// }