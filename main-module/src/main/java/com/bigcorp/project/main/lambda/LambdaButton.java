package com.bigcorp.project.main.lambda;

@FunctionalInterface
public interface LambdaButton {
	
	public abstract String clickButton(int force);
	
}
