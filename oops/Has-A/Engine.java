package HasARelation;

public class Engine {
	double hp;
	double cc;
	
	Engine(double hp,double cc){
		this.hp=hp;
		this.cc=cc;
	}
	public void engineDetails(){
		System.out.println("HP: "+hp);
		System.out.println("CC: "+cc);
	}
}
