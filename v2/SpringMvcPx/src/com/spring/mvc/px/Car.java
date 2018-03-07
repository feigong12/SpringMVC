package com.spring.mvc.px;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Car {
	
	public Car(){
		
	}
	
	private String color;
	public Car(String color){
		this.color = color;
	}
	
	//依赖注入
	private Engine engine;
	
	public void printCar() {
		System.out.println("这是一辆车，颜色="+this.color);
		if(null != this.engine)
			engine.printEngine();
	}

	public static void main(String[] args) {
		Car c = new Car("yellow");
		c.printCar();
		
		//这里加载spring配置文件，将所有bean加载到context中；
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml" });
		
		//从context中获取Car这个类，通过反射机制；
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

