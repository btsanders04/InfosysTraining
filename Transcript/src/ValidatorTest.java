import static org.junit.Assert.*;

import org.junit.Test;


public class ValidatorTest {

	Transcript t = new Transcript();
	
	@Test
	public void testCheckCourse() {
		assertTrue(Validator.checkCourse("java 101"));
		assertFalse(Validator.checkCourse("java101"));
		assertFalse(Validator.checkCourse("java asdf"));
	}
	@Test
	public void testCheckCredits() {
		assertTrue(Validator.checkCredits("3"));
		assertTrue(Validator.checkCredits("3"));
		assertFalse(Validator.checkCredits("3    4"));
		assertFalse(Validator.checkCredits("10"));
		assertFalse(Validator.checkCredits("asdf"));
		
	}
	@Test
	public void testCheckGrade() {
		assertTrue(Validator.checkGrade("F"));
		assertFalse(Validator.checkGrade("F A"));
		assertTrue(Validator.checkGrade("F"));
		assertFalse(Validator.checkGrade("E"));
		assertFalse(Validator.checkGrade("FA"));
	}
	@Test
	public void testTranscript(){
		t.addCourse("java 300", "A", 3);
		t.addCourse("jsps 101", "B", 4);
		System.out.println(t);
	}
	
	@Test
	public void testGetOverallGPA(){
		t.addCourse("java 300", "A", 3);
		t.addCourse("jsps 101", "B", 4);
		assertEquals(t.getOverallGPA(),3.50,.001);
		assertNotEquals(t.getOverallGPA(),3,.001);
	}

}
