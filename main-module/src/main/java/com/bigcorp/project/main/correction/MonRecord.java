package com.bigcorp.project.main.correction;

public record MonRecord(String nom, Integer longueur, int age, Child enfant) {

	public static String VALEUR_PAR_DEFAUT = "TEST";

	@Override
	public String toString() {
		return "MonRecord [nom=" + nom + ", enfant=" + enfant + "]";
	}

	public boolean estMajeur() {
		return this.age > 18;
	}

}
