package q614;

public class School {
	private String school;
	private int grade;
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void print() {
		System.out.println(grade + " grade in " + school + " school");
	}
}
