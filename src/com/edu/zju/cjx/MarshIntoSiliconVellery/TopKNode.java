package com.edu.zju.cjx.MarshIntoSiliconVellery;

public class TopKNode {

	static void buildHeap(int[] a, int k) {
		int len = a.length;
		for (int i = k/2; i >0; i--) {
			adjustHeap(a, i - 1, k);
		}
	}

	static void adjustHeap(int[] a, int loc, int k) {
		if(0==loc ) {
			System.out.println();
			return ;
		}
		int pliot = a[loc];
		for (int i = 2 * loc; i < k; i *= 2) {

			if (a[i] < a[i + 1]) {
				i++;
			}
			if(pliot<a[i]) {
				 a[loc]=a[i];
				loc = i;
			}
		}
		a[loc] = pliot;
	}
	static void topK(int[] a,int k ){
		for(int i= k - 1; i<a.length ;i++){
			if(a[i] >a[0]){
				int pliot = a[0];
				a[0]= a[i];
				a[i]= pliot;
				adjustHeap(a, 1, k);
			}
		}
		
	}
	
	public static void main(String[] args) {
		int[] a={38,58,68,25,62,63,52,54,75,90};
		int k = a.length-5;
		buildHeap(a, k);
		topK(a, k);
		for (int i : a) {
		System.out.print(i+" ");
		}
	}
}
