package com.matthew.cases;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class CodingCase { }

class JavaCases { // 类体

	// 单行注释
	/*
	 * 多行注释
	 */
	
	/*
	 * - main方法是所有Java程序的入口，相当于汽车的启动按钮
	 * - 一个类里有且仅有一个main方法
	 */
	// 修饰符 关键字 返回类型 方法名 参数类型 参数
	public static void main(String[] args) { // 方法体

		// 使用程序打印输出方法
		System.out.println("Hello world! ");
	}
}

/**
 * 声明类时需要注意
 * - 一个源文件中只能有一个 public 类
 * - 一个源文件可以有多个非 public 类
 * - 源文件的名称应该和 public 类的类名保持一致
 * class Puppy 与 Puppy.java
 * 
 * @author Matthew
 */
class Puppy {

	private int age;

	private String name;

	/*
	 * 不用定义，Java自带，写出来仅作为演示
	 * 构造方法，无参数
	 */
	public Puppy() {

	}

	/**
	 * 按需定义自己想要的构造方法
	 * 构造方法，带一个参数
	 * 
	 * @param name
	 */
	public Puppy(String name) {
		this.name = name;
	}

	public static void main(String[] args) {

		/*
		 * 创建两个对象 设置属性使用setter
		 * 注意两个puppy对象的构造过程对比
		 */
		Puppy puppy1 = new Puppy();
//		puppy1.setName("Bob");
		puppy1.setAge(1);
		// 设置属性使用getter
		System.out.println("puppy1: " + puppy1.getName() + " " + puppy1.getAge());

		Puppy puppy2 = new Puppy("Tom");
		puppy2.setAge(8);
		System.out.println("puppy2: " + puppy2.getName() + " " + puppy2.getAge());

	}


	/*
	 * 私有属性的外部访问方法 
	 */
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

/**
 * 变量只会出现在两个地方
 * 类体，方法体
 * 
 * 变量初始化
 * 
 * @author Matthew
 *
 */
class VariableCase {

	/*
	 * - 实例变量在方法体之外的非static变量
	 * 
	 * 声明变量
	 * - 声明时可以不初始化
	 * - 不初始化的变量值为该类型的默认值（不建议）
	 * - 在方法体中初始化
	 */
	int a, b, c; 
	
	/*
	 * 声明变量
	 * 声明时可以同时初始化
	 */
	int d = 3, 
		e = 4, 
		f = 5;

	/*
	 * 静态变量/类变量
	 * 
	 * - 在规范中需要声明变量的同时初始化
	 * - static变量可以改变，但是通常初始化之后不变
	 * - static变量在作用域内仅保持一份，节省空间
	 */
	static int staticVariable = 0;

	/*
	 * 静态常量
	 * - 被定义后任何地方不允许修改
	 * - 比static变量更严格
	 * - 声明通常使用全大写命名
	 * - 常用于表示恒常不变的变量、数字或运算符号
	 */
	final static double CONSTANT_PI = 3.14D;
	
	
	/*
	 * - 外部变量与方法内部同名变量不冲突
	 * - 使用this引用外部变量
	 * - 为便于代码阅读，通常不使用同名变量
	 */
	int i_, j_ = 1;
	
	public void method() {
		
		// 测试常量不可变更
//				CONSTANT_PI = 3.1;
		
		/*
		 * - 局部变量，定义在方法体中
		 */
		int i = 2;
		int j;
		j = 2;
		
		System.out.println("method 方法外的变量，赋值前：this.i_ = " + this.i_ + ", this.j_ = " + this.j_);
		
		int i_ = 6;
		int j_ = 6;
		
		this.i_ = i_;
		this.j_ = j_;
		
		System.out.println("method 方法外的变量，赋值后：this.i_ = " + this.i_ + ", this.j_ = " + this.j_);
		System.out.println("method 方法体内的局部变量：i_ = " + i_ + ", j_ = " + j_);
		System.out.println("method 方法体内的局部变量：i = " + i + ", j = " + j);
		
	}


	public static void main(String[] args) {
		VariableCase caz = new VariableCase();
		
		/*
		 * 调用方法
		 * 使用对象的引用调用方法
		 */
		caz.method();
		System.out.println();
		
		/*
		 * 静态变量
		 * - 静态常量可直接调用，该类域内
		 * - 或者用类名调用，其他类中
		 * - 调用不需要用对象
		 */
		System.out.println("静态变量：staticVariable = " + staticVariable);
		System.out.println("静态变量：VariableCase.staticVariable = " + VariableCase.staticVariable);
		System.out.println();
		
		System.out.println("静态常量：CONSTANT_PI = " + CONSTANT_PI);
		System.out.println("静态常量：VariableCase.CONSTANT_PI = " + VariableCase.CONSTANT_PI);
	}
}

/**
 * 基本类型转换
 * 
 * @author Matthew
 *
 */
class TypeExchangeCase {

	public static void main(String[] args) {

		/*
		 * 自动类型转换 
		 * 低类型向高类型自动转换，不需要声明
		 */
		char c1 = 'A';// 定义一个char类型
		int i1 = c1;// char自动类型转换为int
		System.out.println("自动转换的情况：");
		System.out.println("char c1被自动转换为int：" + i1);

		char c2 = 'A';// 定义一个char类型
		int i2 = c2 + 1;// char 类型和 int 类型计算
		System.out.println("char c2被自动转换为int：" + i2);
		System.out.println();
		
		/*
		 * 不能转换的情况 
		 * boolean 类型不能转换 
		 * 在面向对象中，不相关类型不能转换
		 */
		boolean /* int */ b1 = true;
		System.out.println("boolean值b1 = " + b1);
		System.out.println();

		/*
		 * 高类型向低类型转换的情况 
		 * 注意可能溢出（超出范围）或损失精度
		 */
		int i3; // 未赋值int默认值是0
		long l3 = 100L; // 整数的默认类型是int，使用L对long定义进行显式声明，float F，double D
		i3 = 1; // 赋值i3
		System.out.println("强制转换的情况：");
		System.out.println("变量i3 = " + i3);
		System.out.println("变量l3 = " + l3);

		long l4 = i3 + l3; // 结果默认为高类型，不需转换
		int i4 = (int) (i3 + l3); // 结果需要为低类型，强制转换
		System.out.println("变量l4 = " + l4);
		System.out.println("变量i4 = " + i4);
		System.out.println();
		
		/*
		 * 高类型向低类型转换结果溢出的情况
		 */
		long l5 = 100000000000000L;
		int i5 = (int) (i3 * l5); 
		byte b2 = (byte) 302;
		System.out.println("高类型向低类型转换结果溢出的情况：");
		System.out.println("变量i5 = " + i5 + "，结果溢出，数值无意义。");
		System.out.println("变量b1 = " + b2 + "，结果溢出，数值无意义。");
		System.out.println();
		
		double d1 = 12.12345D;
		int i6 = (int) d1;
		System.out.println("高类型向低类型转换损失精度的情况");
		System.out.println("变量i6 = " + i6 + "，结果损失了精度。");
		
	}
}

/**
 * 演示8种基本数据类型 
 * 数值类型：byte short int long float double 
 * 布尔类型：boolean 
 * 字符类型：char
 * 
 * @author Matthew
 *
 */
class PrimitiveTypeCase {
	public static void main(String[] args) {
		
		/*
		 * 分别定义8不同的数据类型
		 */
		byte 	b1 = 1;
		short 	s1 = 1;
		int 	i1 = 1;
		long 	l1 = 1L;
		float	f1 = 1.0F;
		double	d1 = 1.0D;
		char	c1 = 'A';
		boolean bl = true; // false
		
		System.out.println(b1);
		System.out.println(s1);
		System.out.println(i1);
		System.out.println(l1);
		System.out.println(f1);
		System.out.println(d1);
		System.out.println(c1);
		System.out.println(bl);
		System.out.println();
		
		/*
		 * 定义整数值 8位 byte 长度只有 1/4 int
		 */
		System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);
		System.out.println("包装类：java.lang.Byte");
		System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);
		System.out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);
		System.out.println();

		/*
		 * 定义整数值 16位 short 长度只有 1/4 int
		 */
		System.out.println("基本类型：short 二进制位数：" + Short.SIZE);
		System.out.println("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);
		System.out.println("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE);
		System.out.println();

		/*
		 * 定义整数值 32位 int
		 */
		System.out.println("基本类型：int 二进制位数：" + Integer.SIZE);
		System.out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);
		System.out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);
		System.out.println();

		/*
		 * 定义整数值 64位 long
		 */
		System.out.println("基本类型：long 二进制位数：" + Long.SIZE);
		System.out.println("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);
		System.out.println("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);
		System.out.println();

		/*
		 * 定义单精度浮点型 32位 float
		 */
		System.out.println("基本类型：float 二进制位数：" + Float.SIZE);
		System.out.println("包装类：java.lang.Float");
		System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);
		System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);
		System.out.println();

		/*
		 * 定义双精度浮点型 64位 double
		 */
		System.out.println("基本类型：double 二进制位数：" + Double.SIZE);
		System.out.println("包装类：java.lang.Double");
		System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);
		System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);
		System.out.println();

		/*
		 * 定义布尔类型 true false boolean
		 */
		System.out.println("包装类：java.lang.Boolean");
		System.out.println("布尔类型：boolean " + (1 > 2));
		System.out.println("布尔类型：boolean " + (1 < 2));
		System.out.println();

		/*
		 * 定义char字符类型 char
		 */
		System.out.println("基本类型：char 二进制位数：" + Character.SIZE);
		System.out.println("包装类：java.lang.Character");
		char char_1 = 'A';
//		 char char_2 = 'AA';
		System.out.println("char_1 =" + char_1);
	}
}

/**
 * 运算符
 * 算术*7：+ - * / % ++ --
 * 关系*6：== != > < >= <=
 * 位*7：& | ^ ~ << >> >>>
 * 逻辑*3：&& || !
 * 赋值*11：= += -= /= %=  
 * 
 * @author Matthew
 *
 */
class OperatingCharacter {

	public static void main(String[] args) {
		
		/*
		 * 算术运算
		 * + - * / % ++ --
		 */
		int a = 10;
		int b = 20;
		int c = 25;
		int d = 25;
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("b / a = " + (b / a));
		System.out.println("b % a = " + (b % a));
		System.out.println("c % a = " + (c % a));

		/*
		 * 自增、自减
		 */
		System.out.println("a++   = " + a++);
		System.out.println("a--   = " + a--);

		/*
		 * 区分 d++ 与 ++d 的不同
		 * d = d + 1
		 * d += 1
		 */
		System.out.println("d++   = " + d++);
		System.out.println("++d   = " + ++d);
		System.out.println();
		
		/*
		 * 自增/减运算与表达式在同时出现时
		 * 前缀自增/减法 ++a/--a: 先进行自增/减运算，再进行表达式运算
		 * 后缀自增/减法 a++/a--: 先进行表达式运算，再进行自增/减运算
		 */
		int i 		= 1,
			j 		= 1,
			plus_i 	= ++i,
			j_plus 	= j++;
		
		/*
		 * i = 1
		 * plus_i(++i) = 2
		 * i = 2
		 * 2 * plus_i = 4
		 */
		System.out.println("plus_i/++i = " + plus_i + ", 2 * ++i = " + 2 * plus_i);
		
		/*
		 * j = 1
		 * j_plust(j++) = 1
		 * j = 2
		 * 2 * j_plust = 2
		 */
		System.out.println("j_plus/j++ = " + j_plus + ", 2 * j++ = " + 2 * j_plus);
		System.out.println();
		
		/*
		 * 关系运算
		 * == != > < >= <=
		 */
		 int e = 10;
	     int f = 20;
	     System.out.println("e == f = " + (e == f));
	     System.out.println("e != f = " + (e != f));
	     System.out.println("e > f = " + (e > f));
	     System.out.println("e < f = " + (e < f));
	     System.out.println("f >= e = " + (f >= e));
	     System.out.println("f <= e = " + (f <= e));
	     System.out.println();
	     
	    /*
	 	 * 逻辑运算
	 	 * 与 或 非
	 	 * & | !
	 	 */
	 	
		boolean T = true;
		boolean F = false;
		
		/*
		 * 逻辑与 &
		 * 同真则真，有假则假
		 */
		System.out.println("T & T = " + (T & T));
		System.out.println("T & F = " + (T & F));
		System.out.println("F & F = " + (F & F));
		
		/*
		 * 逻辑或 |
		 * 同假则假，有真则真
		 */
		System.out.println("T | F = " + (T | F));
		System.out.println("T | T = " + (T | T));
		System.out.println("F | F = " + (F | F));
		
		/*
		 * 逻辑非 !
		 * 非假则真
		 * 非真则假
		 */
		System.out.println("!T = " + !T);
		System.out.println("!F = " + !F);
		System.out.println();
		
		/*
		 * 短路逻辑的情况
		 * & &&
		 * | ||
		 */
		int g = 5;
		int h = 5;
		boolean b1 = (g < 4) & (g++ < 10);
		boolean b2 = (h < 4) && /* 短路 */ (h++ < 10);
		
		System.out.println("短路逻辑的情况");
		System.out.println("未使用短路逻辑运算，g = " + g);
		System.out.println("b1 = " + b1);
		System.out.println("使用短路逻辑运算，h = " + h);
		System.out.println("b2 = " + b2);
		System.out.println();

		/*
		 * 赋值运算
		 * = += -= /= %= <<= >>= &= ^= |=
		 */
		int f_a = 1,
			f_b = 2,
			f_c = 0;
		
		/*
		 * 普通赋值
		 */
		f_c = f_a + f_b;
		System.out.println("f_c = f_a + b = " + f_c);
		
		/*
		 * f_c += f_a
		 * f_c = f_c + f_a
		 */
		f_c += f_a;
		System.out.println("f_c += f_a = " + (f_c += f_a));
		
		f_c = 0;
		f_c -= f_a;
		System.out.println("f_c -= f_a = " + (f_c -= f_a));
		
		f_c = 0;
		f_c *= f_a;
		System.out.println("f_c *= f_a = " + f_c);
	
		f_c = 0;
		f_c /= f_a;
		System.out.println("f_c /= f_a = " + f_c);
		
		f_c = 0;
		f_c %= f_a;
		System.out.println("f_c %= f_a = " + f_c);
		
	}
}

/**
 * 几种常见的转义字符
 * 
 * @author Sasaki
 *
 */
class EscapeCharacterCase {
	
	public static void main(String[] args) {
		
		System.out.println("\\n 换行字符转义：A换行\nB");
		System.out.println("\\t Tab字符转义：ATab空格\tB");
		System.out.println("\\\" 双引号字符转义：\"");
		System.out.println("\\\' 双引号字符转义：\'");
		System.out.println("\\\\ 捺字符转义：\\");
		System.out.println("\"");
		System.out.println('\'');
	}
}

class EmployeeCase {

	public static void main(String[] args) {
		/* 使用构造器创建两个对象 */
		Employee employee_1 = new Employee("Tom");
		Employee employee_2 = new Employee("Bob");

		// 调用这两个对象的成员方法
		employee_1.setAge(26);
		employee_1.setDesignation("高级程序员");
		employee_1.setSalary(1000);
		employee_1.printEmployee();
		
		System.out.println();

		employee_2.setAge(21);
		employee_2.setDesignation("菜鸟程序员");
		employee_2.setSalary(500);
		employee_2.printEmployee();
		
	}
}

/**
 * 对Employee 员工类的创建
 * 属性和访问方法
 * 打印员工信息方法
 * 
 * @author Matthew
 */
class Employee {
	private String name;
	private int age;
	private String designation;
	private double salary;

	// Employee 类的构造方法
	public Employee(String name) {
		this.name = name;
	}

	/**
	 * 打印员工信息
	 */
	public void printEmployee() {
		System.out.println("名字:" + this.getName());
		System.out.println("年龄:" + this.getAge());
		System.out.println("职位:" + this.getDesignation());
		System.out.println("薪水:" + this.getSalary());
	}

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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

/**
 * 
 * 访问修饰符 访问修饰符控制package访问范围 
 * - public 所有包 
 * - protected 修饰变量、方法、接口，与OOP继承相关 
 * - [default] 同一包 
 * - private 当前类
 * 
 * 本节主要讨论public、default、private情况
 * 更多具体的情况在后续OOP的继承性中讨论
 * 
 * @author Matthew
 *
 */
class AccessCharacterCase {

	private 	int i_prviate;		// OOP建议private属性
	protected 	int i_protected;	// 通常与OOP的继承相关
	/*default*/	int i_default;		// 通常仅在本类中使用这个属性
	public 		int i_public; 		// 尽管没语法错误，OOP编程规范中很少使用public属性
	
	private		int i;				// OOP建议private属性

	public static void main(String[] args) {
		
		/*
		 * 当前类中可以自由访问本类的属性
		 */
		AccessCharacterCase ac = new AccessCharacterCase();
		System.out.println("AccessCharacter i_prviate = " + ac.i_prviate);
		System.out.println("AccessCharacter i_protected = " + ac.i_protected);
		System.out.println("AccessCharacter i_default = " + ac.i_default);
		System.out.println("AccessCharacter i_public = " + ac.i_public);
		
		System.out.println("AccessCharacter i = " + ac.i);
		System.out.println("AccessCharacter i by getter = " + ac.getI());
		
	}

	/*
	 * private属性的getter/setter
	 */
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
}

class SubAccessCharacterCase {
	
	public static void main(String[] args) {
		
		/*
		 * 在其他类中创建 AccessCharacter 对象
		 * 测试访问 AccessCharacter 属性的情况
		 */
		AccessCharacterCase ac = new AccessCharacterCase();
		
		/*
		 * 在其他类可以自由访问 AccessCharacterCase 的非private属性
		 * 一定程度上造成了不安全因素，OOP的编程规范是，设置为private属性
		 * 提供getter/setter方法供其他类访问，这体现了OOP的封装性
		 * 
		 * 后续在OOP的继承性中，讨论protected、default的更多情况
		 */
		
//		System.out.println("SubAccessCharacter i_prviate = " + ac.i_prviate);
		System.out.println("SubAccessCharacter i_protected = " + ac.i_protected);
		System.out.println("SubAccessCharacter i_default = " + ac.i_default);
		System.out.println("SubAccessCharacter i_public = " + ac.i_public);
//		System.out.println("SubAccessCharacter i = " + ac.i);
		System.out.println("SubAccessCharacter i_getter = " + ac.getI());
		
	}
}

/**
 * 循环结构 
 * while 
 * do-while 
 * for
 * for( : )
 * for-each
 * 
 * break
 * 
 * @author Matthew
 *
 */
class LoopCase {

	public static void main(String[] args) {

		/*
		 * while
		 * - 仅带条件
		 * - 先判断，再执行
		 */
		int i_1 = 0;
		while(i_1 <= 5) {
			System.out.println("while循环打印 i_1 = " + i_1++);
			
//			System.out.println(i);
//			i++;
		}
		
		System.out.println();
		
		/*
		 * do-while
		 * - 即时循环条件不满足，至少执行一次循环体
		 * - 条件满足时，与while一致
		 */
		int i_2 = 0;
		do {
			System.out.println("do-while循环打印 i_2 = " + i_2++);
		} while (i_2 >= 5);
		
		System.out.println();
		
		/*
		 * for
		 * 预先确定循环执行次数
		 */
		for (int i_3 = 0; i_3 <= 5; i_3++) {
			System.out.println("for循环打印 i_3 = " + i_3);
		}
		
		System.out.println();
		
		/*
		 * break
		 * 在给定条件下，控制跳出循环
		 */
		int j = 0;
		while (j <= 10) {
			System.out.println("while循环打印 j = " + j);
			j++;
			if (j == 3) {
				System.out.println(" j == " + j + ", 时，break");
				break;
			}
		}
		
		System.out.println();
		
		/*
		 * for ( : ) 
		 * - 增强for，JDK1.5后新增功能，常用于打印集合或数组
		 * - 不关注执行次数，只关注循环过程
		 */
		int[] array = { 0, 1, 2, 3, 4, 5 };
		
		for (int i_4 = 0; i_4 </* 注意条件是 < 不是 <= */ array.length; i_4++) {
			System.out.println("for循环打印 array[" + i_4 + "] = " + array[i_4]);
		}
		
		System.out.println();
		
		for (int array_i : array) {
			System.out.println("增强for循环打印 array_i = " + array_i);
		}
 		
		System.out.println();
		
		/*
		 * for-each
		 * JDK1.8新特性，与Lambda相关
		 * 
		 * 观察 for -> for( : ) -> for-each 的阶段变化
		 * 极大地简化代码量
		 * 
		 */
		List<String> list = new ArrayList<>();
		list.add("Tom");
		list.add("Jerry");
		list.add("Bob");
		
		// forEach方法与Lambda表达式
		list.forEach(i -> System.out.println(i));
	}

}


/**
 * 条件语句
 * if-(else if)-else
 * ? :
 * switch-case
 *
 * @author Matthew
 *
 */
class ConditionCase {

	public static void main(String[] args) {
		
		int i = 1;

		/*
		 * 仅if语句
		 */
		System.out.println("仅if语句的情况");
		if (i < 10) {
			System.out.println("i < 10 条件成立");
		}
		
		System.out.println();

		/*
		 * if-else语句
		 */
		System.out.println("if-else语句的情况");
		if (i < 10) {
			System.out.println("i = " + i + ", i < 10 条件成立");
		} else {
			System.out.println("i = " + i + ", i < 10 条件不成立");
		}
		
		System.out.println();
		
		/*
		 * if-else if-if语句
		 */
		System.out.println("if-else-if语句的情况");
		if (i < 10) {
			System.out.print("i = " + i + ", i < 10 条件成立");
		} else if(i == 10) {
			System.out.print("i = " + i + ", i = 10 条件不成立");
		} else {
			System.out.print("i = " + i + ", i < 10 | i = 10 条件不成立");
		}
		
		System.out.println();
		
		/*
		 * ? : 三元表达式
		 * 等于简化 if-else
		 * 注意 ? : 三元表达式有返回值，可以赋值
		 * if-else是控制语句，无返回
		 */
		System.out.println((i < 10) ? "i < 10 条件成立" : "i < 10 条件不成立");
		
		// 对比j1和j2两种方式赋值
		boolean j1 = ((i < 10) ? true : false);
		boolean j2;
		if (i < 10) {
			j2 = true;
		} else {
			j2 = false;
		}
		
		System.out.println();
		
		/*
		 * switch-case语句
		 * 条件语句中效率最高
		 * 特定情况下可以替代if-else
		 */
		char grade = 'C';
		String gradeInfo = "";
		
		switch (grade) {
		case 'A':
			gradeInfo = "优";
			break;
		case 'B':
			gradeInfo = "良";
			break;
		case 'C':
			gradeInfo = "中";
			break;
		case 'D':
			gradeInfo = "及格";
			break;
		case 'E':
			gradeInfo = "不及格";
			break;
		default:
			gradeInfo = "未知";
		}
		System.out.println("最终等级是" + gradeInfo);
		
	}
}

/**
 * 包装类型*8
 * 
 * Boolean 	boolean
 * Byte 	byte
 * Short 	short
 * Integer 	int
 * Long 	long
 * Character char
 * Float	float
 * Double 	double
 * 
 * 基本数据类型的对象类型
 * 包装类型提供了系列常用的方法
 * 比如比较大小、计算、取最值等等
 * 空值是null，可以判定空
 * 
 * Number & Math类方法，常用操作数理计算
 * 
 * @author Matthew
 *
 */
class BoxedType {
	
	public static void main(String[] args) {
		
		/*
		 * 定义包装类
		 */
		Boolean objectBoolean 	= new Boolean(false);
		Byte objectByte 		= new Byte("11");
		Short objectShort 		= new Short("0");
		Integer objectInt 		= new Integer(0);
		Long objectLong 		= new Long(0L);
		Character objectChar 	= new Character('C');
		Float objectFloat 		= new Float(1.23F);
		Double objectDouble 	= new Double(12.345D);
		
		System.out.println("objectBoolean = " + objectBoolean);
		System.out.println("objectByte = " + objectByte);
		System.out.println("objectShort = " + objectShort);
		System.out.println("objectInt = " + objectInt);
		System.out.println("objectLong = " + objectLong);
		System.out.println("objectChar = " + objectChar);
		System.out.println("objectFloat = " + objectFloat);
		System.out.println("objectDouble = " + objectDouble);
		
		System.out.println();
		
		/*
		 * Number 
		 * Math
		 * 常用数理常用方法
		 */
		Integer i1 = new Integer(1);
		Integer i2 = 2; // 自动装箱
		
		System.out.println("返回目标类型值：" + i1.doubleValue());
		System.out.println("与目标值比较大小：" + i2.compareTo(3)); // < -1; > 1; = 0
		System.out.println("与目标值比较是否相等：" + i1.equals(1));
		System.out.println("转化字符串类型：" + i1.toString());
		System.out.println();
		
		System.out.println("求最小值：" + Math.min(i1, i2));
		System.out.println("求最大值：" + Math.max(i1, i2));
		System.out.println("取随机数：" + Math.random());// 0~1之间的随机数
		System.out.println("取绝对值：" + Math.abs(-12));
		System.out.println("取四舍五入：" + Math.round(123.52));
		System.out.println("90度的正弦值：" + Math.sin(Math.PI/2));  
        System.out.println("0度的余弦值：" + Math.cos(0));  
        System.out.println("60度的正切值：" + Math.tan(Math.PI/3));  
        System.out.println("1的反正切值： " + Math.atan(1));  
        System.out.println("π/2的角度值：" + Math.toDegrees(Math.PI/2));  
        System.out.println(Math.PI); 
		
	}
}

/**
 * 
 * 引用类型
 * 
 * - 一旦声明类型不可改变
 * - 对象、数组都是引用数据类型
 * - 所有引用类型的默认值都是null
 * - 一个引用变量可以用来引用任何与之兼容的类型
 * 
 * @author Matthew
 *
 */
class ReferenceTypeCase {
	
	public static void main(String[] args) {

		// 直接创建
		String string_1 = ""; 
		
		// 使用构造方法创建
		String string_2 = new String(""); 
		
		// 引用类型的默认值是null
		String string_3 = null;
		
		// 不初始化，不建议
		String string_4;
		
		// String类型的数组引用类型
		String[] strings = new String[2];

		// 引用兼容类型, Object是所有类的父类
		Object objectString = string_1;
	}
}

/**
 * String类以及常用方法
 * 
 * String在编程当中使用特别频繁
 * 常用方法要多练习，多熟悉
 * 
 * @author Matthew
 *
 */
class StringCase {
	
	public static void main(String[] args) {
		
		String string_1 = "string_1";
		String string_2 = "string_2";
		Float float_1 = 12.23F;
		Integer int_1 = 12;
		
		/*
		 * printf() 格式化字符串并打印
		 * format() 创建可复用的格式化字符串
		 */
		System.out.printf(				//
				"浮点型变量的值为 %f\n" + 	//
				"整型变量的值为 %d\n" + 	//
				"字符串变量的值为 %s\n" 	//
				, float_1, int_1, string_1);
		System.out.println();
		
		/*
		 * 使用format方法创建可复用的格式化字符串
		 */
		String string_3 = String.format(//
				"浮点型变量的值为 %f\n" + 	//
				"整型变量的值为 %d\n" + 	//
				"字符串变量的值为 %s" 		//
				, float_1, int_1, string_1);
		
		System.out.println("string_3 : \n" + string_3);
		System.out.println();
		
		/*
		 * String常用方法
		 * 注意方法的参数和返回值
		 * 
		 * - 返回字符串长度
		 * int length()
		 * 
		 * - 返回连接字符串
		 * String concat(String str)
		 * 
		 * - 返回返回指定索引处的 char 值
		 * char charAt(int index)
		 * 
		 * - 返回字符串比较是否相等
		 * boolean equals(Object anObject)
		 * 
		 * - 返回字符串转byte[]数组
		 * byte[] getBytes()
		 * 
		 * - 返回某字符在字符串中首次出现的位置
		 * int indexOf(int ch)
		 * 
		 * - 返回某字符在字符串中末次出现的位置
		 * int lastIndexOf(int ch)
		 * 
		 * - 返回用目标字符替代某字符
		 * String replace(String regex, String replacement)
		 * 
		 * - 返回字符串按分隔符切分，通常是, ; \t \s
		 * String[] split(String regex)
		 * 
		 * - 返回从某个位置开始的子串
		 * String substring(int beginIndex)
		 * 
		 * - 返回字符串全小写
	 	 * String toLowerCase()
	 	 * 
	 	 * - 返回转换字符串类型，可以重写方法进行打印输出
		 * String toString()
		 * 
		 * - 返回字符串去除两边空白的子串
		 * String trim()
		 * 
		 * - 返回字符串是否包含某子串
		 * contains(CharSequence chars)
		 * 
		 * - 返回字符串是否为空 ""
		 * isEmpty()
		 */
		System.out.println("字符串长度：" + string_1.length());
		System.out.println("字符串连接：" + string_1.concat(string_2));
		System.out.println("string_1的第三个字符是：" + string_1.charAt(3));
		System.out.println("string_1 string_2 是否相等：" + string_1.equals(string_2));
		System.out.println("string_1的bytes[]" + string_1.getBytes());
		System.out.println("字符在字符串中首次出现的位置：" + string_1.indexOf('r'));
		System.out.println("字符在字符串中末次出现的位置：" + string_1.lastIndexOf("_"));
		System.out.println("字符串替换" + string_1.replace("string", "int"));
		Arrays.asList("1;2;3;4;5;a;b;c;d".split(";")).forEach(string -> System.out.println("分隔字符串：" + string));
		System.out.println("返回从第3个索引开始的子串：" + string_1.substring(3)); // 注意索引从0开始
		System.out.println("字符串转换大写：" + string_1.toUpperCase());
		System.out.println("转换为字符串类型：" + new Integer(123).toString()); // toString()方法用于打印输出，经常重写使用
		System.out.println(" string_1 ".trim());
		System.out.println("字符串是否包含子串：" + string_1.contains("str"));
		System.out.println("\"string_1\" 字符串是否为空：" + string_1.isEmpty());
		System.out.println("\"\" 字符串是否为空：" + "".isEmpty());
		
	}
}

/**
 * 
 * - String包含是对象的方法，每次调用会返回新的对象类型，不太适用连续多次操作String的情况
 * - StringBuffer 与 StringBuilder 都操作String本身，提供静态方法，方法基本一致
 * - SringBuilder 非线程安全，同步访问可能导致数据不一致
 * - SringBuilder 效率较高，通常情况使用较多
 * - 二维数组
 * - Arrays 提供方便的数组操作方法
 * 
 * @author Matthew
 *
 */
class StringBufferAndStringBuilderCase {
	
	public static void main(String[] args) {
		
		/*
		 * - 创建 StringBuilder 对象
		 * new StringBuilder(_)
		 */
		StringBuilder builder = new StringBuilder("This is a basic string by StringBuilder.");
		StringBuffer buffer =  new StringBuffer("This is a basic string by StringBuffer.");
		
		builder
			.append("\n") 											// 追加换行
			.append("This is a new Line.\n") 						// 追加内容
			.append("string");
		System.out.println(builder.toString() + "\n"); 				// 打印输出
		
		int index_lastS = builder.lastIndexOf("s");					// 获取子串的最后一个索引
		int length = builder.length();								// 获取长度 

		String subString = builder.substring(index_lastS, length);	// 获取子串，String
		System.out.println(subString + "\n");
		
		builder.delete(index_lastS, length); 						// 删除某子串
		System.out.println(builder + "\n");
		
		builder.reverse();
		System.out.println(builder);
		
		/*
		 * 小作业：
		 * 使用 StringBuffer 对象，熟悉相关方法，实现同样的功能
		 */
		
	}
}

/**
 * 
 * 数组
 * - 存储固定大小的同类型元素
 * - 数组索引从0开始，到length-1
 * - 数组遍历是数组的常规基础操作
 * 
 * @author Matthew
 *
 */
class ArrayCase {
	
	public static void main(String[] args) {
		
		int size = 3;
		Integer[] array_int_1 = new Integer[size];
		array_int_1[0] = 0;
		array_int_1[1] = 100;
		array_int_1[2] = 200;

		Integer[] array_int_2 = { 1, 101, 201 };
		
		/*
		 * 使用 for / for-each 循环遍历数组
		 * 打印元素，计算总和
		 */
		int sum = 0;
		
		for (int i = 0; i < array_int_1.length; i++) {
			sum += array_int_1[i];
			System.out.println("array_int_[" + i + "] = " + array_int_1[i]);
		}
			
		sum = 0;
		for(Integer int_1: array_int_1) 
			sum += int_1;
		
		System.out.println("\n数组array_int_1的值总和为：" + sum);
		
		/*
		 * 二维数组
		 * 一维数组中每个元素是另一个一维数组
		 */
		
		// 分别初始化数组元素
		String[][] _2DArray_1 = new String[2][3]; // 2行3列的数组
		_2DArray_1[0] = new String[2];
		_2DArray_1[1] = new String[3];
		_2DArray_1[0][1] = new String("Good");
		
		// 创建时直接初始化数组元素
		String[][] _2DArray_2 = {  //
				{ "A", "B", "C" }, //
				{ "D", "E", "F" }, //
				{ "G", "H", "I" }  //
		};
		
		// 遍历二维数组元素
		System.out.println("{");
		for (String[] _Row_i : _2DArray_2) {
			System.out.print("\t{ ");
			for (String _Column_i : _Row_i) {
				System.out.print("\"" + _Column_i + "\", ");
			}
			System.out.println("}, ");
		}
		System.out.println("}\n");
		
		/*
		 * Arrays 操作数组
		 */
		// Lambda表达式操作数组内部
		Arrays.asList(_2DArray_2).forEach(o -> {
			String[] _Row_i = o;
			Arrays.asList(_Row_i).forEach(o_ -> {
				String _Column_i = o_;
				System.out.print("\"" + _Column_i + "\", ");
			});
		});
		System.out.println("\n");
		
		Arrays // Lambda表达式遍历数组，最简化打印输出
			.asList(_2DArray_2) //
			.forEach(o -> Arrays.asList(o).forEach(System.out::println));
		
		/*
		 * sort()
		 * - 对数组进行升序排序
		 */
		Integer[] array_int_3 = { 1, 12, 21, 34, 5, 22 };
		Arrays.sort(array_int_3);
		Arrays.asList(array_int_3).forEach(System.out::println);

	}
}

/**
 * 日期时间
 * 
 * java.util.Date
 * java.util.SimpleDateFormat
 * 
 * @author Matthew
 *
 */
class DateAndTime {
	
	public static void main(String[] args) {
		
		// 获取当前日期时间
		Date date = new Date();
		System.out.println(date.toString());
		
		/*
		 * 格式化输出日期时间
		 * 使用Pattern yyyy-MM-dd hh:mm:ss
		 */
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println("现在时间：" + format.format(date) + "\n");

		/*
		 * 使用printf格式化输出
		 */
		// c 包括全部日期和时间信息
		System.out.printf("全部日期和时间信息：%tc%n", date);
		// F "年-月-日"格式
		System.out.printf("年-月-日格式：%tF%n", date);
		// D "月/日/年"格式
		System.out.printf("月/日/年格式：%tD%n", date);
		// r "HH:MM:SS PM"格式（12时制）
		System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n", date);
		// T "HH:MM:SS"格式（24时制）
		System.out.printf("HH:MM:SS格式（24时制）：%tT%n", date);
		// R "HH:MM"格式（24时制）
		System.out.printf("HH:MM格式（24时制）：%tR", date);
		
		System.out.println();
		
		/*
		 * 格式化输出部分信息
		 */
		// b 月份简称
		String str = String.format(Locale.US, "英文月份简称：%tb", date);
		System.out.println(str);
		System.out.printf("本地月份简称：%tb%n", date);

		// B 月份全称
		str = String.format(Locale.US, "英文月份全称：%tB", date);
		System.out.println(str);
		System.out.printf("本地月份全称：%tB%n", date);

		// a 星期简称
		str = String.format(Locale.US, "英文星期的简称：%ta", date);
		System.out.println(str);

		// A 星期全称
		System.out.printf("本地星期的简称：%tA%n", date);

		// C 年前两位
		System.out.printf("年的前两位数字（不足两位前面补0）：%tC%n", date);

		// y 年后两位
		System.out.printf("年的后两位数字（不足两位前面补0）：%ty%n", date);

		// j 一年的第几天
		System.out.printf("一年中的天数（即年的第几天）：%tj%n", date);

		// m 月份
		System.out.printf("两位数字的月份（不足两位前面补0）：%tm%n", date);

		// d 日（二位，不够补零）
		System.out.printf("两位数字的日（不足两位前面补0）：%td%n", date);

		// e 日（一位，不补零）
		System.out.printf("月份的日（前面不补0）：%te", date);
				
		try {
			/*
			 * 字符串解析为时间
			 */
			String dateString = "2021.06.19";
			SimpleDateFormat format2 = new SimpleDateFormat("yyyy.MM.dd");

			Date resultDate = format2.parse(dateString);
			System.out.println("\n解析后的日期：" + resultDate.toString() + "\n");
			
			/*
			 * 测量时间间隔
			 */
			// 获取当前时间毫秒值
			long timestamp = System.currentTimeMillis();
			System.out.println(new Date() + "\n");
			
			Thread.sleep(1000); // 程序线程休眠1s
			System.out.println(new Date() + "\n");
			long timestamp_ = System.currentTimeMillis();
			
			long timeDifference = timestamp_ - timestamp;
			System.out.println("前后时间差值为：" + timeDifference + "\n");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/*
		 * 使用java.util.Calendar类操作日历时间
		 * 实现日期计算
		 */
		 // 获取当前日期时间
		Calendar calendar_1 = Calendar.getInstance();
		Calendar calendar_2 = Calendar.getInstance();
		calendar_2.set(2021, 1-1 /*参数从0开始，6月参数为6-1*/, 1);
		System.out.println("当前日历时间：" + calendar_1.toString());
		
		/*
		 * 分别用Calendar常量获取日期时间值
		 */
		// 获得年份
		int year = calendar_1.get(Calendar.YEAR);
		System.out.println("year: " + year);
		
		// 获得月份
		int month = calendar_1.get(Calendar.MONTH) + 1;
		System.out.println("month: " + month);
		
		// 获得日期
		int date_ = calendar_1.get(Calendar.DATE);
		System.out.println("date: " + date_);
		
		// 获得小时
		int hour = calendar_1.get(Calendar.HOUR_OF_DAY);
		System.out.println("hour: " + hour);
		
		// 获得分钟
		int minute = calendar_1.get(Calendar.MINUTE);
		System.out.println("minute: " + minute);
		
		// 获得秒
		int second = calendar_1.get(Calendar.SECOND);
		System.out.println("second: " + second);
		
		// 获得星期几 1-星期日，2-星期1，3-星期二，以此类推
		int day = calendar_1.get(Calendar.DAY_OF_WEEK);
		System.out.println("day: " + day + "\n");
		
		/*
		 * 小作业
		 * 在Java API中查询Calendar相关方法
		 * 并尝试使用方法解决一些日常问题
		 */
		System.out.println(calendar_1.before(calendar_2));
		
	}
}
