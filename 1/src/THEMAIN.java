
public class THEMAIN {

	public static void main(String[] args) {

		Calcule u[] = new Calcule[2];
		u[0] = new Sfera(2, 2, 2, 4, 4, 4);
		u[1] = new Cub(0, 0, 0, 3, 0, 0, 0, 3, 0, 0, 0, 3, 3, 0, 3, 0, 3, 3, 3, 3, 0, 3, 3, 3);

		for(int i=0;i<u.length;i++)
		{
			u[i].distance();
			u[i].aria();
			u[i].volum();
			u[i].centruldegreutate();
			
		}
		
	

	}


}
