package com.skillstorm.training.day3;

public class Programmer {
	private String name;
	private String company;
	// languages available: Java, Javascript, C++, Python, GoLang
	private static final int MAX_LANGUAGES = 5;
	private String[] languages = new String[MAX_LANGUAGES];
	private int numLanguagesLearned;

	public Programmer() {
		this("Unknown", "Unemployed");
	}

	public Programmer(String name, String company) {
		this.setName(name);
		this.setCompany(company);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String[] getLanguages() {
		return languages;
	}

	public int getNumLanguagesLearned() {
		return numLanguagesLearned;
	}

	public void addLanguage(String language) {

		if (language.length() == 0 || language == null) {
			System.out.println("Please enter a valid language");
		} else {
			this.languages[this.numLanguagesLearned] = language;
			this.numLanguagesLearned++;

		}
	}

	public static void compareProgrammers(Programmer a, Programmer b) {
		if (a.numLanguagesLearned == b.numLanguagesLearned) {
			System.out.println("Both programmers know the same amount of languages.");
		}
		if (a.numLanguagesLearned > b.numLanguagesLearned) {
			System.out.println("Programmer " + a.name + " knows more languages with " + a.numLanguagesLearned);
		} else {
			System.out.println("Programmer " + b.name + " knows more languages with " + b.numLanguagesLearned);
		}

	}

	@Override
	public String toString() {
		String result = "";
		result += "Name: " + this.name + "\n";
		result += "Company: " + this.company + "\n";
		result += this.numLanguagesLearned + " languages learned so far. \n";
		for (int i = 0; i < this.numLanguagesLearned; i++) {
			result += this.languages[i] + ", ";
		}
		result = result.substring(0, result.length() - 2);
		return result;
	}

}
