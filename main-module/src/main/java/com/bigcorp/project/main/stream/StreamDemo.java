package com.bigcorp.project.main.stream;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		Set<String> mesChaines = new HashSet<>();
		mesChaines.add("Hey");
		mesChaines.add("Quoi");
		mesChaines.add("De");
		mesChaines.add("Neuf");

		System.out.println("Itération avec boucle for ");
		for (String string : mesChaines) {
			System.out.println("Ma collection contient : " + string);
		}

		System.out.println("Itération avec stream");
		mesChaines.stream()
				.filter((String s) -> {
					return s.length() > 2;
				})
				.map((String s) -> {
					return Long.valueOf(s.length());
				})
				.forEach((Long s) -> {
					System.out.println(s);
				});

		// L'instruction ci-dessus peut être raccourcie en :
		mesChaines.stream()
				.filter(s -> s.length() > 2)
				.map(s -> Long.valueOf(s.length()))
				.forEach(System.out::println);

		int sum = mesChaines.stream().mapToInt((String s) -> {
			return s.length();
		}).sum();
		//ou int sum = mesChaines.stream().mapToInt(String::length).sum();
		System.out.println("Le total des caractères de la collection vaut : " + sum);

		//Création d'une nouvelle liste à partir du stream
		List<String> collect = mesChaines.stream()
				.filter(s -> s.length() > 2)
				.collect(Collectors.toList());

	}

}
