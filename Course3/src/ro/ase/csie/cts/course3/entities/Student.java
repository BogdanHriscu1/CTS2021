package ro.ase.csie.cts.course3.entities;

public class Student {

	boolean hasScholarship; //has or is in order to respond yes = true, or no = false
	boolean isEnrolled;
	int age;
	int enrollmentYear;
	float typingFrequency;
	
	void payTax() {} 		//depends on accounting 
	void takeOOPExam() {}  	//depends on the professor
	void saveToDB() {}  	//depends on the DB admin
	
	
	void incrementAge() {
//		if(this.age < 20)
//			this.age += 1;
//		else {
//			this.age += 2;
//		}
		
		this.age = (this.age < 20) ? (this.age +=1) : (this.age += 2); // use if in a line
	}
	
	
	String getInfo() {
		
//		if(this.hasScholarship == false)
//		{
//			
//		} 
//		instead of this use:
		if(!this.hasScholarship) {
			
		}
		
//		if(this.hasScholarship == true) { 
		if(this.hasScholarship) {   //without true
			return "Student has a scholarship!";
		}
		else {
			return "No scholarship!";
		}
	}
	
	
	public int aSimpleFunction() {
		return 10;
	}
}
