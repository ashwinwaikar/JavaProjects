package mypack1;

public class StudentBO // business layer loosely coupled with a specific persistence mechanism
{
	public StudentBO(StudentDAO studentdao) {
		this.studentdao=studentdao;
	}

	StudentDAO studentdao;

	public void add(Student stu) {
		studentdao.addStudent(stu);
	}

	public Student get() {
		return studentdao.getStudent();
	}
}
