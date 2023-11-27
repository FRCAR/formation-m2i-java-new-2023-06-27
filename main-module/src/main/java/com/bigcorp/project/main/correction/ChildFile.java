package com.bigcorp.project.main.correction;

public class ChildFile {

	private String nom;

	private Integer age;

	public ChildFile() {
	}

	public ChildFile(Integer age2, String nom2) {
		// TODO Auto-generated constructor stub
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	public static ChildFile copyFromChild(Child c) {
		return new ChildFile(c.getAge(), c.getNom());
	}

}