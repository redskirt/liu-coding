package com.matthew.cases;

/**
 * 编程案例源码 
 * Java 面向对象篇
 * @老刘编程 点赞关注私信获取源码
 *
 */
public class JavaOOPCases { }

/**
 * 面向对象 封装性
 * 
 * @老刘编程 点赞关注私信获取源码
 *
 */
class EncapsulationCase {
	
	private String name;
	private Integer age;
	
	public static void main(String[] args) {
		
		EncapsulationCase caz = new EncapsulationCase();
		caz.setName("Matthew");
		caz.setAge(18);
		
		System.out.println("// print an object of EncapsulationCase");
		System.out.println("caz \n" + "name: " + caz.getName() + " age: " + caz.getAge());
	}
	
	/*
	 * Assignment
	 * 编写任意一个封装类，测试 getter/setter
	 * 查看方法之间的调用顺序
	 */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("// set name: " + name);
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		System.out.println("// set age: " + age);
		this.age = age;
	}
}

/**
 * 面向对象 继承性
 * 
 * - 支持单继承 A extends B
 * - 支持多重继承 A extends B extends C
 * - 支持多对一继承 A extends B, C extends B
 * - 不支持一对多继承 !( A extends B, A extends C )
 * 
 * @老刘编程 点赞关注私信获取源码
 *
 */
class Animal {

	private Integer id;
	private String name;

	protected Animal() {
		System.out.println("// 调用 Animal 无参构造方法1 ");
	}
	
	protected Animal(String name, int id) {
		this.name = name;
		this.id = id;
		System.out.println("// 调用 Animal 有参构造方法2 ");
	}

	public void eat() {
		System.out.println(name + "正在吃");
	}

	public void sleep() {
		System.out.println(name + "正在睡");
	}

	public void show() {
		System.out.println("大家好！我是" + id + "号" + name + ".");
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

/*
 * 设计继承关系
 * Mouse extends Animal
 * Penguin extends Animal
 */

class Penguin extends Animal {
	
	private String locate;

	/*
	 * 使用父类构造方法
	 */
	
	public Penguin() {
		// 默认调用父类无参构造方法
		System.out.println("// 调用 Penguin 无参构造方法1 ");
	}
	
	public Penguin(String name, int id) {
		// 使用 super 调用父类构造方法
		super(name, id);
	}

	public Penguin(String name, int id, String locate) {
		super(name, id);
		this.locate = locate;
	}
	
	public static void main(String[] args) {
		
		Penguin p1 = new Penguin("p1", 1);
		System.out.println("p1.name = " + p1.getName());
		
		Penguin p2 = new Penguin();
		p2.setName("p2");
		p2.setId(2);
		System.out.println("p2.name = " + p2.getName());
	}

	public String getLocate() {
		return locate;
	}

	public void setLocate(String locate) {
		this.locate = locate;
	}
}

class Mouse extends Animal {

	public Mouse(String name, int id) {
		super(name, id);
	}
	
	/*
	 * Assignment
	 * - 在 Mouse 类中实现方法继承
	 */
}

/**
 * 面向对象 继承性
 * 
 * final 
 * - 修饰类，无法再补继承
 * - 修饰方法，无法被子类重写
 * 
 * @老刘编程 点赞关注私信获取源码
 *
 */

final class FinalClassCase1 {
	
}

// class SubFinalClassCase extends FinalClassCase1 {}

class FinalClassCase2 {
	
	public final void finalShow(String stirng) {
		System.out.println("这是一个 final 方法。");
	}
}

class SubFinalClassCase extends FinalClassCase2 {
	
//	public void finalShow(String stirng) {}
	
}

