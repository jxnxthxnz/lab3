import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test 
  public void testReverseBig() {
    int[] input = {1, 2, 3, 4};
    assertArrayEquals(new int[] {4, 3, 2, 1}, ArrayExamples.reversed(input));
  }

  @Test
  public void testReversePlace() {
    int[] input = {1, 2, 3};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[] {3, 2, 1}, input);
  }

  @Test
  public void mean() {
    double[] input = {1.0, 1.0, 2.0, 2.0};
    assertEquals(2.0, ArrayExamples.averageWithoutLowest(input), 0);
  
  }

  @Test
  public void meanSmall() {
    double[] input = {1.0};
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input), 0);
  
  }
}
