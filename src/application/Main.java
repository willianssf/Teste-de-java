package application;

import entities.controller.Controller;
import entities.view.View;

public class Main {

	public static void main(String[] args)  {
		
		View menu = new View();
		menu.layout();
		
		@SuppressWarnings("rawtypes")
		Controller ct = new Controller();
		ct.mostra();
		
	}

}
