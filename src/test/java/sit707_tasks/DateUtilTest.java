package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Ahsan Habib
 */
public class DateUtilTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "s224752512";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Arpit Mantri";
		Assert.assertNotNull("Student name is null", studentName);
	}

	@Test
	public void testMaxJanuary31ShouldIncrementToFebruary1() {
		// January max boundary area: max+1
		DateUtil date = new DateUtil(31, 1, 2024);
		System.out.println("january31ShouldIncrementToFebruary1 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(2, date.getMonth());
		Assert.assertEquals(1, date.getDay());
		Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void testMaxJanuary31ShouldDecrementToJanuary30() {
		// January max boundary area: max-1
		DateUtil date = new DateUtil(31, 1, 2024);
		System.out.println("january31ShouldDecrementToJanuary30 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(30, date.getDay());
		Assert.assertEquals(1, date.getMonth());
		Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void testNominalJanuary() {
		int randDay = 2 + new Random().nextInt(28);
		DateUtil date = new DateUtil(randDay, 1, 2024);
		System.out.println("testJanuaryNominal > " + date);
		int originalDay = date.getDay();
		date.increment();
		System.out.println(date);
		Assert.assertEquals(originalDay + 1, date.getDay());
		Assert.assertEquals(1, date.getMonth());
		Assert.assertEquals(2024, date.getYear());
	}
	
	/*
	 * January minimum boundary tests.
	 */
	
	@Test
	public void testMinJanuary1ShouldIncrementToJanuary2() {
		// January min boundary area: min+1
		DateUtil date = new DateUtil(1, 1, 2024);
		System.out.println("testMinJanuary1ShouldIncrementToJanuary2 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(2, date.getDay());
		Assert.assertEquals(1, date.getMonth());
		Assert.assertEquals(2024, date.getYear());
	}

	@Test
	public void testMinJanuary1ShouldDecrementToDecember31() {
		// January min boundary area: min-1
		DateUtil date = new DateUtil(1, 1, 2024);
		System.out.println("testMinJanuary1ShouldDecrementToDecember31 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(31, date.getDay());
		Assert.assertEquals(12, date.getMonth());
		Assert.assertEquals(2023, date.getYear());
	}
	
	/*
	 * Next-date boundary value tests.
	 */
	
	@Test
	public void testJune1ShouldIncrementToJune2() {
		DateUtil date = new DateUtil(1, 6, 1994);
		System.out.println("testJune1ShouldIncrementToJune2 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(2, date.getDay());
		Assert.assertEquals(6, date.getMonth());
		Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testJune2ShouldIncrementToJune3() {
		DateUtil date = new DateUtil(2, 6, 1994);
		System.out.println("testJune2ShouldIncrementToJune3 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(3, date.getDay());
		Assert.assertEquals(6, date.getMonth());
		Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testJune15ShouldIncrementToJune16() {
		DateUtil date = new DateUtil(15, 6, 1994);
		System.out.println("testJune15ShouldIncrementToJune16 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(16, date.getDay());
		Assert.assertEquals(6, date.getMonth());
		Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testJune29ShouldIncrementToJune30() {
		DateUtil date = new DateUtil(29, 6, 1994);
		System.out.println("testJune29ShouldIncrementToJune30 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(30, date.getDay());
		Assert.assertEquals(6, date.getMonth());
		Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testJune30ShouldIncrementToJuly1() {
		DateUtil date = new DateUtil(30, 6, 1994);
		System.out.println("testJune30ShouldIncrementToJuly1 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(1, date.getDay());
		Assert.assertEquals(7, date.getMonth());
		Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testJanuary15ShouldIncrementToJanuary16() {
		DateUtil date = new DateUtil(15, 1, 1994);
		System.out.println("testJanuary15ShouldIncrementToJanuary16 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(16, date.getDay());
		Assert.assertEquals(1, date.getMonth());
		Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testFebruary15ShouldIncrementToFebruary16() {
		DateUtil date = new DateUtil(15, 2, 1994);
		System.out.println("testFebruary15ShouldIncrementToFebruary16 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(16, date.getDay());
		Assert.assertEquals(2, date.getMonth());
		Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testNovember15ShouldIncrementToNovember16() {
		DateUtil date = new DateUtil(15, 11, 1994);
		System.out.println("testNovember15ShouldIncrementToNovember16 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(16, date.getDay());
		Assert.assertEquals(11, date.getMonth());
		Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testDecember15ShouldIncrementToDecember16() {
		DateUtil date = new DateUtil(15, 12, 1994);
		System.out.println("testDecember15ShouldIncrementToDecember16 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(16, date.getDay());
		Assert.assertEquals(12, date.getMonth());
		Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testJune15Year1700ShouldIncrementToJune16() {
		DateUtil date = new DateUtil(15, 6, 1700);
		System.out.println("testJune15Year1700ShouldIncrementToJune16 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(16, date.getDay());
		Assert.assertEquals(6, date.getMonth());
		Assert.assertEquals(1700, date.getYear());
	}

	@Test
	public void testJune15Year1701ShouldIncrementToJune16() {
		DateUtil date = new DateUtil(15, 6, 1701);
		System.out.println("testJune15Year1701ShouldIncrementToJune16 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(16, date.getDay());
		Assert.assertEquals(6, date.getMonth());
		Assert.assertEquals(1701, date.getYear());
	}

	@Test
	public void testJune15Year2023ShouldIncrementToJune16() {
		DateUtil date = new DateUtil(15, 6, 2023);
		System.out.println("testJune15Year2023ShouldIncrementToJune16 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(16, date.getDay());
		Assert.assertEquals(6, date.getMonth());
		Assert.assertEquals(2023, date.getYear());
	}

	@Test
	public void testJune15Year2024ShouldIncrementToJune16() {
		DateUtil date = new DateUtil(15, 6, 2024);
		System.out.println("testJune15Year2024ShouldIncrementToJune16 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(16, date.getDay());
		Assert.assertEquals(6, date.getMonth());
		Assert.assertEquals(2024, date.getYear());
	}
	
	/*
	 * Previous-date boundary value tests.
	 */
	
	@Test
	public void testJune1ShouldDecrementToMay31() {
		DateUtil date = new DateUtil(1, 6, 1994);
		System.out.println("testJune1ShouldDecrementToMay31 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(31, date.getDay());
		Assert.assertEquals(5, date.getMonth());
		Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testJune2ShouldDecrementToJune1() {
		DateUtil date = new DateUtil(2, 6, 1994);
		System.out.println("testJune2ShouldDecrementToJune1 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(1, date.getDay());
		Assert.assertEquals(6, date.getMonth());
		Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testJune15ShouldDecrementToJune14() {
		DateUtil date = new DateUtil(15, 6, 1994);
		System.out.println("testJune15ShouldDecrementToJune14 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(14, date.getDay());
		Assert.assertEquals(6, date.getMonth());
		Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testJune30ShouldDecrementToJune29() {
		DateUtil date = new DateUtil(30, 6, 1994);
		System.out.println("testJune30ShouldDecrementToJune29 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(29, date.getDay());
		Assert.assertEquals(6, date.getMonth());
		Assert.assertEquals(1994, date.getYear());
	}
	
	@Test(expected = RuntimeException.class)
	public void testInvalidJune31ShouldThrowException() {
		new DateUtil(31, 6, 1994);
	}
	
	@Test
	public void testJanuary15ShouldDecrementToJanuary14() {
		DateUtil date = new DateUtil(15, 1, 1994);
		System.out.println("testJanuary15ShouldDecrementToJanuary14 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(14, date.getDay());
		Assert.assertEquals(1, date.getMonth());
		Assert.assertEquals(1994, date.getYear());
	}
	
	@Test
	public void testFebruary15ShouldDecrementToFebruary14() {
		DateUtil date = new DateUtil(15, 2, 1994);
		System.out.println("testFebruary15ShouldDecrementToFebruary14 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(14, date.getDay());
		Assert.assertEquals(2, date.getMonth());
		Assert.assertEquals(1994, date.getYear());
	}
	
	@Test
	public void testNovember15ShouldDecrementToNovember14() {
		DateUtil date = new DateUtil(15, 11, 1994);
		System.out.println("testNovember15ShouldDecrementToNovember14 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(14, date.getDay());
		Assert.assertEquals(11, date.getMonth());
		Assert.assertEquals(1994, date.getYear());
	}
	
	@Test
	public void testDecember15ShouldDecrementToDecember14() {
		DateUtil date = new DateUtil(15, 12, 1994);
		System.out.println("testDecember15ShouldDecrementToDecember14 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(14, date.getDay());
		Assert.assertEquals(12, date.getMonth());
		Assert.assertEquals(1994, date.getYear());
	}
	
	@Test
	public void testJune15Year1700ShouldDecrementToJune14() {
		DateUtil date = new DateUtil(15, 6, 1700);
		System.out.println("testJune15Year1700ShouldDecrementToJune14 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(14, date.getDay());
		Assert.assertEquals(6, date.getMonth());
		Assert.assertEquals(1700, date.getYear());
	}
	
	@Test
	public void testJune15Year1701ShouldDecrementToJune14() {
		DateUtil date = new DateUtil(15, 6, 1701);
		System.out.println("testJune15Year1701ShouldDecrementToJune14 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(14, date.getDay());
		Assert.assertEquals(6, date.getMonth());
		Assert.assertEquals(1701, date.getYear());
	}
	
	@Test
	public void testJune15Year2023ShouldDecrementToJune14() {
		DateUtil date = new DateUtil(15, 6, 2023);
		System.out.println("testJune15Year2023ShouldDecrementToJune14 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(14, date.getDay());
		Assert.assertEquals(6, date.getMonth());
		Assert.assertEquals(2023, date.getYear());
	}
	
	@Test
	public void testJune15Year2024ShouldDecrementToJune14() {
		DateUtil date = new DateUtil(15, 6, 2024);
		System.out.println("testJune15Year2024ShouldDecrementToJune14 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(14, date.getDay());
		Assert.assertEquals(6, date.getMonth());
		Assert.assertEquals(2024, date.getYear());
	}
	
	/*
	 * Extra leap-year February tests.
	 */
	
	@Test
	public void testLeapYearFebruary28ShouldIncrementToFebruary29() {
		DateUtil date = new DateUtil(28, 2, 2024);
		System.out.println("testLeapYearFebruary28ShouldIncrementToFebruary29 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(29, date.getDay());
		Assert.assertEquals(2, date.getMonth());
		Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void testLeapYearFebruary29ShouldIncrementToMarch1() {
		DateUtil date = new DateUtil(29, 2, 2024);
		System.out.println("testLeapYearFebruary29ShouldIncrementToMarch1 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(1, date.getDay());
		Assert.assertEquals(3, date.getMonth());
		Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void testLeapYearFebruary29ShouldDecrementToFebruary28() {
		DateUtil date = new DateUtil(29, 2, 2024);
		System.out.println("testLeapYearFebruary29ShouldDecrementToFebruary28 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(28, date.getDay());
		Assert.assertEquals(2, date.getMonth());
		Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void testLeapYearMarch1ShouldDecrementToFebruary29() {
		DateUtil date = new DateUtil(1, 3, 2024);
		System.out.println("testLeapYearMarch1ShouldDecrementToFebruary29 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(29, date.getDay());
		Assert.assertEquals(2, date.getMonth());
		Assert.assertEquals(2024, date.getYear());
	}
}