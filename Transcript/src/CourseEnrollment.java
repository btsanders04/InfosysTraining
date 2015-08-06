
public class CourseEnrollment {

	private String code, grade;
	private int credits;
	private double points;
	public CourseEnrollment(String code, String grade, int credits){
		this.code=code;
		this.grade=grade;
		this.credits=credits;
		courseGPA();
	}

	private void courseGPA(){
		switch(grade){
		case("A"): points=4.0;
		break;
		case("B"): points=3.0;
		break;
		case("C"): points=2.0;
		break;
		case("D"): points=1.0;
		default: points=0.0;
		}
	}
	
	public double getPoints(){
		return points;
	}
	
	@Override
	public String toString() {
		
		return String.format("%-20s%-10s%-10s%s",code, credits, grade, points);
	}
	
	
}
