
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Employe e;
	
	
	e= new Employe("aaa", "a", 15);
	
	e.ajouterEmploye();
	
	
	
	e= new Employe("bbb", "b", 22);
	e.ajouterEmploye();
	
	
	e= new Employe("ccc", "c", 31);
	e.ajouterEmploye();
	e= new Employe("ddd", "d", 10);
	e.ajouterEmploye();
	
	
    System.out.println(Employe.chercherEmploye(101).toString());
    System.out.println(Employe.chercherEmploye(102).toString());
    System.out.println(Employe.chercherEmploye(100).toString());
	
	 int n=2;
	 System.out.println("Les " +n + " derniers employés sont:");
	 for(int i=0; i<n; i++){
		System.out.println(Employe.chercherDerniersEmployes(2)[i].toString());
	 }
	}

}
