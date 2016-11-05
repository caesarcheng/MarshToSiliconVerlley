package ChaperSix.Array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MaxSubscriptLength {
	public static int maxSubscriptLength(int[] a ){
		int minint=a[0];int i =0,j =0;
		if(a==null&&a.length<2) return -1;
		boolean[] inDescSeq = new boolean[a.length];
		inDescSeq[0]=true;
		for(j=1;j<a.length;j++){
			if(a[j]<minint){
				inDescSeq[j]=true;
				minint = a[j];
			}else{
				inDescSeq[j]=false;
			}
		}
		i = j= a.length-1;minint =0;
		while(i>=0){
			while(!inDescSeq[i]){
				i--;
			}
			while(j>i&&a[j]<= a[i]){
				j--;
			}
			if((j-i)>minint){
				minint = j-i;
			}
			i--;
		}
		return minint;
	}
public static void main(String[] args) {
	List list = new ArrayList<>(0);
	int [] a={5,3,4,0,1,4,1};
	System.out.println(maxSubscriptLength(a));
}
}
