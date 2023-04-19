package com.skillstorm.training.day3;
import com.skillstorm.training.day3.Programmer;
public class ProgrammerTests {

	public static void main(String[] args) {
		Programmer tony = new Programmer();
		System.out.println(tony);
		tony.setName("Tony");
		tony.setCompany("Skillstorm");
		System.out.println("The programmer's name is: " + tony.getName());
		System.out.println("The programmer works for: " + tony.getCompany());
		
		Programmer jaycie = new Programmer("Jaycie", "Google");
		
		System.out.println(jaycie);
		jaycie.addLanguage("Java");
		System.out.println(jaycie);
		jaycie.addLanguage("C++");
		System.out.println(jaycie);
		jaycie.addLanguage("");
		System.out.println(jaycie);
		jaycie.addLanguage("Java");
		System.out.println(jaycie);
		
		Programmer.compareProgrammers(tony, jaycie);
	}

}
