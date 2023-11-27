package com.bigcorp.project.main.lambda;

public class SoundButton implements LambdaButton {

	@Override
	public String clickButton(int force) {
		return "J'émets le son BIP";
	}

}
