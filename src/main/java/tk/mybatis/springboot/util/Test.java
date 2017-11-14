package tk.mybatis.springboot.util;

import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;

public class Test extends base {
	int i;
	static{
		System.out.println(6);
	}
	public static void main(String[] args) {
		base a = new Test(23);
		a.out();
		System.out.println(8|9&10^11);
		System.out.println(8|9&10^11);
		System.out.println(8|9&10^11);
		System.out.println(8|9&10^11);
		System.out.println(8|9&10^11);
	}
	{
		System.out.println("b");
	}
	Test(){
		System.out.println(3);
	}
	Test(int i){
		this.i = i;
		System.out.println(i);
	}
	public  void out(){
		System.out.println(this.i);
		System.out.println(super.i);
	}

}

class base {
	int i = 10;
	static{
		System.out.println(7);
	}
	{
		System.out.println("a");
	}
	base(){
		System.out.println(1);
	}
	public  void out(){
		System.out.println(2);
	}
}
