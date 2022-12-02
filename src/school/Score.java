package school;

public class Score {
	private int studentId;
	private Subject subject;
	private int point;
	
	public Score(int studentId, Subject subject, int point) {
		this.studentId = studentId;
		this.subject = subject;
		this.point = point;
	}
	//Score객체가 가진 학번, 과목, 점수 정보를 리턴해준다.
	@Override
	public String toString() {
		return "학번:" + this.studentId + "," + subject.getSubjectName() + ":" + point;
	}	
	
}
