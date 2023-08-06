package pack1;

public class CareerExpert {

	private String advice;

	public void setAdvice(String qualification) {
		String qualification1 = qualification;
		if (qualification1.equalsIgnoreCase("BE")) {
			this.advice = "Do CDAC";
		} else if (qualification1.equalsIgnoreCase("MBBS")) {
			this.advice = "Do Mastery in Surgical";
		}
	}

	public String getAdvice() {
		return this.advice;
	}
}
