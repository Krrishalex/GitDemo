package constructors;

public class WallArea {
	public static void main(String[] args) {
		
		
		Wall w=new Wall();
		Wall wd=new Wall(20.00, 30.25);
		
		System.out.println(w.getWallArea());
		System.out.println(w.getHeight());
		System.out.println(wd.getHeight());
		System.out.println(wd.getWallArea());
	}

}
