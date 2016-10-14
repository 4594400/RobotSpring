package ru.javabegin.training.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ru.javabegin.training.spring.impls.conveyor.T1000Conveyor;
import ru.javabegin.training.spring.impls.pool.T1000Pool;
import ru.javabegin.training.spring.impls.robot.ModelT1000;
import ru.javabegin.training.spring.interfaces.RoborConveyor;
import ru.javabegin.training.spring.interfaces.Robot;

import java.util.Collection;

public class Start {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("all_context.xml");
		//ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");

		//T1000Pool t1000Pool = (T1000Pool) context.getBean("t1000Pool");
		//t1000Pool.beginShow();


		T1000Pool t1000GreenPool = (T1000Pool) context.getBean("t1000GreenPool");
		t1000GreenPool.beginShow();


	}
}
