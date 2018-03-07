package com.spring.mvc.px;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Car {
	
	public Car(){
		
	}
	
	private String color;
	public Car(String color){
		this.color = color;
	}
	
	//����ע��
	private Engine engine;
	
	public void printCar() {
		System.out.println("����һ��������ɫ="+this.color);
		if(null != this.engine)
			engine.printEngine();
	}

	public static void main(String[] args) {
		Car c = new Car("yellow");
		c.printCar();
		
		//�������spring�����ļ���������bean���ص�context�У�
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml" });
		
		//��context�л�ȡCar����࣬ͨ��������ƣ�
		Car mycar = ctx.getBean("myCar",  Car.class);
		mycar.printCar();
	}
	
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
}

