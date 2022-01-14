package com.tpexp.A_Master_Example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TriangleTest {

	ATriangle triangle1 = new ATriangle();
	/*@Test
	public void test1() {
			assertEquals("Echecs, ce triangle n'est pas Equilatéral",
					"Equilateral", triangle1.TriangleType(5, 5, 4)
				    );
		}
*/

	
	/*@Test
	public void Test2() {assertEquals("Scalene", triangle1.TriangleType(5, 5, 4)
					);
	}*/

	@Test
	public void Test3() {
			assertEquals("Equilateral", triangle1.TriangleType(7, 7, 7)
					);
	} 
//test junit
	@Test
	public void Test5() {
		assertEquals("Scalene", triangle1.TriangleType(5, 7,4 )
				);
	 }



 
}
