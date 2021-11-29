package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;
import tests.factory.FinancingFactory;

public class FinancingTests {

	@Test
	public void constructorShouldCreateObjectWhenValidData() {

		// arrange

		// action
		Financing f = FinancingFactory.createValidFinancing();

		// assert
		Assertions.assertEquals(100000, f.getTotalAmount());
		Assertions.assertEquals(2000.0, f.getIncome());
		Assertions.assertEquals(80, f.getMonths());
	}

	@Test
	public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidData() {

		// assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			// action
			Financing f = FinancingFactory.createInvalidFinancing();
		});
	}

	@Test
	public void setTotalAmountShouldUpdateDataWhenValidData() {
		// arrange
		Financing f = FinancingFactory.createValidFinancing();

		// action
		f.setTotalAmount(90000.0);

		// assert
		Assertions.assertEquals(90000.0, f.getTotalAmount());
	}

	@Test
	public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		// assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			// arrange
			Financing f = FinancingFactory.createValidFinancing();
			// action
			f.setTotalAmount(150000.0);
		});
	}

	@Test
	public void setIncomeShouldUpdateDataWhenValidData() {
		// arrange
		Financing f = FinancingFactory.createValidFinancing();

		// action
		f.setIncome(2200.0);

		// assert
		Assertions.assertEquals(2200.0, f.getIncome());
	}

	@Test
	public void setIncomeShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		// assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			// arrange
			Financing f = FinancingFactory.createValidFinancing();
			// action
			f.setIncome(1800.0);
		});
	}

	@Test
	public void setMonthsShouldUpdateDataWhenValidData() {
		// arrange
		Financing f = FinancingFactory.createValidFinancing();

		// action
		f.setMonths(82);

		// assert
		Assertions.assertEquals(82, f.getMonths());
	}

	@Test
	public void setMonthsShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		// assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			// arrange
			Financing f = FinancingFactory.createValidFinancing();
			// action
			f.setMonths(78);
		});
	}

	@Test
	public void entryShouldCalculateEntryCorrectly() {
		// action
		Financing f = FinancingFactory.createValidFinancing();

		// assert
		Assertions.assertEquals(20000.0, f.entry());
	}

	@Test
	public void quotaShouldCalculateQuotaCorrectly() {
		// action
		Financing f = FinancingFactory.createValidFinancing();

		// assert
		Assertions.assertEquals(1000.0, f.quota());
	}
}
