package com.bigcorp.project.main.lambda;

import java.util.ArrayList;
import java.util.List;

public class Window {
	
	private int width;
	private int height;
	private List<LambdaButton> buttons = new ArrayList<>();
	
	public void click(int force, int x, int y) {
		System.out.println("On a cliqué sur la fenêtre");
		String clickValue = buttons.get(0).clickButton(force);
		System.out.println("Le bouton renvoie  : " + clickValue);
	}
	
	public void addButton(LambdaButton button) {
		buttons.add(0, button);
	}

	public static void main(String[] args) {
		Window window = new Window();
		window.addButton(new SoundButton());
		window.click(0, 0, 0);
		
		window.addButton(new CloseButton());
		window.click(0, 0, 0);
		
		window.addButton(new LambdaButton() {
			@Override
			public String clickButton(int force) {
				return "Impression lancée";
			}
		});
		window.click(0, 0, 0);
		
		LambdaButton openFileButton = (int force) -> {
			int a = 3 +4;
			a *=2;
			return "Fichier ouvert";};
			
			window.addButton((int force) -> {return "Lambda button cliqué";});
			//équivaut à
			window.addButton(force ->  "Lambda button cliqué");
			
			
			String messageImportant = "Salut !";
			window.addButton(force ->  {
				int force2 = 2 * force;
				System.out.println(messageImportant);
				return "Lambda button cliqué avec la force : " + force2;
			});

	}

}
