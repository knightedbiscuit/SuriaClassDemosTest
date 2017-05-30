package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import model.student;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Create New Student");
		
		student s1 = new student("Jonathan",1,"John", 20.00);
		student s2 = new student("Pete",2,"Pet", 30.00);
		student s3 = new student("Bingzhao",3,"bing", 40.00);
		student s4 = new student("Ray",4,"Ray", 50.00);
		
		ArrayList<student> al  = new ArrayList<student>();
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		for(Iterator<student> iterator  = al.iterator(); iterator.hasNext(); )
		{
			student s = iterator.next();
			System.out.println(s.toString());
		}
		
		Collections.sort(al);
		
	}

}
