// STUDENT NUMBER: 2014222
// STUDENT NAME: GEOMAR RENE MUNOZ QUINTERO
// SUBJECT: Computer Programming 2

// MAIN ASSIGNMENT SEMESTER 2

// MODULE TITLE: COMPUTER PROGRAMMING 2
// ASSIGNMENT TYPE: INDIVIDUAL
// PROJECT TITLE: MAIN ASSIGNMENT SEMESTER 2
// ASSIGNMENT COMPILER: CAROLE MC GLOUGHLIN - carole@cct.ie
// WEIGHTING: 20 Marks (OUT OF 100 MARKS)
// DUE DATE:  12/11/2015 – 11:55PM
// METHOD OF SUBMISSION: MOODLE

/////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////

//THIS IS THE STARTING OF OBJECT METHOD 
public class ObjectMethod {

	//THIS IS THE PRIVATE ATRIBUTE OF THE STUDENT NUMBER
	private int nUMBER_STUDENT;

	//THIS IS THE PRIVATE ATRIBUTE OF THE STUDENT LAST NAME
	private String lASTNAME_STUDENT;

	//THIS IS THE PRIVATE ATRIBUTE OF THE STUDENT NAME
	private String nAME_STUDENT;

	//THIS IS THE PRIVATE ATRIBUTE OF THE STUDENT EMAIL ADDRESS
	private String eMAIL_STUDENT;

	//THIS IS THE PRIVATE ATRIBUTE OF THE STUDENT MOBILE PHONE
	private int mOBILE_PHONE_STUDENT;



/////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////

	// THIS ARE THE SETTERS -WRITING INFORMATION TO THE STUDENT DATA BASE-

	//THIS IS THE STARTING OF THE SET METHOD TO WRITE THE INFORMATION ABOUT THE STUDENT NUMBER
	public void set_STUDENT_NUMBER_LIST (int first){

		// THE PROGRAM HAS TO SET STUDENT NUMBER
		this.nUMBER_STUDENT = first;

	}//THIS IS THE END OF THE SET METHOD TO WRITE STUDENT NUMBER



/////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////

	//THIS IS THE STARTING OF THE SET METHOD TO WRITET THE INFORMATION ABOUT THE STUDENT LAST NAME
	public void set_STUDENT_LASTNAME_LIST (String second){

		// THE PROGRAM HAS TO SET STUDENT LAST NAME
		this.lASTNAME_STUDENT = second;

	}//THIS IS THE END OF THE SET METHOD TO WRITE STUDENT LAST NAME


/////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////

	//THIS IS THE STARTING OF THE SET METHOD TO WRITE THE INFORMATION ABOUT THE STUDENT NAME
	public void set_STUDENT_NAME_LIST (String third){

		// THE PROGRAM HAS TO SET STUDENT NAME
		this.nAME_STUDENT = third;

	}//THIS IS THE END OF THE SET METHOD TO WRITE STUDENT NAME


/////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////

	//THIS IS THE STARTING OF THE SET METHOD TO WRITE THE INFORMATION ABOUT THE STUDENT EMAIL ADDRESS
	public void set_STUDENT_EMAIL_LIST (String fourth){

		// THE PROGRAM HAS TO SET STUDENT EMAIL ADDRESS
		this.eMAIL_STUDENT = fourth;

	}//THIS IS THE END OF THE SET METHOD TO WRITE STUDENT EMAIL ADDRESS


/////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////

	//THIS IS THE STARTING OF THE SET METHOD TO WRITE THE INFORMATION ABOUT THE STUDENT EMAIL ADDRESS
	public void set_STUDENT_MOBILE_PHONE_LIST  (int fifth){

		// THE PROGRAM HAS TO SET STUDENT MOBILE PHONE
		this.mOBILE_PHONE_STUDENT = fifth;

	}//THIS IS THE END OF THE SET METHOD TO WRITE STUDENT MOBILE PHONE


/////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////

	// THIS ARE THE GETTERS

	//THIS IS THE STARTING OF THE GET METHOD TO GET THE INFORMATION ABOUT THE STUDENT NUMBER
	public int getSTUDENT_NUMBER(){

		// THE PROGRAM HAS TO RETURN AS STUDENT NUMBER
		return this.nUMBER_STUDENT;

	}//THIS IS THE END OF THE GET METHOD TO GET STUDENT NUMBER



/////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////

	//THIS IS THE STARTING OF THE GET METHOD TO GET THE INFORMATION ABOUT THE STUDENT LAST NAME
	public String getSTUDENT_LASTNAME(){

		// THE PROGRAM HAS TO RETURN AS STUDENT LAST NAME
		return this.lASTNAME_STUDENT;

	}//THIS IS THE END OF THE GET METHOD TO GET STUDENT LAST NAME



/////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////

	//THIS IS THE STARTING OF THE GET METHOD TO GET THE INFORMATION ABOUT THE STUDENT NAME
	public String getSTUDENT_NAME(){

		// THE PROGRAM HAS TO RETURN AS STUDENT NAME
		return this.nAME_STUDENT;

	}//THIS IS THE END OF THE GET METHOD TO GET STUDENT LAST NAME



/////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////

	//THIS IS THE STARTING OF THE GET METHOD TO GET THE INFORMATION ABOUT THE STUDENT EMAIL ADDRESS
	public String getSTUDENT_EMAIL_ADDRESS() {

		// THE PROGRAM HAS TO RETURN AS STUDENT EMAIL ADDRESS
		return this.eMAIL_STUDENT;

	}//THIS IS THE END OF THE GET METHOD TO GET STUDENT EMAIL ADDRESS



/////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////

	//THIS IS THE STARTING OF THE GET METHOD TO GET THE INFORMATION ABOUT THE STUDENT MOBILE PHONE
	public int getSTUDENT_MOBILE_PHONE(){

		// THE PROGRAM HAS TO RETURN AS STUDENT MOBILE PHONE
		return this.mOBILE_PHONE_STUDENT;

	}//THIS IS THE END OF THE GET METHOD TO GET STUDENT MOBILE PHONE

}//THIS IS THE END OF OBJECT METHOD 