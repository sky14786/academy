package com.oop.controller;

import com.oop.model.vo.Animal;
import com.oop.model.vo.Bus;

public class ObjectController {

	public void accessTest() {
		Animal dog = new Animal("°³", 3, "»Ç»ß", 3.0, 20.5);
		Animal dog2 = new Animal("°³", 2, 4, 30.3);
		
		dog.printAnimal();
		dog2.printAnimal();
		Animal dogDefault = new Animal();
		dogDefault.printAnimal();
		
		Bus bus = new Bus();
		bus.printBus();
		Bus bus2 = new Bus("»ß»Ç","»ß»Ç»ß»Ç",10,1000,1000,10);
		bus2.printBus();
	}
}
