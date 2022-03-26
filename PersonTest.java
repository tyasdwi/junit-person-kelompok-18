package app.tugas;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonTest {
	
	private Person createPersonWithAge(int ageToTest) {
		int currentYear = LocalDate.now().getYear();
		int birthYear = currentYear - ageToTest;
		String birthDate = birthYear + "-01-01";
		Person person = new Person ("Lintang", birthDate);
		return person;
	}
	
	@Test
	void testGetAge() {
		int ageToTest = 20;
		Person person = createPersonWithAge(ageToTest);
		Assertions.assertTrue(person.getAge() == ageToTest);
	}
	
	@Test
	void test15YearOldIsNot17OrOlder() {
		Person person = createPersonWithAge(15);
		Assertions.assertFalse(person.is17OrOlder());
	}
	
	@Test
	void test17YearOldIs17OrOlder() {
		Person person = createPersonWithAge(17);
		Assertions.assertTrue(person.is17OrOlder());
	}
	
	@Test
	void test20YearOldIsNot17OrOlder() {
		Person person = createPersonWithAge(20);
		Assertions.assertTrue(person.is17OrOlder());
	}
	

}