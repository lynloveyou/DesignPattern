package com.lyn.demo.prototype;

public class StudentPrototype implements Cloneable{

	private String name;
	private int age;
	private DeepClone deepclone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public DeepClone getDeepclone() {
		return deepclone;
	}

	public void setDeepclone(DeepClone deepclone) {
		this.deepclone = deepclone;
	}

	@Override
	protected StudentPrototype clone() throws CloneNotSupportedException {
		StudentPrototype clone = (StudentPrototype)super.clone();
		clone.setDeepclone(clone.getDeepclone().clone());
		return clone;
	}

	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		System.out.println(a);
		if(a instanceof int[])
		{
			System.out.println("is object");
		}
		int[] c = (int[])a.clone();
		Object[] objarray = {1,2,3};
		int i = 0;
		Object ext = c;
		System.out.println(c);
		System.out.println(a.getClass());
		System.out.println(a.getClass().getSuperclass().getName());
		String [] b = {"1","2"};
		if(b instanceof Object[])
		{
			System.out.println("b extends object[]");
		}else
		{
			System.out.println("b  not extends object[]");
		}
		System.out.println(b.getClass());
		Class<?>[] classes = b.getClass().getClasses();
		System.out.println(classes);
		for(Class clazz:classes)
		{
			System.out.println("clazz--"+clazz);
		}
		Object [] obj = {"123"};
		System.out.println(obj.getClass());
		System.out.println(obj.getClass().getSuperclass().getName());
        //6   下面成立吗?  Father是Son的直接父类  
        Son[] sons = new Son[3];  
        Father[] fa = sons;  //成立  
          
        //7     那么Son[] 的直接父类是Father[] 还是  Object[] 或者是Object?  
        System.out.println("---"+sons.getClass().getSuperclass().getName());  
		
		
		StudentPrototype sp = new StudentPrototype();
		sp.setName("11");
		sp.setAge(18);
		sp.setDeepclone(new DeepClone());
		display("resouce", sp);
		try {
			StudentPrototype clone = sp.clone();
			display("clone", clone);
			System.out.println("===============clone change==================");
			clone.setName("456");
			display("resouce", sp);
			display("clone", clone);
			System.out.println("=================================");
			clone.setName("费事一下111");
			display("resouce", sp);
			display("clone", clone);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
	
	public static void display(String prex,StudentPrototype student)
	{
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(prex).append("-").append(prex).append("-name--").append(student.getName())
		.append("-name hashcode-").append(student.getName().hashCode()).append("--age--").append(student.getAge())
		.append("--deepclone-hashcode-").append(student.getDeepclone().hashCode());
		System.out.println(strBuilder.toString());
	}

	
	public static class Father {  
		  
	}  
	  
	public static class Son extends Father {  
	  
	}  
}
