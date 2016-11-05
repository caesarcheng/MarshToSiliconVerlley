package ChaperSix.Array;

public class RotateK {
	public static int[] Rotatk(int[] a,int k ){
		Rotate (a,0, a.length-1);
		Rotate (a, 0, k-1);
		Rotate (a, k , a.length-1);
		return a;
	}

	private static void Rotate(int[] a, int i, int length) {
		while(i<length){
			int t = a[i];
			a[i++]= a[length];
			a[length--]=t;
		}
	}
	public static void main(String[] args) {
		int[] a= { 2, 10, 3, 2, 5 };
		Rotatk(a, 3);
		for(int i : a){
			System.out.print (i +" ");
		}
	}
	
}
