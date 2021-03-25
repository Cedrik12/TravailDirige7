
public class Point {

private int abscisse;
private static int origine=0;

public Point(int abscisse){
	this.abscisse= abscisse;	
}

public static void setOrigine(int o){
	origine= o; 
}

public static int getOrigine(){
	return origine; 
}


void afficher(){
	int absrelative= abscisse-origine;
	System.out.println("Abscisse = " + absrelative + " relative à une origine d'abscisse " + origine);
	
}

}






