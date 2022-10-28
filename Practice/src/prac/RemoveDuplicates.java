package prac;

import java.util.ArrayList;

public class RemoveDuplicates {
	public static void main(String[] args) {
		ArrayList<Integer>li=new ArrayList<Integer>();
		for(int i=0;i<9;i++) {
			li.add(i);
		}
		System.out.println(li);
//insert another set from 0 t0 5
	for(int i=0;i<5;i++) {
		li.add(i);
	}
	System.out.println(li);

	for(int i=0;i<li.size();i++) {
		
		for(int j=i+1;j<li.size();j++) {
			if(li.get(i)==li.get(j)) {
				System.out.println(li.get(i));
			}
				
			}
		}}}
