package com.bigcorp.project.main.lambda;

public class CloseButton implements LambdaButton {

	@Override
	public String clickButton(int force) {
		return "Il faut fermer la fenêtre (sinon on s'enrhume).";
	}

}
