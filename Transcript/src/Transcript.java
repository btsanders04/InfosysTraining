import java.util.*;
public class Transcript {

	private ArrayList<CourseEnrollment> courses = new ArrayList<CourseEnrollment>();
	private double overallGPA;
	public Transcript(){}
	
	
	public void addCourse(String code, String grade, int credits){
		CourseEnrollment course = new CourseEnrollment(code,grade,credits);
		courses.add(course);
		overallGPA+=course.getPoints();
	}
	
	
	
	public ArrayList getCourses(){
		return courses;
	}
	
	public  double getOverallGPA(){
		return overallGPA/courses.size();
	}
	private String getFormattedGPA(){
		return String.format("%40s%1.2f","GPA: ",getOverallGPA());
	}


	@Override
	public String toString() {
		String s = String.format("%-20s%-10s%-10s%s", "Course","Credits","Grade","Quality Points") + "\n\n";
		s+= String.format("%-20s%-10s%-10s%s", "------","-------","-----","--------------") + "\n\n";
		for(CourseEnrollment course : courses){
			s+= course + "\n";
		}
		s+=getFormattedGPA();
		return s;
	}
	
	
	
}
