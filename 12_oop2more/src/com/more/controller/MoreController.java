package com.more.controller;

import java.util.Date;
import java.util.Scanner;

import com.more.model.vo.Animal;
import com.more.model.vo.Cat;
import com.more.model.vo.Circle;
import com.more.model.vo.Dog;
import com.more.model.vo.Rectangle;
import com.more.model.vo.Shape;
import com.more.model.vo.Shield;
import com.more.model.vo.Sword;
import com.more.model.vo.Tiger;
import com.more.model.vo.Triangle;

public class MoreController {

	//private Shape sh;
	
	public MoreController() {
		// TODO Auto-generated constructor stub
	}
	
	
	
//	public MoreController(Shape sh) {
//		super();
//		this.sh = sh;
//	}

	public void basicTest() {
		//System.out.println("처음 : "+sh);
		//다형성테스트
		Shape shape=new Shape();
		Circle circle=new Circle();
		Triangle triangle=new Triangle();
		Rectangle rec=new Rectangle();
		shape=new Circle();
		System.out.println(shape instanceof Circle);
		System.out.println(shape instanceof Rectangle);
		System.out.println(shape instanceof Shape);

		shape=new Rectangle();		
		System.out.println(shape instanceof Circle);
		System.out.println(shape instanceof Rectangle);
		System.out.println(shape instanceof Shape);
		
		Object obj=new Object();
		obj=new Date();
		obj=new String();
		obj=new Circle();
		obj=new Scanner(System.in);
		
		
		
//		shape.getX();
//		shape.getY();
//		
//		circle.getX();
//		circle.getY();
//		circle.getRadius();
//		Shape b;		
//		b=new Circle();//자료형은 Shape O / Circle X
//		shape.getX();
//		shape.getY();
//		((Circle)b).getRadius();
		//Circle c=(Circle)shape;
//		shape=new Triangle();다형성의 기준은 상속!
		//shape=(Shape)triangle;
		
		//rec=(Rectangle)shape;
		//rec.getPoint();
//		Object[] objs=new Object[5];
//		objs[0]=new Scanner(System.in);
//		objs[1]=new String("유병승");
//		objs[2]=new Shape();
		
		
		
//		Shape[] shapes=new Shape[5];
//		shapes[0]=new Circle();
//		shapes[1]=new Rectangle();
//		shapes[2]=new Circle();
//		
//		System.out.println(shapes[0]);
//		System.out.println(shapes[1]);
//		
//		
//		
//		shape.CircleCal(new Circle());
//		shape.RecCal(new Rectangle());
		
		
		
		
		
		
		
		
		shape=new Rectangle();
		//circle=new Shape();
		
		
		
		
	}
	
	public void animalTest() {
		Animal[] ani=new Animal[5];
		ani[0]=new Dog("멍멍이", "양파");
		ani[1]=new Cat("고양이","치즈");
		ani[2]=new Tiger("고양이","호순이");
		
		ani[0].action();
		ani[1].bark();
		ani[2].bark();

	}
	
	public void instanceTest() {
		MoreController mc=new MoreController();
		Animal p=new Dog();
		mc.checkObj(p);
		mc.checkObj(new Cat());
		mc.checkObj(new Tiger());
		mc.checkObj(new Triangle());
	}
	
	public void checkObj(Animal ani) {
		if(ani instanceof Cat) {
			((Cat)ani).clean();
		}
		else if(ani instanceof Dog) {
			((Dog)ani).action();
		}
		else if(ani instanceof Tiger) {
			((Tiger)ani).attack();
		}
		else System.out.println("그런 객체없어!");
	}
	
	
	public void createChara() {
		
		com.more.model.vo.Character c1=new com.more.model.vo.Character("지존준영", 1,100,20,0,new Sword("지존검",200));
		System.out.println(c1);
		((Sword)c1.getItem()).getAttack();
		
		com.more.model.vo.Character c2=new com.more.model.vo.Character("지존준영", 1,100,20,0,new Shield("지존방패",200));
		System.out.println(c2);
	}
	
	
	
}













