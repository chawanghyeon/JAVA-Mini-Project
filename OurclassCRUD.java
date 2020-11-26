package step03.my.application;

public class OurclassCRUD {
	Ourclass ourclass;
	
	void save(String n, String s, int a, String c) {
		ourclass = new Ourclass(n, s, a, c);
	}
	void search() {
		System.out.println(ourclass.toString());
	}
	void update(String newName) {
		ourclass.setName(newName);
	}
	void delete() {
		ourclass = null;
	}
	
	public static void main(String[] args) {
		OurclassCRUD crud = new OurclassCRUD();
		crud.save("차왕현","남",-1,"수원");
		crud.search();
		crud.update("Chawanghyeon");
		crud.search();
		crud.delete();
	}
}
