package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.AgressiveBehavior;
import one.digitalinnovation.gof.strategy.Behavior;
import one.digitalinnovation.gof.strategy.DefensiveBehavior;
import one.digitalinnovation.gof.strategy.NormalBehavior;
import one.digitalinnovation.gof.strategy.Robot;

public class Test {

	public static void main(String[] args) {
		
		// Singleton
		
		SingletonLazy lazy = SingletonLazy.getInstance();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstance();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstance();
		System.out.println(eager);
		eager = SingletonEager.getInstance();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstance();
		System.out.println(lazyHolder);
		
		// Strategy
		
		Behavior defensive = new DefensiveBehavior();
		Behavior normal = new NormalBehavior();
		Behavior agressive = new AgressiveBehavior();
		
		Robot robot = new Robot();
		robot.setBehavior(normal);
		robot.move();
		robot.move();
		robot.setBehavior(defensive);
		robot.move();
		robot.setBehavior(agressive);
		robot.move();
		robot.move();
		robot.move();
		
		// Facade
		
		Facade facade = new Facade();
		facade.migrateCustomer("Venilton", "14801788");
	}

}
