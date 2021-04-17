import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class CalculatorTest {
	private static final double Delta = 1e-10;
	@Test
	public void twoAndThreeIsFive() throws Exception {
		final double result = new Calculator().addition(2, 3);
		assertEquals(result, 5,Delta);
	}
	@Test
	public void twoAndZeroIsTwo() throws Exception {
		final double result = new Calculator().addition(2, 0);
		assertEquals(result, 2, Delta);
	}
	@Test
	public void twoAndMinusTwoIsZero() throws Exception {
		final double result = new Calculator().addition(2, -2);
		assertEquals(result, 0, Delta);
	}
	@Test
	public void threeMinusTwoIsOne() throws Exception {
		final double result = new Calculator().subtraction(3, 2);
		assertEquals(result, 1, Delta);
	}
	@Test
	public void threeMinusThreeIsZero() throws Exception {
		final double result = new Calculator().subtraction(3, 3);
		assertEquals(result, 0, Delta);
	}
	@Test
	public void threeMinusMinusThreeIsSix() throws Exception {
		final double result = new Calculator().subtraction(3, -3);
		assertEquals(result, 6, Delta);
	}
	@Test
	public void threeXThreeIsNine() throws Exception {
		final double result = new Calculator().multiply(3, 3);
		assertEquals(result, 9, Delta);
	}
	@Test
	public void threeXZeroIsZero() throws Exception {
		final double result = new Calculator().multiply(3, 0);
		assertEquals(result, 0, Delta);
	}
	@Test
	public void threeXMinusThreeIsMinusNine() throws Exception {
		final double result = new Calculator().multiply(3, -3);
		assertEquals(result, -9, Delta);
	}
	public void dividing2by2is1(){
		final double result = new Calculator().division(2,2);
		assertEquals(result,1, Delta);
	}

	@Test
	public void dividing4by2is2(){
		final double result = new Calculator().division(4,2);
		assertEquals(result, 2, Delta);
	}
	@Test
	public void twoAndThreeIsnotFive() throws Exception {
		final double result = new Calculator().addition(2, 3);
		assertNotEquals(6,result,Delta);
	}
	@Test
	public void twoAndZeroIsnotTwo() throws Exception {
		final double result = new Calculator().addition(2, 0);
		assertNotEquals(0, result, Delta);
	}
	@Test
	public void twoAndMinusTwoIsnotZero() throws Exception {
		final double result = new Calculator().addition(2, -2);
		assertNotEquals(4, result, Delta);
	}
	@Test
	public void threeMinusTwoIsnotOne() throws Exception {
		final double result = new Calculator().subtraction(3, 2);
		assertNotEquals(0, result, Delta);
	}
	@Test
	public void threeMinusThreeIsnotZero() throws Exception {
		final double result = new Calculator().subtraction(3, 3);
		assertNotEquals(1,result, Delta);
	}
	@Test
	public void threeMinusMinusThreeIsnotSix() throws Exception {
		final double result = new Calculator().subtraction(3, -3);
		assertNotEquals(-6,result, Delta);
	}
	@Test
	public void threeXThreeIsnotNine() throws Exception {
		final double result = new Calculator().multiply(3, 3);
		assertNotEquals(6,result, Delta);
	}
	@Test
	public void threeXZeroIsnotZero() throws Exception {
		final double result = new Calculator().multiply(3, 0);
		assertNotEquals(1, result, Delta);
	}
	@Test
	public void threeXMinusThreeIsnotMinusNine() throws Exception {
		final double result = new Calculator().multiply(3, -3);
		assertNotEquals(-6, result, Delta);
	}
	public void dividing2by2isnot1() throws Exception{
		final double result = new Calculator().division(2,2);
		assertNotEquals(2,result, Delta);
	}

	@Test
	public void dividing4by2isnot2() throws Exception{
		final double result = new Calculator().division(4,2);
		assertNotEquals(1, result, Delta);
	}

}
