public class Employe {
  
 private static final int initial = 100;
 
 private String nom, prenom;
 private int num;
 private int NAS;
 
 private static int numMax= initial;
 private static  int max=500;
 private static Employe[] LE= new Employe[max];  
  
 Employe(String n, String p, int NAS){
	this.nom= n;
	this.prenom = p;
	this.NAS= NAS;
	this.num = numMax;
	numMax++;
	
 }

 int getNum(){return num;}
 
 String getNom(){return nom;}
 
 String getPrenom(){return prenom;}
 
 static int getNumMax(){return numMax-1;}

 
 
  void ajouterEmploye() {
	 if (numMax-initial <= max) {
		 LE[this.num-initial]= this;
	 }
 }
 
 
  static Employe chercherEmploye(int num) {
	  if (num-initial < max) {
		  return LE[num-initial];
	  }
	  else{
		  return null;
	  }
  }
 
   
  static Employe [] chercherDerniersEmployes(int n) {
	  Employe[] temp = new Employe[n];
	  if (n <= numMax - initial -1)
	  { int j =0;
		  for (int i=(numMax-initial)-1; i> (numMax-initial)- 1 -n; i--){
		  temp[j]= LE[i];
		  j++;
	     }  	  
	  }
	  return temp;
  }
 
  public String toString(){
	  
	  return ("Le nom est : " + nom + ", le prenom est :" + prenom + ", le numero est :" + num+ ", le NAS est :" + NAS);
  }
}
