class Tall implements Comparable<Tall>{
	private int tall;

	public Tall(int tall) {
		this.tall = tall;
	}

	public int compareTo(Tall t) {
		return tall - t.tall;
	}
}