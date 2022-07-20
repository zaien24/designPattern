package builderPattern.case1.step2;

import java.time.LocalDate;
import java.time.Month;

public class TestPattern {

	public static void main(String[] args) {
		Person p1 = Person.builder()
				.firstName("FirstName")
				.lastName("lastName")
				.addressOne("테스트")
				.addressTwo("AddressTwo")
				.birthDate(LocalDate.of(2022, Month.APRIL, 13))
				.sex("male")
				.driverLicence(true)
				.married(true)
				.build();
						
		System.out.println(p1.getAddressOne());
	}
	
	
}
