package com.edu.zju.cjx.MarshIntoSiliconVellery;

import java.util.*;
import java.util.Map.Entry;

public class FullPermutation {
	int[] a = null ;
	boolean [] b  = null;
	int[] c = null;
	static int count = 0;
	Map<String,Integer> map =  new HashMap<>();
	void fullPermute(int[] a,boolean[] b,int [] c ,int k ){
		int len = a.length;
		if(k==len){
			
			String str = "";
			for (int i : c) {
				str+=i;
			}
			map.put(str, 1);
		}
		for(int j =0;j<len;j++){
			if(!b[j]){
				b[j] = true;
				c[k] = a[j];
				fullPermute(a, b, c, k+1);
				b[j] = false;
				c[k]=0;
			}
		}
	}
	public FullPermutation(int[] al) {
	    this.a=al;
		b = new boolean[a.length];
		c = new int[a.length];
		fullPermute(a, b, c, 0);
		visitedMap();
	}
	void visitedMap(){
		Iterator<Entry<String,Integer>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()){
			Entry<String ,Integer> e = iterator.next();
			System.out.println("count: " + ++count +" "+e.getKey());
		}
	}
	public static void main(String[] args) {
		int[] a ={1,2,3,4,1};
		FullPermutation f = new FullPermutation(a);
		
	}

}
