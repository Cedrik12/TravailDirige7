
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Point a= new Point (3);
		Point b= new Point (12);
		
		a.afficher();
		b.afficher();
		
		Point.setOrigine(3);
		
		a.afficher();
		b.afficher();
	}

}
