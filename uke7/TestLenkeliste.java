class TestLenkeliste {
	public static void main(String[] args) {
		Lenkeliste<String> liste = new Lenkeliste<>();

		liste.settInnPaaStarten("hei");
		liste.settInnPaaStarten("hello");
		liste.settInnPaaStarten("hey");

		for (String data : liste) {
			System.out.println(data);
		}



	}
}