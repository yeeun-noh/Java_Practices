package ex;
//방정식 2x+4y=10의 모든 해 구하기:

public class Exercise4_08 {

	public static void main(String[] args) {

		for(int x=0; x<=10; x++) {
			for(int y=0; y<=10; y++) {
				if(((2*x)+(4*y)) == 10)
					System.out.println("x=" + x + ", y=" + y);
			}
		}
	}

}
