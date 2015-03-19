package ese103;
import circle.*;
public class ese103 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		circle circleArray[] = new circle[3];
		circleArray[0] = new circle(0, 0, 1);
		circleArray[1] = new circle(0.5, 0.5, 0.5);
		circleArray[2] = new circle(1, 1, 1);
		circle a, b;
		for(int i=0; i<circleArray.length; i++) {
		a = circleArray[i];
		b = circleArray[(i+1) % circleArray.length];
		if(a.contain(b))
		System.out.println(a + " contiene " + b);
		else
		System.out.println(a + " NON contiene " + b);
		}
		
	}

}
