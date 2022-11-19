package org.core;
//constr
public class Emp {
	int id;
	String name;
	float f;
	public Emp(int id, String name,float f) {
		this.id=id;
		this.name=name;
		this.f=f;
	}
	public void show()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(f);
	}
}
