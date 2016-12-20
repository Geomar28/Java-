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

// IMPORTING THE SCANNER LIBRARY
import java.util.Scanner;

// IMPORTING LIBRARIES
import java.util.NoSuchElementException;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.BufferedReader;


// IMPORTING THE SCANNER LIBRARY
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;


// IMPORTING THE ARRAYLIST LIBRARY
import java.util.ArrayList;

// IMPORTING THE FILEREADER LIBRARY
import java.io.FileReader;

// THIS IS THE STARTING OF THE GEOMAIN CLASS
public class GeoMain {

	// THIS IS THE STATIC ARRAYLIST IS GOING TO USE THE INFORMATION WRITEEN IN THE OBJECTMETHOD CLASS
	static ArrayList<ObjectMethod> dATA_LIST = new ArrayList<ObjectMethod>();

	// THIS IS THE STATIC BUFFEREDREADER TO GET INPUT OR DATA FROM THE USER
	static BufferedReader uSER_INPUT = new BufferedReader(new InputStreamReader(System.in));

	// THIS IS THE STATIC BOOLEAN VARIABLE TO DEFINE PROBLEMS FOUNDS
	static	boolean nOT_FOUND = false;

	// THIS IS THE STATIC INTEGER TO GET INPUT OR DATA OPTIONS FROM THE USER
	static int uSER_OPTION = 0;

	// THIS IS THE STATIC INTEGER TO GET INPUT OR DATA OPTIONS FROM THE USER
	static 	int nUMBER_OF_TIMES = 0;

	// THIS IS THE STATIC STRING TO CREATE THE EXACT LOCATION OF THE .TXT FILE OR STUDENT DATA BASES.
	static String sTUDENT_DATA_BASE = "Student.txt";

	// THIS IS THE STATIC FILE FOR READING THE .TXT FILE OR STUDENT DATA BASES
	static File sTUDENT_FILE = new File (sTUDENT_DATA_BASE);
	
	// THIS IS THE STARTING OF THE MAIN METHOD
	public static void main(String[] args) {

		// THIS IS FOR IMPORTING THE STUDENT FILE TO THE PROGRAM
		iMPORT_sTUDENT_DATA_BASE();
		
		// THIS IS FOR SHOWING TO THE SCREEN THE MENU
		iNFO_REQUEST_MENU();

	}// THIS IS THE END OF THE MAIN METHOD



//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	// THIS IS THE STARTING OF IMPORTING THE STUDENT FILE DATA BASE (.TXT) METHOD
	public static void iMPORT_sTUDENT_DATA_BASE(){

		// THIS IS THE FILE READER FOR READING FROM THE STUDENT FILE DATA BASE
		FileReader tEXT_READER = null;

		// THIS IS THE ARRAY STRING FOR STORING THE DATA
		String [] sTORING_DATA;

		// THIS IS THE STARTING OF THE TRY
		try {

			// THIS IS THE FOR CREATING A NEW FILES READER
			tEXT_READER = new FileReader(sTUDENT_FILE);

		}// THIS IS THE END OF TRY


		// THIS IS THE STARTING OF THE CATCH TO GET ERROR FROM THE STUDENT FILE DATA BASE
		catch (FileNotFoundException geomar_ERROR){

			// THE PROGRAM HAS TO PRINT TO THE SCREEN IF THE IS ANY ERROR FROM THE STUDENT FILE DATA BASE
			System.out.println();
			System.out.println("||||||||||||||||||||||||||||||||||||||||||");
			System.out.println("THERE IS AN ERROR\nI'M SORRY BUT I CAN NOT FIND THE FILE");
			System.out.println("||||||||||||||||||||||||||||||||||||||||||");
			System.out.println();

		}// THIS IS THE END OF THE CATCH


		// THIS IS THE BUFFEREDREADER FOR GETTING DATA FROM THE USER
		BufferedReader uSER_INPUT_2 = new BufferedReader (tEXT_READER);

		// THIS IS THE THE STRING VARIABLE FOR STORING DATA FROM THE USER
		String sTORING_VARIABLE = " ";

		// THIS IS THE STARTING OF THE TRY
		try {

			// THIS IS FOR STORING DATA FROM THE USER INTO A VARIABLE
			sTORING_VARIABLE = uSER_INPUT_2.readLine();

			// THIS IS THE STARTING OF THE WHILE LOOP FOR READING THE STUDENT FILE DATA BASE
			while (sTORING_VARIABLE != null){

				// THIS IS THE SLIPT METHOD FOR SEPARATE DATA INSIDE THE FILE USING SEMICOLON (;)
				sTORING_DATA = sTORING_VARIABLE.split(";");

				// THIS IS FOR CREATING A NEW OBJECT FROM THE OBJECTMETHOD CLASS TO WRITE INSIDE THE THE STUDENT FILE DATA BASE
				ObjectMethod sTART_WRITING = new ObjectMethod();

				// THIS IS FOR SETTING THE STUDENT NUMBER INSIDE THE STUDENT FILE DATA BASE
				sTART_WRITING.set_STUDENT_NUMBER_LIST(Integer.parseInt(sTORING_DATA[0]));

				// THIS IS FOR SETTING THE STUDENT LAST NAME INSIDE THE STUDENT FILE DATA BASE
				sTART_WRITING.set_STUDENT_LASTNAME_LIST(sTORING_DATA[1]);

				// THIS IS FOR SETTING THE STUDENT NAME INSIDE THE STUDENT FILE DATA BASE
				sTART_WRITING.set_STUDENT_NAME_LIST(sTORING_DATA[2]);

				// THIS IS FOR SETTING THE STUDENT EMAIL INSIDE THE STUDENT FILE DATA BASE
				sTART_WRITING.set_STUDENT_EMAIL_LIST (sTORING_DATA[3]);

				// THIS IS FOR SETTING THE STUDENT MOBILE PHONE INSIDE THE STUDENT FILE DATA BASE
				sTART_WRITING.set_STUDENT_MOBILE_PHONE_LIST (Integer.parseInt(sTORING_DATA[4]));

				// THIS IS FOR ADDING DATA INSIDE THE STUDENT FILE DATA BASE
				dATA_LIST.add(sTART_WRITING);

				// THIS IS FOR STORING THE USER DATA INTO A VARIABLE
				sTORING_VARIABLE = uSER_INPUT_2.readLine();

			}// THIS IS THE END OF THE WHILE LOOP

		}// THIS IS THE END OF TRY

		// THIS IS THE STARTING OF THE CATCH TO GET ERROR FROM THE USER INPUT
		catch (IOException geomar_ERROR){

			// THE PROGRAM HAS TO PRINT TO THE SCREEN IF THE IS ANY ERROR
			System.out.println();
			System.out.println("||||||||||||||||||||||||||||||||||||||||||");
			System.out.println("THERE IS AN ERROR\nI'M SORRY BUT I CAN NOT READ THE FILE");
			System.out.println("||||||||||||||||||||||||||||||||||||||||||");
			System.out.println();

		}// THIS IS THE OF THE CATCH

		// THIS IS THE STARTING OF THE TRY
		try {

			// THIS IS THE FOR CLOSING THE BUFFERED READER TO PREVENT LOSSING DATA
			uSER_INPUT_2.close();

		}// THIS IS THE END OF THE TRY

		// THIS IS THE STARTING OF THE CATCH TO GET ERROR FROM THE USER INPUT
		catch(IOException geomar_ERROR){

			// THE PROGRAM HAS TO PRINT TO THE SCREEN IF THE IS ANY ERROR
			System.out.println();
			System.out.println("||||||||||||||||||||||||||||||||||||||||||");
			System.out.println("THERE IS AN ERROR\nI'M SORRY BUT I CAN NOT CLOSE THE REQUEST");
			System.out.println("||||||||||||||||||||||||||||||||||||||||||");
			System.out.println();
		
		}// THIS IS THE END OF THE CATCH

	}// THIS IS THE END OF IMPORTING THE STUDENT FILE DATA BASE (.TXT) METHOD



//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	// THIS IS THE STARTING OF THE INFO REQUEST MENU METHOD
	public static void iNFO_REQUEST_MENU(){		

			
			// THIS IS THE SCANNER TO GET DATA FROM THE USER TO KEEP GOING THE THROUGH THE PROGRAM
			Scanner iNFO_REQUEST = new Scanner (System.in);

			// THIS IS THE STRING VARIABLE TO GET DATA FROM THE USER TO KEEP GOING THE THROUGH THE PROGRAM
			String eNTER_CONTINUE_1;

			// THE PROGRAM HAS TO PRINT THE WELCOME REGARD TO THE USER
			System.out.println("|||||||||||||||||||||||||||||||||||||||||||||");
			System.out.println("|------WELCOME TO THE STUDENT INFOMATION----|");
			System.out.println("|||||||||||||||||||||||||||||||||||||||||||||");
			System.out.println();
			System.out.println("-PRESS ENTER TO CONTINUE-");
			
			// THIS IS THE STRING METHOD TO GET DATA FROM THE USER TO KEEP GOING THE THROUGH THE PROGRAMT
			eNTER_CONTINUE_1 = iNFO_REQUEST.nextLine();


		// THIS IS THE STARTING OF THE DO WHILE LOOP FOR PRINTING TO THE SCREEN INFO REQUEST MENU
		do {

			// THE PROGRAM HAS TO PRINT TO THE SCREEN THE INFO REQUEST MENU
			System.out.println();
			System.out.println("||||||||||||||||||||||||||||||||||||||||||||||");
			System.out.println("|--------------INFO REQUEST MENU-------------|");
			System.out.println("||||||||||||||||||||||||||||||||||||||||||||||");
			System.out.println();

			System.out.println();
			System.out.println("----YOU CAN PICK ONE CHOICE, THEN PRESS ENTER----");
			System.out.println();

			// THIS IS THE STRING ARRAY TO STORE THE INFO REQUEST MENU OPTIONS
			String [] oPTION_MENU = {"---------------------------------------------|", "1 – ADD NEW STUDENT", "---------------------------------------------|", "2 – LOOKING FOR A STUDENT", "---------------------------------------------|", "3 – SHOWING STUDENT DETAILS", "---------------------------------------------|", "4 – CHANGE STUDENT DETAILS", "---------------------------------------------|", "5 - ERASE A ESTUDENT", "---------------------------------------------|", "6 – SHOWING THE TOTAL NUMBER OS STUDENTS", "---------------------------------------------|", "7 - SHOWING THE INFOMATION OF ALL STUDENTS", "---------------------------------------------|"};
			
			// THIS IS THE STARTING OF THE FOR LOOP FOR THE DEVELOPMENT OF THE STRING ARRAY
			for (int counterText = 0; counterText < oPTION_MENU.length; counterText++){

					// THE PROGRAM HAS TO PRINT TO THE SCREEEN THE STRING ARRAY
					System.out.println (oPTION_MENU[counterText]);
			
				}// THIS IS THE END FOR THE FOR LOOP
				
			// THE PROGRAM HAS TO PRINT TO THE SCREEEN THE EXIT OPTION
			System.out.println();
			System.out.println("---------|");
			System.out.println("0 – EXIT");
			System.out.println("---------|");
			System.out.println();


			// THIS IS THE STARTING OF THE TRY
			try {

				// THIS IS THE CREATION OF THE VARIABLE. PARSING THE DATA USER TO AN INTEGER
				uSER_OPTION = Integer.parseInt(uSER_INPUT.readLine());
			
			}// THIS IS THE END OF THE TRY

		
			// THIS IS THE STARTING OF THE CATCH TO GET ERROR FROM THE USER INPUT (TEXT)
			catch (IOException geomar_ERROR){

			System.out.println();
			System.out.println("||||||||||||||||||||||||||||||||||||||||||");
			System.out.println("THERE IS AN ERROR\nI'M SORRY BUT YOU MADE A MISTAKE");
			System.out.println("||||||||||||||||||||||||||||||||||||||||||");
			System.out.println();

			}// THIS IS THE END OF THE CATCH TO GET ERROR FROM THE USER INPUT


			// THIS IS THE STARTING OF THE CATCH TO GET ERROR FROM THE USER INPUT (NUMBERS)
			catch(NumberFormatException geomar_ERROR){

				uSER_OPTION = 9;
			}


			// THIS IS THE STARTING OF THE SWITCH TO GET THE CHOICES FROM THE USER
			switch (uSER_OPTION){

				case 1:

				// THE PROGRAM HAS TO PRINT TO THE SCREEN THE FOLLOWING
				System.out.println();
				System.out.println("YOUR CHOICE WAS NUMBER 1 – ADD NEW STUDENT");
				System.out.println();
				System.out.println("PLEASE, YOU HAVE TO FILL THE FOLLOWING...");

				// IN THIS CASE THE PROGRAM HAS TO USE THE ADD NEW STUDENT METHOD AND ADD THE DATA TO THE STUDENTE DATA BASE
				aDD_NEW_STUDENT();
				break;

				case 2:

				// THE PROGRAM HAS TO PRINT TO THE SCREEN THE FOLLOWING
				System.out.println();
				System.out.println("YOUR CHOICE WAS NUMBER 2 – LOOKING FOR A STUDENT");
				System.out.println();
				System.out.println("FOR LOOKING FOR A STUDENT\n");
				System.out.println("YOU HAVE 3 CHOICES:\n");
				System.out.println("1- YOU CAN LOOK FOR STUDENT LASTNAME:\n");
				System.out.println("2- YOU CAN LOOK FOR STUDENT NAME:\n");
				System.out.println("3- YOU CAN LOOK FOR STUDENT NUMBER:\n");
				System.out.println("|");
				System.out.println("|");
				System.out.println();
				System.out.println("0- OR YOU CAN GO BACK TO THE INFO REQUEST MENU:\n");
				System.out.println("--|YOU CAN PICK ONE CHOICE, THEN PRESS ENTER|--\n");


				// IN THIS CASE THE PROGRAM HAS TO USE THE LOOK FOR STUDENT METHOD FOR SHEARCHING A STUDENT
				lOOK_FOR_STUDENT();
				break;


				case 3:

				// THE PROGRAM HAS TO PRINT TO THE SCREEN THE FOLLOWING
				System.out.println();
				System.out.println("YOUR CHOICE WAS NUMBER 3 – SHOW A STUDENT");
				System.out.println();
				System.out.println("FOR SHOWING STUDENT DETAILS\n");
				System.out.println("YOU MUST WRITE THE FULL STUDENT NUMBER:");


				// IN THIS CASE THE PROGRAM HAS TO USE THE SHOW STUDENT DETAILS METHOD AND PRINTING TO THE SCREEN
				sHOW_STUDENT_DETAILS();
				break;


				case 4:

				// THE PROGRAM HAS TO PRINT TO THE SCREEN THE FOLLOWING
				System.out.println();
				System.out.println("YOUR CHOICE WAS NUMBER 4 – CHANGE OR MODIFY STUDENT DETAILS");
				System.out.println();
				System.out.println("FOR CHANGING THE STUDENT DETAILS\n");
				System.out.println("YOU MUST WRITE THE FULL STUDENT NUMBER:");

				// IN THIS CASE THE PROGRAM HAS TO USE THE CHANGE STUDENT DETAILS METHOD TO MODIFY A STUDENT FROM THE STUDENT DATA BASE
				cHANGE_STUDENT_DETAILS();
				break;


				case 5: 

				// THE PROGRAM HAS TO PRINT TO THE SCREEN THE FOLLOWING
				System.out.println();
				System.out.println("YOUR CHOICE WAS NUMBER 5 – ERASE A ESTUDENT");
				System.out.println();
				System.out.println("FOR ERASE A ESTUDENT\n");
				System.out.println("YOU HAVE TO WRITE THE FULL STUDENT NUMBER:");

				// IN THIS CASE THE PROGRAM HAS TO USE THE ERASE THE STUDENT METHOD FROM THE STUDENT DATA BASE
				eRASE_THE_STUDENT();
				break;


				case 6:

				// IN THIS CASE THE PROGRAM HAS TO USE THE TOTAL OF STUDENTS METHOD TO COUNT THE TOTAL AMOUNT OF STUDENTS FROM THE STUDENT DATA BASE
				tOTAL_OF_STUDENTS();
				break;

				case 7:

				// IN THIS CASE THE PROGRAM HAS TO USE THE SHOW THE STUDENT LIST METHOD TO SHOW ALL THE STUDENT FROM THE STUDENT DATA BASE
				sHOW_THE_STUDENT_LIST();
				break;

				case 0:

				// IN THIS CASE THE PROGRAM HAS TO USE THE SAVING THE DATA TO SAVE ALL THE INFORMATION TO THE STUDENT DATA BASE
				sAVING_THE_DATA();

				break;

				default:

				// THE PROGRAM HAS TO PRINT TO THE SCREEN IF THE USER MAKE A WRONG CHOICE
				System.out.println();
				System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||-");
				System.out.println("WRONG CHOICE\nWE BOTH KNOW, THAT IS THE WRONG NUMBER OPTION, AM I RIGHT?...\nCAN YOU PLEASE, TRY AGAIN?");
				System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||-");
				System.out.println();


			
			}// THIS IS THE END OF THE SWITCH

		}while(uSER_OPTION != 0);// THIS IS THE END OF THE WHILE LOOP

	}// THIS IS THE END OF THE INFO REQUEST MENU METHOD



//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// THIS IS THE STARTING OF THE ADD NEW STUDENT METHOD
	public static void aDD_NEW_STUDENT(){

	
		// THIS IS THE STARTING OF THE FIRST TRY
		try {

			// THE PROGRAM HAS TO PRINT TO THE SCREEN AN EMPTY LINE
			System.out.println();

			// THIS IS THE CREATION OF THE STRING ARRAY TO STORE THE DATA FROM THE USER
			String [] sTUDENT_DETAILS = new String [5];

			// THE PROGRAM HAS TO PRINT TO THE SCREEN THE FOLLOWING
			System.out.println("\nSTEP 1: WRITE THE NEW STUDENT NUMBER AND THEN PRESS ENTER TO KEEP GOING");
			System.out.print("\nSTUDENT NUMBER: \n");

			// THE PROGRAM HAS TO STORE THE STUDENT NUMBER INSIDE THE ARRAY
			sTUDENT_DETAILS [0] = uSER_INPUT.readLine();

			
			// THE PROGRAM HAS TO PRINT TO THE SCREEN THE FOLLOWING
			System.out.println("\n\nSTEP 2: WRITE THE NEW STUDENT LASTNAME AND THEN PRESS ENTER TO KEEP GOING");
			System.out.print("\nSTUDENT LASTNAME (START WITH LOWER CASE LETTER): \n");

			// THE PROGRAM HAS TO STORE THE STUDENT LAST NAME INSIDE THE ARRAY
			sTUDENT_DETAILS [1] = uSER_INPUT.readLine();


			// THE PROGRAM HAS TO PRINT TO THE SCREEN THE FOLLOWING
			System.out.println("\n\nSTEP 3: WRITE THE NEW STUDENT NAME AND THEN PRESS ENTER TO KEEP GOING");
			System.out.print("\nSTUDENT NAME (START WITH LOWER CASE LETTER): \n");

			// THE PROGRAM HAS TO STORE THE STUDENT NAME INSIDE THE ARRAY
			sTUDENT_DETAILS [2] = uSER_INPUT.readLine();


			// THE PROGRAM HAS TO PRINT TO THE SCREEN THE FOLLOWING
			System.out.println("\n\nSTEP 4: WRITE THE NEW STUDENT E-MAIL ADDRESS AND THEN PRESS ENTER TO KEEP GOING");
			System.out.print("\nSTUDENT E-MAIL ADDRESS (START WITH LOWER CASE LETTER): \n");

			// THE PROGRAM HAS TO STORE THE STUDENT EMAIL ADDRESS INSIDE THE ARRAY
			sTUDENT_DETAILS [3] = uSER_INPUT.readLine();


			// THE PROGRAM HAS TO PRINT TO THE SCREEN THE FOLLOWING
			System.out.println("\n\nSTEP 5: WRITE THE NEW STUDENT PHONE NUMBER AND THEN PRESS ENTER TO KEEP GOING");
			System.out.print("\nSTUDENT PHONE NUMBER: \n");

			// THE PROGRAM HAS TO STORE THE STUDENT MOBILE PHONE INSIDE THE ARRAY
			sTUDENT_DETAILS [4] = uSER_INPUT.readLine();


			// THE PROGRAM HAS TO PRINT TO THE SCREEN AN EMPTY LINE
			System.out.println();

			// THIS IS FOR CREATING A NEW OBJECT FROM THE OBJECTMETHOD CLASS TO WRITE INSIDE THE THE STUDENT FILE DATA BASE
			ObjectMethod sTART_WRITING = new ObjectMethod();

			// THE PROGRAM HAS TO USE THE SETTERS TO ADD THE DATA TO THE STUDENT DATA BASE
			sTART_WRITING.set_STUDENT_NUMBER_LIST(Integer.parseInt(sTUDENT_DETAILS[0]));
			sTART_WRITING.set_STUDENT_LASTNAME_LIST(sTUDENT_DETAILS[1]);
			sTART_WRITING.set_STUDENT_NAME_LIST(sTUDENT_DETAILS[2]);
			sTART_WRITING.set_STUDENT_EMAIL_LIST (sTUDENT_DETAILS[3]);
			sTART_WRITING.set_STUDENT_MOBILE_PHONE_LIST (Integer.parseInt(sTUDENT_DETAILS[4]));


					// THE PROGRAM HAS TO PRINT TO THE SCREEN THE FOLLOWING: TO ASK TO THE USER TO CONFIRM THE CHANGING
					System.out.println();
					System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||-");
					System.out.println("ARE YOU REALLY SURE ABOUT ADDING THIS NEW STUDENT?");
					System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||-");
					System.out.println();
					System.out.println();
					System.out.println("|||||||||||||||||||||");
					System.out.println("IF YOUR ANSWER IS\nYES\nPRESS NUMBER 1");
					System.out.println("|||||||||||||||||||||");
					System.out.println();
					System.out.println("|||||||||||||||||||||");
					System.out.println("IF YOUR ANSWER IS\nNO\nPRESS NUMBER 2");
					System.out.println("|||||||||||||||||||||");
					System.out.println();
				
				
				// THIS THE DECLARATION OF THE INT VARIABLE
				int aNSWER_1 = 0;

					// THIS THE STARTING OF THE SECOND TRY
					try{

						// THE PROGRAM HAS TO PRINT TO THE SCREEN THE FOLLOWING
						System.out.print("\nAND YOUR ANSWER IS: \n");
						
						// THIS IS THE CREATION OF THE VARIABLE. PARSING THE DATA USER TO AN INTEGER
						aNSWER_1 = Integer.parseInt(uSER_INPUT.readLine());

						// THIS THE STARTING OF THE SWITCH
						switch(aNSWER_1){

							case 1:

							// THE PROGRAM HAS TO PRINT TO THE SCREEN THE FOLLOWING: IF THE CASE THE USER CHOSE YES AS ANSWER
							System.out.println("|||||||||||||||||||||||||||||||||||||||||||||");
							System.out.println("|----WELL DONE!!! THE STUDENT WAS ADDED-----|");
							System.out.println("|||||||||||||||||||||||||||||||||||||||||||||");
							System.out.println();

							// THE PROGRAM HAS TO ADD THE DATA FROM THE USER TO THE STUDENT DATA BASE
							dATA_LIST.add(sTART_WRITING);

							// IN THIS CASE THE PROGRAM HAS TO USE THE SAVE THE DATA METHOD TO SAVE DATA FROM THE USER, TO THE STUDENT DATA BASE
							sAVING_THE_DATA();
							break;

							case 2:

							// THE PROGRAM HAS TO PRINT TO THE SCREEN THE FOLLOWING: IF THE CASE THE USER CHOSE NO AS ANSWER
							System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||");
							System.out.println("|---DON'T WORRY! THE STUDENT WAS NOT ADDED----|");
							System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||");
							System.out.println();

							break;

							default:

							// THE PROGRAM HAS TO PRINT TO THE SCREEN IF THE USER MAKE A WRONG CHOICE
							System.out.println();
							System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
							System.out.println("WRONG CHOICE\nWE BOTH KNOW, THAT IS THE WRONG NUMBER OPTION, AM I RIGHT?...\nCAN YOU PLEASE, TRY AGAIN?");
							System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
							System.out.println();

							break;

						}//THIS IS THE END OF THE SWITCH

					}//THIS IS THE END OF SECOND THE TRY

					//THIS IS THE STARTING OF SECOND CATCH
					catch (IOException geomar_ERROR){

							// THE PROGRAM HAS TO PRINT TO THE SCREEN IF THE USER MAKE A MISTAKE
							System.out.println();
							System.out.println("||||||||||||||||||||||||||||||||||||||||||");
							System.out.println("THERE IS AN ERROR\nI'M SORRY BUT YOU MADE A MISTAKE. TRY AGAIN");
							System.out.println("||||||||||||||||||||||||||||||||||||||||||");
							System.out.println();

					}//THIS IS THE END OF SECOND CATCH
			

		}//THIS IS THE END OF FIRST THE TRY

		//THIS IS THE STARTING OF FIRST CATCH
		catch(IOException geomar_ERROR){

			// THE PROGRAM HAS TO PRINT TO THE SCREEN IF THE USER MAKE A MISTAKE (TEXT)
			System.out.println();
			System.out.println("||||||||||||||||||||||||||||||||||||||||||");
			System.out.println("THERE IS AN ERROR\nI'M SORRY BUT YOU MADE A MISTAKE. TRY AGAIN");
			System.out.println("||||||||||||||||||||||||||||||||||||||||||");
			System.out.println();

		
		}//THIS IS THE END OF FIRST CATCH

		//THIS IS THE STARTING OF FIRST CATCH
		catch (NumberFormatException geomar_ERROR){

			// THE PROGRAM HAS TO PRINT TO THE SCREEN IF THE USER MAKE A MISTAKE (NUMBERS)
			System.out.println();
			System.out.println("||||||||||||||||||||||||||||||||||||||||||");
			System.out.println("THERE IS AN ERROR\nI'M SORRY BUT YOU MADE A MISTAKE. TRY AGAIN");
			System.out.println("||||||||||||||||||||||||||||||||||||||||||");
			System.out.println();

		}//THIS IS THE END OF FIRST CATCH

	}//THIS IS THE END OF THE ADD NEW STUDENT METHOD



//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	//THIS IS THE STARTING OF THE SAVING THE DATA METHOD
	public static void sAVING_THE_DATA() {

		// THIS IS THE DECLARATION OF THE FILE WRITER TO WRITE INSIDE THE STUDENT DATA BASE
		FileWriter wRITING_DATA = null;

		// THIS THE STARTING OF THE TRY
		try {

			// THIS IS THE CREATION OF THE FILE READER
			wRITING_DATA = new FileWriter(sTUDENT_FILE);

		}// THIS THE END OF THE TRY

		// THIS THE STARTING OF THE CATCH
		catch (IOException geomar_ERROR){

			// THE PROGRAM HAS TO PRINT TO THE SCREEN IF THERE ANY ERROR
			System.out.println();
			System.out.println("||||||||||||||||||||||||||||||||||||||||||");
			System.out.println("THERE IS AN ERROR\nI'M SORRY BUT I CAN NOT CREATE THE FILE");
			System.out.println("||||||||||||||||||||||||||||||||||||||||||");
			System.out.println();

		}// THIS THE END OF THE CATCH

		// THIS IS THE CREATION OF THE BUFFERED WRITER
		BufferedWriter sAVING = new BufferedWriter(wRITING_DATA);

		// THIS THE STARTING OF THE TRY
		try {

			// THIS IS THE STARTING OF THE FOR LOOP FOR THE DEVELOPMENT OF SAVING THE DATA INSIDE THE STUDENT DATA BASE
			for (int vARIABLE_1 = 0; vARIABLE_1 < dATA_LIST.size(); vARIABLE_1 ++){

				// THIS IS THE SAVING INFORMATION FROM THE USER INPUT INSIDE THE STUDENT DATA BASE
				sAVING.write(dATA_LIST.get(vARIABLE_1).getSTUDENT_NUMBER() + ";");
				sAVING.write(dATA_LIST.get(vARIABLE_1).getSTUDENT_LASTNAME() + ";");
				sAVING.write(dATA_LIST.get(vARIABLE_1).getSTUDENT_NAME() + ";");
				sAVING.write(dATA_LIST.get(vARIABLE_1).getSTUDENT_EMAIL_ADDRESS() + ";");
				sAVING.write(dATA_LIST.get(vARIABLE_1).getSTUDENT_MOBILE_PHONE() + ";");

				// THIS IS THE WRITING PROPERTY WITH THE LINE SEPARATOR
				sAVING.write(System.getProperty("line.separator"));

			}// THIS IS THE END OF THE FOR LOOP

		}// THIS THE END OF THE TRY

		// THIS THE STARTING OF THE CATCH
		catch( IOException geomar_ERROR ){

			// THE PROGRAM HAS TO PRINT TO THE SCREEN IF THERE ANY ERROR
			System.out.println();
			System.out.println("||||||||||||||||||||||||||||||||||||||||||");
			System.out.println("THERE IS AN ERROR\nI'M SORRY BUT I CAN NOT WRITE THE FILE");
			System.out.println("||||||||||||||||||||||||||||||||||||||||||");
			System.out.println();

		}// THIS THE END OF THE CATCH
		
		// THIS THE STARTING OF THE TRY
		try {

			// THIS IS THE FOR CLOSING THE BUFFERED WRITER TO PREVENT LOSSING DATA
			sAVING.close();

		}// THIS THE END OF THE TRY

		// THIS THE STARTING OF THE CATCH
		catch (IOException geomar_ERROR) {

			// THE PROGRAM HAS TO PRINT TO THE SCREEN IF THERE ANY ERROR
			System.out.println();
			System.out.println("||||||||||||||||||||||||||||||||||||||||||");
			System.out.println("THERE IS AN ERROR\nI'M SORRY BUT I CAN NOT CLOSE THE REQUEST");
			System.out.println("||||||||||||||||||||||||||||||||||||||||||");
			System.out.println();

		}// THIS THE END OF THE CATCH

	}//THIS IS THE END OF THE SAVING THE DATA METHOD


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	//THIS IS THE STARTING OF THE CHANGE STUDENT DETAILS METHOD
	public static void cHANGE_STUDENT_DETAILS(){ 

		// THE PROGRAM HAS TO PRINT AN EMPTY LINE
		System.out.println();

		// THIS THE STARTING OF THE TRY
		try{

			// THIS IS THE INT VARIABLE TO STORING. PARSING THE DATA USER TO AN INTEGER
			int vAR_STUDENT_NUMBER = Integer.parseInt(uSER_INPUT.readLine());

			// THIS IS THE STARTING OF THE FOR LOOP FOR THE DEVELOPMENT OF CHANGING THE DATA INSIDE THE STUDENT DATA BASE
			for (int vARIABLE_CHANGE_DETAILS=0; vARIABLE_CHANGE_DETAILS<dATA_LIST.size();vARIABLE_CHANGE_DETAILS++){

				// THIS IS THE STARTING OF THE IF STATEMENT FOR CHECKING THE STUDENT NUMBER IS INSIDE THE DATA INSIDE THE STUDENT DATA BASE
				if (dATA_LIST.get(vARIABLE_CHANGE_DETAILS).getSTUDENT_NUMBER() == vAR_STUDENT_NUMBER) {

					// THE PROGRAM HAS USE THE GETTERS AND HAS TO PRINT ALSO TO THE SCREEN THE FOLLOWING
					System.out.println("|");
					System.out.println("|");
					System.out.println();
					System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||-");
					System.out.println("\nTHE STUDENT NUMBER IS: \n" + dATA_LIST.get(vARIABLE_CHANGE_DETAILS).getSTUDENT_NUMBER());
					System.out.println("\nAND BELONGS TO: \n" + "- LASTNAME: " + dATA_LIST.get(vARIABLE_CHANGE_DETAILS).getSTUDENT_LASTNAME() + "            " + "- NAME: " + dATA_LIST.get(vARIABLE_CHANGE_DETAILS).getSTUDENT_NAME());
					System.out.println("- MOBILE PHONE: " + dATA_LIST.get(vARIABLE_CHANGE_DETAILS).getSTUDENT_MOBILE_PHONE() + "      " + "- E-MAIL ADDRESS: " + dATA_LIST.get(vARIABLE_CHANGE_DETAILS).getSTUDENT_EMAIL_ADDRESS());
					System.out.println();
					System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||-");
					System.out.println();

					// THIS THE STARTING OF THE TRY
					try {

				  		//THIS IS THE CREATION OF THE STRING ARRAY FOR STORING THE DATA FROM THE USER INPUT
						String uSER_DATA [] = new String[5];

						// THE PROGRAM HAS TO PRINT TO THE SCREEN THE FOLLOWING
						System.out.println("\nSTEP 1: YOU CAN WRITE THE SAME STUDENT NUMBER OR YOU CAN PUT A NEW ONE\nTHEN PRESS ENTER TO KEEP GOING\n");
						System.out.print("\nSTUDENT NUMBER: \n");

						// THE PROGRAM HAS TO STORE THE STUDENT NUMBER INSIDE THE ARRAY
						uSER_DATA [0] = uSER_INPUT.readLine();
						
						// THE PROGRAM HAS TO PRINT AN EMPTY LINE
						System.out.println();

						// THE PROGRAM HAS TO PRINT TO THE SCREEN THE FOLLOWING
						System.out.println("\nSTEP 2: WRITE THE NEW STUDENT LASTNAME(START WITH LOWER CASE LETTER), THEN PRESS ENTER TO KEEP GOING");
						System.out.print("\nSTUDENT LASTNAME: \n");

						// THE PROGRAM HAS TO STORE THE LAST NAME INSIDE THE ARRAY
						uSER_DATA [1] = uSER_INPUT.readLine();

						// THE PROGRAM HAS TO PRINT AN EMPTY LINE
						System.out.println();

						// THE PROGRAM HAS TO PRINT TO THE SCREEN THE FOLLOWING
						System.out.println("\nSTEP 3: WRITE THE NEW STUDENT NAME(START WITH LOWER CASE LETTER), THEN PRESS ENTER TO KEEP GOING");
						System.out.print("\nSTUDENT NAME: \n");

						// THE PROGRAM HAS TO STORE THE NAME INSIDE THE ARRAY
						uSER_DATA [2] = uSER_INPUT.readLine();

						// THE PROGRAM HAS TO PRINT AN EMPTY LINE
						System.out.println();

						// THE PROGRAM HAS TO PRINT TO THE SCREEN THE FOLLOWING
						System.out.println("\nSTEP 4: WRITE THE NEW STUDENT E-MAIL ADDRESS(START WITH LOWER CASE LETTER), THEN PRESS ENTER TO KEEP GOING");
						System.out.print("\nSTUDENT E-MAIL ADDRESS: \n");

						// THE PROGRAM HAS TO STORE THE EMAIL ADDRESS INSIDE THE ARRAY
						uSER_DATA [3] = uSER_INPUT.readLine();

						// THE PROGRAM HAS TO PRINT AN EMPTY LINE
						System.out.println();

						// THE PROGRAM HAS TO PRINT TO THE SCREEN THE FOLLOWING
						System.out.println("\nSTEP 5: WRITE THE NEW STUDENT MOBILE PHONE AND THEN PRESS ENTER TO KEEP GOING");
						System.out.print("\nSTUDENT MOBILE PHONE: \n");

						// THE PROGRAM HAS TO STORE THE MOBILE PHONE INSIDE THE ARRAY
						uSER_DATA [4] = uSER_INPUT.readLine();

						// THE PROGRAM HAS TO PRINT AN EMPTY LINE
						System.out.println();

						// THIS IS FOR CREATING A NEW OBJECT FROM THE OBJECTMETHOD CLASS TO CHANGING THE DETAILS INSIDE THE THE STUDENT FILE DATA BASE
						ObjectMethod sTART_WRITING = new ObjectMethod();

						// THE PROGRAM HAS TO USE THE SETTERS TO REPLACE THE NEW DATA OF THE STUDENT NUMBER, INSIDE THE STUDENT DATA BASE
						//dATA_LIST.get(vARIABLE_CHANGE_DETAILS).set_STUDENT_NUMBER_LIST(Integer.parseInt(uSER_DATA[0]));

						// THE PROGRAM HAS TO USE THE SETTERS TO REPLACE THE NEW DATA OF THE LAST NAME, INSIDE THE STUDENT DATA BASE
						dATA_LIST.get(vARIABLE_CHANGE_DETAILS).set_STUDENT_LASTNAME_LIST( uSER_DATA[1]);

						// THE PROGRAM HAS TO USE THE SETTERS TO REPLACE THE NEW DATA OF THE NAME, INSIDE THE STUDENT DATA BASE
						dATA_LIST.get(vARIABLE_CHANGE_DETAILS).set_STUDENT_NAME_LIST(uSER_DATA[2]);

						// THE PROGRAM HAS TO USE THE SETTERS TO REPLACE THE NEW DATA OF THE EMAIL ADDRESS, INSIDE THE STUDENT DATA BASE
						dATA_LIST.get(vARIABLE_CHANGE_DETAILS).set_STUDENT_EMAIL_LIST (uSER_DATA[3]);

						// THE PROGRAM HAS TO USE THE SETTERS TO REPLACE THE NEW DATA OF THE MOBILE PHONE, INSIDE THE STUDENT DATA BASE
						dATA_LIST.get(vARIABLE_CHANGE_DETAILS).set_STUDENT_MOBILE_PHONE_LIST (Integer.parseInt(uSER_DATA[4]));


					// THE PROGRAM HAS TO PRINT TO THE SCREEN THE FOLLOWING: TO ASK TO THE USER TO CONFIRM THE CHANGING
					System.out.println();
					System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||-");
					System.out.println("ARE YOU REALLY SURE ABOUT CHANGING THE DETAILS FROM THIS STUDENT?");
					System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||-");
					System.out.println();
					System.out.println();
					System.out.println("|||||||||||||||||||||");
					System.out.println("IF YOUR ANSWER IS\nYES\nPRESS NUMBER 1");
					System.out.println("|||||||||||||||||||||");
					System.out.println();
					System.out.println("|||||||||||||||||||||");
					System.out.println("IF YOUR ANSWER IS\nNO\nPRESS NUMBER 2");
					System.out.println("|||||||||||||||||||||");
					System.out.println();
				
				
				// THIS THE DECLARATION OF THE INT VARIABLE
				int aNSWER_2 = 0;

					// THIS THE STARTING OF THE SECOND TRY
					try{

						// THE PROGRAM HAS TO PRINT TO THE SCREEN THE FOLLOWING
						System.out.print("\nAND YOUR ANSWER IS: \n");
						
						// THIS IS THE CREATION OF THE VARIABLE. PARSING THE DATA USER TO AN INTEGER
						aNSWER_2 = Integer.parseInt(uSER_INPUT.readLine());

						// THIS THE STARTING OF THE SWITCH
						switch(aNSWER_2){

							case 1:

							// THE PROGRAM HAS TO PRINT TO THE SCREEN THE FOLLOWING: IF THE CASE THE USER CHOSE YES AS ANSWER
							System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||");
							System.out.println("|---WELL DONE!!! THE STUDENT DETAILS WAS MODIFIED---|");
							System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||");
							System.out.println();

							// IN THIS CASE THE PROGRAM HAS TO USE THE SAVE THE DATA METHOD TO SAVE DATA FROM THE USER, TO THE STUDENT DATA BASE
							sAVING_THE_DATA();
							break;

							case 2:

							// THE PROGRAM HAS TO PRINT TO THE SCREEN THE FOLLOWING: IF THE CASE THE USER CHOSE NO AS ANSWER
							System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
							System.out.println("|---DON'T WORRY! TTHE STUDENT DETAILS WAS NOT MODIFIED----|");
							System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
							System.out.println();

							break;

							default:

							// THE PROGRAM HAS TO PRINT TO THE SCREEN IF THE USER MAKE A WRONG CHOICE
							System.out.println();
							System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
							System.out.println("WRONG CHOICE\nWE BOTH KNOW, THAT IS THE WRONG NUMBER OPTION, AM I RIGHT?...\nCAN YOU PLEASE, TRY AGAIN?");
							System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
							System.out.println();

							break;

							}//THIS IS THE END OF THE SWITCH

						}//THIS IS THE END OF SECOND THE TRY

					//THIS IS THE STARTING OF SECOND CATCH
					catch (IOException geomar_ERROR){

							// THE PROGRAM HAS TO PRINT TO THE SCREEN IF THE USER MAKE A MISTAKE
							System.out.println();
							System.out.println("||||||||||||||||||||||||||||||||||||||||||");
							System.out.println("THERE IS AN ERROR\nI'M SORRY BUT YOU MADE A MISTAKE. TRY AGAIN");
							System.out.println("||||||||||||||||||||||||||||||||||||||||||");
							System.out.println();

						}//THIS IS THE END OF SECOND CATCH
		

				    }// THIS THE END OF FIRST THE TRY

				    // THIS THE STARTING OF THE CATCH
				    catch(IOException geomar_ERROR){
						
						// THE PROGRAM HAS TO PRINT TO THE SCREEN IF THE USER MAKE A MISTAKE (TEXT)
						System.out.println();
						System.out.println("||||||||||||||||||||||||||||||||||||||||||");
						System.out.println("THERE IS AN ERROR\nI'M SORRY BUT YOU MADE A MISTAKE. TRY AGAIN");
						System.out.println("||||||||||||||||||||||||||||||||||||||||||");
						System.out.println();

					}// THIS THE END OF THE CATCH

				    // THIS THE STARTING OF THE CATCH
					catch (NumberFormatException geomar_ERROR){

						// THE PROGRAM HAS TO PRINT TO THE SCREEN IF THE USER MAKE A MISTAKE (NUMBERS)
						System.out.println();
						System.out.println("||||||||||||||||||||||||||||||||||||||||||");
						System.out.println("THERE IS AN ERROR\nI'M SORRY BUT YOU MADE A MISTAKE. TRY AGAIN");
						System.out.println("||||||||||||||||||||||||||||||||||||||||||");
						System.out.println();

					}// THIS THE END OF THE CATCH
	
				}// THIS THE END OF IF STATEMENT 

			}// THIS THE END OF THE FOOR LOOP 

		}// THIS THE END OF THE TRY

		// THIS THE STARTING OF THE CATCH
		catch( IOException geomar_ERROR ){

			// THE PROGRAM HAS TO PRINT TO THE SCREEN IF THE USER MAKE A MISTAKE (TEXT)
			System.out.println();
			System.out.println("||||||||||||||||||||||||||||||||||||||||||");
			System.out.println("THERE IS AN ERROR\nI'M SORRY BUT YOU MADE A MISTAKE. TRY AGAIN");
			System.out.println("||||||||||||||||||||||||||||||||||||||||||");
			System.out.println();

    	}// THIS THE END OF THE CATCH

		// THIS THE STARTING OF THE CATCH
    	catch (NumberFormatException geomar_ERROR){

			// THE PROGRAM HAS TO PRINT TO THE SCREEN IF THE USER MAKE A MISTAKE (NUMBERS)
			System.out.println();
			System.out.println("||||||||||||||||||||||||||||||||||||||||||");
			System.out.println("THERE IS AN ERROR\nI'M SORRY BUT YOU MADE A MISTAKE. TRY AGAIN");
			System.out.println("||||||||||||||||||||||||||||||||||||||||||");
			System.out.println();

		}// THIS THE END OF THE CATCH

	}//THIS IS THE END OF THE CHANGE STUDENT DETAILS METHOD



//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	//THIS IS THE STARTING OF THE ERASE THE STUDENT METHOD
	public static void eRASE_THE_STUDENT(){ 

		// THIS THE STARTING OF THE FIRST TRY
		try{

			// THIS IS THE INT VARIABLE TO STORING. PARSING THE DATA USER TO AN INTEGER
			int vAR_STUDENT_NUMBER = Integer.parseInt(uSER_INPUT.readLine()); 

			// THIS THE DECLARATION OF THE INT VARIABLE FOR STORING THE DATA FROM THE USER
			int aNSWER_3 = 0;

			// THIS IS THE STARTING OF THE FOR LOOP FOR THE DEVELOPMENT OF ERASING THE DATA INSIDE THE STUDENT DATA BASE
			for (int vARIABLE_ERASE_STUDENT=0; vARIABLE_ERASE_STUDENT<dATA_LIST.size();vARIABLE_ERASE_STUDENT++){

				// THIS IS THE STARTING OF THE IF STATEMENT FOR CHECKING THE STUDENT NUMBER IS INSIDE THE DATA INSIDE THE STUDENT DATA BASE
				if (dATA_LIST.get(vARIABLE_ERASE_STUDENT).getSTUDENT_NUMBER() == vAR_STUDENT_NUMBER) {

					// THE PROGRAM HAS TO PRINT TO THE SCREEN THE FOLLOWING, AND HAS TO USE THE GETTERS
					System.out.println("|");
					System.out.println("|");
					System.out.println();
					System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||-");
					System.out.println();
					System.out.println("\nTHE STUDENT NUMBER IS: \n" + dATA_LIST.get(vARIABLE_ERASE_STUDENT).getSTUDENT_NUMBER());
					System.out.println("\nAND BELONGS TO: \n");
					System.out.println("- LASTNAME: " + dATA_LIST.get(vARIABLE_ERASE_STUDENT).getSTUDENT_LASTNAME() + "            " + "- NAME: " + dATA_LIST.get(vARIABLE_ERASE_STUDENT).getSTUDENT_NAME() + "\n");
					System.out.println("- MOBILE PHONE: " + dATA_LIST.get(vARIABLE_ERASE_STUDENT).getSTUDENT_MOBILE_PHONE() + "      " + "- E-MAIL ADDRESS: " + dATA_LIST.get(vARIABLE_ERASE_STUDENT).getSTUDENT_EMAIL_ADDRESS());
					System.out.println();
					System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||-");

					// THE PROGRAM HAS TO PRINT TO THE SCREEN THE FOLLOWING, AND ASK TO THE USER IF THEY WANT TO ERASE THE STUDENT
					System.out.println();
					System.out.println();
					System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
					System.out.println("ARE YOU REALLY, REALLY, REALLY SURE ABOUT ERASING THIS STUDENT???");
					System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
					System.out.println();
					System.out.println();
					System.out.println("|||||||||||||||||||||");
					System.out.println("IF YOUR ANSWER IS\nYES\nPLEASE PRESS NUMBER 1");
					System.out.println("|||||||||||||||||||||");
					System.out.println();
					System.out.println("|||||||||||||||||||||");
					System.out.println("IF YOUR ANSWER IS\nNO\nPLEASE PRESS NUMBER 2");
					System.out.println("|||||||||||||||||||||");
					System.out.println();

					// THIS THE STARTING OF THE SECOND TRY
					try{

						// THE PROGRAM HAS TO PRINT TO THE SCREEN THE FOLLOWING
						System.out.print("\nAND YOUR ASNWER IS: \n");
						
						// THIS IS THE CREATION OF THE VARIABLE ANSWER. PARSING THE DATA USER TO AN INTEGER
						aNSWER_3 = Integer.parseInt(uSER_INPUT.readLine());

						// THIS THE STARTING OF THE SWITCH
						switch(aNSWER_3){

							case 1:

							// THE PROGRAM HAS TO PRINT TO THE SCREEN THE FOLLOWING
							System.out.println("|||||||||||||||||||||||||||||||||||||||||||||");
							System.out.println("|----WELL DONE!!! THE STUDENT WAS ERASED----|");
							System.out.println("|||||||||||||||||||||||||||||||||||||||||||||");
							System.out.println();
							System.out.println();

							// THE PROGRAM HAS TO ERASE THE DATA FROM THE STUDENT DATA BASE
							dATA_LIST.remove(dATA_LIST.get(vARIABLE_ERASE_STUDENT));

							// IN THIS CASE THE PROGRAM HAS TO USE THE SAVE THE DATA METHOD TO SAVE DATA FROM THE USER, TO THE STUDENT DATA BASE
							sAVING_THE_DATA();
							break;

							case 2:

							// THE PROGRAM HAS TO PRINT TO THE SCREEN THE FOLLOWING
							System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||");
							System.out.println("|---DON'T WORRY! THE STUDENT WAS NOT ERASED---|");
							System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||");
							System.out.println();
							System.out.println();
							
							// THIS IS THE CASE THE PROGRAM HAS GO BACK TO USING THE INFO REQUEST MENU METHOD WHEN THE USER DOESN'T WANT TO ERASE THE DATA
							iNFO_REQUEST_MENU();
							break;

							default:

							// THE PROGRAM HAS TO PRINT TO THE SCREEN IF THE USER MAKE A MISTAKE
							System.out.println();
							System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
							System.out.println("WRONG CHOICE\nWE BOTH KNOW, THAT IS THE WRONG NUMBER OPTION, AM I RIGHT?...\nCAN YOU PLEASE, TRY AGAIN?");
							System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
							System.out.println();

							break;

						}// THIS THE END OF THE SWITCH

					}// THIS THE END OF THE SECOND TRY

					// THIS THE STARTING OF THE CATCH
					catch (IOException geomar_ERROR){

						// THE PROGRAM HAS TO PRINT TO THE SCREEN IF THE USER MAKE A MISTAKE (TEXT)
						System.out.println();
						System.out.println("||||||||||||||||||||||||||||||||||||||||||");
						System.out.println("THERE IS AN ERROR\nI'M SORRY BUT YOU MADE A MISTAKE. TRY AGAIN");
						System.out.println("||||||||||||||||||||||||||||||||||||||||||");
						System.out.println();

					}// THIS THE END OF THE CATCH

				}// THIS THE END OF THE IF STATEMENT

			}// THIS THE END OF THE FOR LOOP

		}// THIS THE END OF THE FIRST TRY

		// THIS THE STARTING OF THE CATCH
		catch( IOException geomar_ERROR ){

			// THE PROGRAM HAS TO PRINT TO THE SCREEN IF THE USER MAKE A MISTAKE (TEXT)
			System.out.println();
			System.out.println("||||||||||||||||||||||||||||||||||||||||||");
			System.out.println("THERE IS AN ERROR\nI'M SORRY BUT YOU MADE A MISTAKE. TRY AGAIN");
			System.out.println("||||||||||||||||||||||||||||||||||||||||||");
			System.out.println();

    	}// THIS THE END OF THE CATCH

	}// THIS THE END OF THE ERASE THE STUDENT METHOD



//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	// THIS THE STARTING OF THE SHOW STUDENT DETAILS METHOD
	public static void sHOW_STUDENT_DETAILS(){

  		// THIS THE STARTING OF TRY
		try{

			// THIS IS THE INT VARIABLE TO STORING. PARSING THE DATA USER TO AN INTEGER
			int vAR_STUDENT_NUMBER = Integer.parseInt(uSER_INPUT.readLine());

			// THIS IS THE STARTING OF THE FOR LOOP FOR THE DEVELOPMENT FOR SHOWING THE DATA INSIDE THE STUDENT DATA BASE
			for (int vARIABLE_SHOW_STUDENT =0; vARIABLE_SHOW_STUDENT < dATA_LIST.size(); vARIABLE_SHOW_STUDENT ++){

				// THIS IS THE STARTING OF THE IF STATEMENT FOR CHECKING THE STUDENT NUMBER IS INSIDE THE DATA INSIDE THE STUDENT DATA BASE
				if (dATA_LIST.get(vARIABLE_SHOW_STUDENT).getSTUDENT_NUMBER() == vAR_STUDENT_NUMBER) {

					// THIS IS THE BOOLEAN TO CHECK IF THE STUDENT WAS FOUND OR NOT
					nOT_FOUND = true;

					// THE PROGRAM HAS TO PRINT TO THE SCREEN THE FOLLOWING, USING THE GETTERS
					System.out.println();
					System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||-");
					System.out.println();
					System.out.println("THE DETAILS FROM THE STUDENT ARE: \n");
					System.out.println("- LASTNAME: " + dATA_LIST.get(vARIABLE_SHOW_STUDENT).getSTUDENT_LASTNAME() + "            " + "- NAME: " + dATA_LIST.get(vARIABLE_SHOW_STUDENT).getSTUDENT_NAME() + "\n");
					System.out.println("- MOBILE PHONE: " + dATA_LIST.get(vARIABLE_SHOW_STUDENT).getSTUDENT_MOBILE_PHONE() + "    " + "- E-MAIL ADDRESS: " + dATA_LIST.get(vARIABLE_SHOW_STUDENT).getSTUDENT_EMAIL_ADDRESS());
					System.out.println();
					System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||-");
					System.out.println();
					System.out.println();

				
				}// THIS IS THE END OF THE IF STATEMENT

			}// THIS IS THE END OF FOR LOOP

			// THIS IS THE STARTING OF THE IF STATEMENT FOR CHECKING THE STUDENT NUMBER IS NOT FOUND
			if(nOT_FOUND == false){

				// THE PROGRAM HAS TO PRINT TO THE SCREEN THE FOLLOWING
				System.out.println();
				System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||");
				System.out.println("I'M SORRY\nBUT THE PERSON YOU ARE LOOKING FOR\nIS NOT INSIDE THE DATA BASE...");
				System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||");
				System.out.println();
			
			}// THIS IS THE END OF THE IF STATEMENT

		}// THIS IS THE END OF THE TRY

		// THIS IS THE STARTING OF THE CATCH
		catch( IOException geomar_ERROR ){

			// THE PROGRAM HAS TO PRINT TO THE SCREEN IF THE USER MAKE A MISTAKE (TEXT)
			System.out.println();
			System.out.println("||||||||||||||||||||||||||||||||||||||||||");
			System.out.println("THERE IS AN ERROR\nI'M SORRY BUT YOU MADE A MISTAKE. TRY AGAIN");
			System.out.println("||||||||||||||||||||||||||||||||||||||||||");
			System.out.println();

    	}// THIS IS THE END OF THE CATCH

    	// THIS IS THE STARTING OF THE CATCH
		catch (NumberFormatException geomar_ERROR){

			// THE PROGRAM HAS TO PRINT TO THE SCREEN IF THE USER MAKE A MISTAKE (NUMBERS)
			System.out.println();
			System.out.println("||||||||||||||||||||||||||||||||||||||||||");
			System.out.println("THERE IS AN ERROR\nI'M SORRY BUT YOU MADE A MISTAKE. TRY AGAIN");
			System.out.println("||||||||||||||||||||||||||||||||||||||||||");
			System.out.println();

		}// THIS IS THE END OF THE CATCH

	}// THIS IS THE END OF THE SHOW STUDENT DETAILS



//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	// THIS THE STARTING OF THE LOOK FOR STUDENT METHOD
	public static void lOOK_FOR_STUDENT(){

		// THIS IS THE INT VARIABLE TO STORING. PARSING THE DATA USER TO AN INTEGER
		int uSER_INPUT_lOOK_FOR_STUDENT = 0; 

		// THIS THE STARTING OF THE DO WHILE LOOP
		do {

			// THIS THE STARTING OF THE TRY
			try {

				// THIS IS THE INT VARIABLE TO STORING. PARSING THE DATA USER TO AN INTEGER
				uSER_INPUT_lOOK_FOR_STUDENT = Integer.parseInt(uSER_INPUT.readLine());

			}// THIS THE END OF THE TRY

			// THIS THE STARTING OF THE CATCH
			catch (IOException geomar_ERROR){

			// THE PROGRAM HAS TO PRINT TO THE SCREEN IF THE USER MAKE A MISTAKE (TEXT)
			System.out.println();
			System.out.println("||||||||||||||||||||||||||||||||||||||||||");
			System.out.println("THERE IS AN ERROR\nI'M SORRY BUT YOU MADE A MISTAKE. TRY AGAIN");
			System.out.println("||||||||||||||||||||||||||||||||||||||||||");
			System.out.println();

			}// THIS THE END OF THE CATCH

			// THIS THE STARTING OF THE CATCH
			catch(NumberFormatException geomar_ERROR){

			// THE PROGRAM HAS TO PRINT TO THE SCREEN IF THE USER MAKE A MISTAKE (NUMBERS)
			System.out.println();
			System.out.println("||||||||||||||||||||||||||||||||||||||||||");
			System.out.println("THERE IS AN ERROR\nI'M SORRY BUT YOU MADE A MISTAKE. TRY AGAIN");
			System.out.println("||||||||||||||||||||||||||||||||||||||||||");
			System.out.println();

				uSER_INPUT_lOOK_FOR_STUDENT = 9;

			}// THIS THE END OF THE CATCH

			// THIS THE STARTING OF THE SWITCH
			switch (uSER_INPUT_lOOK_FOR_STUDENT){

				case 1:

				// THE PROGRAM HAS TO PRINT TO THE SCREEN THE FOLLOWING
				System.out.println();
				System.out.println("YOUR CHOICE WAS NUMBER 1 – LOOK FOR STUDENT LASTNAME");
				System.out.println();
				System.out.println("YOU CAN WRITE ONE LETTER OR THE FULL STUDENT LASTNAME (START WITH LOWER CASE LETTER), THEN PRESS ENTER TO KEEP GOING:\n");

				// IN THIS CASE THE PROGRAM HAS TO USE THE LOOK FOR STUDENT LAST NAME METHOD FOR SEARCHING
				lOOK_FOR_STUDENT_LASTNAME();
				break;

				case 2:

				System.out.println();
				System.out.println("YOUR CHOICE WAS NUMBER 2 – LOOK FOR STUDENT NAME");
				System.out.println();
				System.out.println("YOU CAN WRITE ONE LETTER OR THE FULL STUDENT NAME (START WITH LOWER CASE LETTER), THEN PRESS ENTER TO KEEP GOING:\n");

				// IN THIS CASE THE PROGRAM HAS TO USE THE LOOK FOR STUDENT NAME METHOD FOR SEARCHING
				lOOK_FOR_STUDENT_NAME();

				break;

				case 3:

				System.out.println();
				System.out.println("YOUR CHOICE WAS NUMBER 3 – LOOK FOR STUDENT NUMBER");
				System.out.println();
				System.out.println("YOU MUST WRITE THE FULL STUDENT NUMBER, THEN PRESS ENTER TO KEEP GOING:");

				// IN THIS CASE THE PROGRAM HAS TO USE THE LOOK FOR STUDENT NUMBER METHOD FOR SEARCHING
				lOOK_FOR_STUDENT_NUMBER();
				break;

				case 0:

				break;

				default:

				// THE PROGRAM HAS TO PRINT TO THE SCREEN IF THE USER MAKE A MISTAKE
				System.out.println();
				System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
				System.out.println("WRONG CHOICE\nWE BOTH KNOW, THAT IS THE WRONG NUMBER OPTION, AM I RIGHT?...\nCAN YOU PLEASE, TRY AGAIN?");
				System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
				System.out.println();
			
			}// THIS THE END OF THE SWITCH

		}while(uSER_INPUT_lOOK_FOR_STUDENT != 0); // THIS THE END OF THE SDO WHILE LOOP

	}// THIS THE END OF THE LOOK FOR STUDENT METHOD



//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	// THIS THE STARTING OF THE LOOK FOR STUDENT NUMBER METHOD
	public static void lOOK_FOR_STUDENT_NUMBER (){

		
  		// THIS THE STARTING OF TRY
		try{
  			
			// THIS IS THE INT VARIABLE TO STORING. PARSING THE DATA USER TO AN INTEGER
			int vAR_STUDENT_NUMBER = Integer.parseInt(uSER_INPUT.readLine());

			// THIS IS THE STARTING OF THE FOR LOOP FOR THE DEVELOPMENT FOR LOOKING THE STUDENT NUMBER DATA INSIDE THE STUDENT DATA BASE
			for (int vARIABLE_LOOK_STUDENT_NUMBER = 0; vARIABLE_LOOK_STUDENT_NUMBER<dATA_LIST.size();vARIABLE_LOOK_STUDENT_NUMBER++){

				// THIS IS THE STARTING OF THE IF STATEMENT FOR CHECKING THE STUDENT NUMBER IS INSIDE THE DATA INSIDE THE STUDENT DATA BASE
				if (dATA_LIST.get(vARIABLE_LOOK_STUDENT_NUMBER).getSTUDENT_NUMBER() == vAR_STUDENT_NUMBER){

					// THIS IS THE BOOLEAN TO CHECK IF THE STUDENT WAS FOUND OR NOT
					nOT_FOUND = true;

					// THE PROGRAM HAS COUNT ALL THE MATCHES OF ALL THE STUDENTS INSIDE THE STUDENT DATA BASE
					nUMBER_OF_TIMES = vARIABLE_LOOK_STUDENT_NUMBER;
					// THE PROGRAM HAS TO PRINT TO THE SCREEN THE RIGHT MATCH OR ALL THE MATCHES OF ALL THE STUDENTS INSIDE THE STUDENT DATA BASE
					sHOW_TO_SCREEN_STUDENT_NUMBER(nUMBER_OF_TIMES);

				}// THIS THE END OF THE IF STATEMENT

			}// THIS THE END OF THE FOR LOOP

			// THIS IS THE STARTING OF THE IF STATEMENT FOR CHECKING THE STUDENT NUMBER IS NOT FOUND
			if (nOT_FOUND == false) {

				// THE PROGRAM HAS TO PRINT TO THE SCREEN THE FOLLOWING
				System.out.println();
				System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||");
				System.out.println("I'M SORRY\nBUT THE PERSON YOU ARE LOOKING FOR\nIS NOT IN THIS THE DATA BASE...");
				System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||");
				System.out.println();

			}// THIS THE END OF IF STATEMENT

		}// THIS THE END OF TRY

		// THIS IS THE STARTING OF THE CATCH
		catch( IOException geomar_ERROR ){

			// THE PROGRAM HAS TO PRINT TO THE SCREEN IF THE USER MAKE A MISTAKE (TEXT)
			System.out.println();
			System.out.println("||||||||||||||||||||||||||||||||||||||||||");
			System.out.println("THERE IS AN ERROR\nI'M SORRY BUT YOU MADE A MISTAKE. TRY AGAIN");
			System.out.println("||||||||||||||||||||||||||||||||||||||||||");
			System.out.println();

    	}// THIS THE END OF THE CATCH

    	// THIS IS THE STARTING OF THE CATCH
		catch (NumberFormatException geomar_ERROR){

			// THE PROGRAM HAS TO PRINT TO THE SCREEN IF THE USER MAKE A MISTAKE (NUMBERS)
			System.out.println();
			System.out.println("||||||||||||||||||||||||||||||||||||||||||");
			System.out.println("THERE IS AN ERROR\nI'M SORRY BUT YOU MADE A MISTAKE. TRY AGAIN");
			System.out.println("||||||||||||||||||||||||||||||||||||||||||");
			System.out.println();

		}// THIS THE END OF THE CATCH


	}// THIS THE END OF THE LOOK FOR STUDENT NUMBER METHOD

	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	// THIS THE STARTING OF THE LOOK FOR STUDENT LAST NAME METHOD
	public static void lOOK_FOR_STUDENT_LASTNAME(){

  		// THIS THE STARTING OF TRY
		try{

			// THIS IS THE STRING VARIABLE TO STORING
			String vAR_STUDENT_LASTNAME = uSER_INPUT.readLine();

			// THIS IS THE STARTING OF THE FOR LOOP FOR THE DEVELOPMENT FOR LOOKING THE STUDENT LAST NAME DATA INSIDE THE STUDENT DATA BASE
			for (int vARIABLE_LOOK_STUDENT_LASTNAME =0; vARIABLE_LOOK_STUDENT_LASTNAME < dATA_LIST.size(); vARIABLE_LOOK_STUDENT_LASTNAME++){

				// THIS IS THE STARTING OF THE IF STATEMENT FOR CHECKING THE STUDENT LAST NAME IS INSIDE THE DATA INSIDE THE STUDENT DATA BASE
				if (dATA_LIST.get(vARIABLE_LOOK_STUDENT_LASTNAME).getSTUDENT_LASTNAME().contains(vAR_STUDENT_LASTNAME)) {

					// THIS IS THE BOOLEAN TO CHECK IF THE STUDENT WAS FOUND OR NOT
					nOT_FOUND = true;

					// THE PROGRAM HAS COUNT ALL THE MATCHES OF ALL THE STUDENTS INSIDE THE STUDENT DATA BASE
					nUMBER_OF_TIMES = vARIABLE_LOOK_STUDENT_LASTNAME;

					// THE PROGRAM HAS TO PRINT TO THE SCREEN THE RIGHT MATCH OR ALL THE MATCHES OF ALL THE STUDENTS INSIDE THE STUDENT DATA BASE
					sHOW_TO_SCREEN_LASTNAME(nUMBER_OF_TIMES);

				}// THIS IS THE END OF THE IF STATEMENT
				
			}// THIS IS THE END OF THE FOOR LOOP

			// THIS IS THE STARTING OF THE IF STATEMENT FOR CHECKING THE STUDENT NUMBER IS NOT FOUND
			if (nOT_FOUND == false) {

				// THE PROGRAM HAS TO PRINT TO THE SCREEN THE FOLLOWING
				System.out.println();
				System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||");
				System.out.println("I'M BUT I CAN NOT FOUND THE LASTNAME OF PERSON YOU ARE LOOKING FOR\nYOU CAN TRY AGAIN");
				System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||");
				System.out.println();

			}// THIS IS THE END OF THE IF STATEMENT

		}// THIS IS THE END OF THE TRY

		// THIS IS THE STARTING OF THE CATCH
		catch(IOException geomar_ERROR){

			// THE PROGRAM HAS TO PRINT TO THE SCREEN IF THE USER MAKE A MISTAKE (TEXT)
			System.out.println();
			System.out.println("||||||||||||||||||||||||||||||||||||||||||");
			System.out.println("THERE IS AN ERROR\nI'M SORRY BUT YOU MADE A MISTAKE. TRY AGAIN");
			System.out.println("||||||||||||||||||||||||||||||||||||||||||");
			System.out.println();

    	}// THIS IS THE END CATCH

	}// THIS IS THE END OF THE LOOK FOR STUDENT LAST NAME METHOD


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	// THIS THE STARTING OF THE LOOK FOR STUDENT NAME METHOD
	public static void lOOK_FOR_STUDENT_NAME (){

  		// THIS THE STARTING OF TRY
		try{

  			// THIS IS THE STRING VARIABLE TO STORING
			String vAR_STUDENT_NAME = uSER_INPUT.readLine();

			// THIS IS THE STARTING OF THE FOR LOOP FOR THE DEVELOPMENT FOR LOOKING THE STUDENT NAME DATA INSIDE THE STUDENT DATA BASE
			for (int vARIABLE_LOOK_STUDENT_NAME =0; vARIABLE_LOOK_STUDENT_NAME < dATA_LIST.size(); vARIABLE_LOOK_STUDENT_NAME ++){

				// THIS IS THE STARTING OF THE IF STATEMENT FOR CHECKING THE STUDENT NAME IS INSIDE THE DATA INSIDE THE STUDENT DATA BASE
				if (dATA_LIST.get(vARIABLE_LOOK_STUDENT_NAME).getSTUDENT_NAME().contains(vAR_STUDENT_NAME)) {

					// THIS IS THE BOOLEAN TO CHECK IF THE STUDENT WAS FOUND OR NOT
					nOT_FOUND = true;

					// THE PROGRAM HAS COUNT ALL THE MATCHES OF ALL THE STUDENTS INSIDE THE STUDENT DATA BASE
					nUMBER_OF_TIMES = vARIABLE_LOOK_STUDENT_NAME;
					// THE PROGRAM HAS TO PRINT TO THE SCREEN THE RIGHT MATCH OR ALL THE MATCHES OF ALL THE STUDENTS INSIDE THE STUDENT DATA BASE
					sHOW_TO_SCREEN_NAME(nUMBER_OF_TIMES);

				}// THIS IS THE END OF THE IF STATEMENT

			}// THIS IS THE END OF THE FOOR LOOP

			// THIS IS THE STARTING OF THE IF STATEMENT FOR CHECKING THE STUDENT NUMBER IS NOT FOUND
			if (nOT_FOUND == false) {

				// THE PROGRAM HAS TO PRINT TO THE SCREEN THE FOLLOWING
				System.out.println();
				System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||");
				System.out.println("I'M BUT I CAN NOT FOUND THE LASTNAME OF PERSON YOU ARE LOOKING FOR\nYOU CAN TRY AGAIN");
				System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||");
				System.out.println();

			}// THIS IS THE END OF THE IF STATEMENT

		}// THIS IS THE END OF TRY

		// THIS IS THE STARTING OF THE CATCH
		catch( IOException geomar_ERROR ){

			// THE PROGRAM HAS TO PRINT TO THE SCREEN IF THE USER MAKE A MISTAKE (TEXT)
			System.out.println();
			System.out.println("||||||||||||||||||||||||||||||||||||||||||");
			System.out.println("THERE IS AN ERROR\nI'M SORRY BUT YOU MADE A MISTAKE. TRY AGAIN");
			System.out.println("||||||||||||||||||||||||||||||||||||||||||");
			System.out.println();

    	}// THIS IS THE END OF THE CATCH

	}// THIS IS THE END OF THE LOOK FOR STUDENT NAME METHOD


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	// THIS THE STARTING OF THE TOTAL OF STUDENTS METHOD
	public static void tOTAL_OF_STUDENTS(){
		
		// THE PROGRAM HAS TO PRINT TO THE SCREEN THE THE TOTAL OF STUDENTS INSIDE THE STUDENT DATA BASE
		System.out.println();
		System.out.println("|||||||||||||||||||||||||||||-");
		System.out.println();	
		System.out.println("THE TOTAL NUMBER OF STUDENTS\nINSIDE DE DATA BASE IS: " + dATA_LIST.size());
		System.out.println();
		System.out.println("|||||||||||||||||||||||||||||-");
		System.out.println();

	}// THIS THE END OF THE TOTAL OF STUDENTS METHOD


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	// THIS THE STARTING OF THE SHOW THE STUDENTS LIST METHOD
	public static void sHOW_THE_STUDENT_LIST(){
		
		// THE PROGRAM HAS TO PRINT TO THE SCREEN AN EMPTY LINE
		System.out.println();

		// THIS IS THE STARTING OF THE FOR LOOP FOR THE DEVELOPMENT FOR SHOWING THE TOTAL OF STUDENTS INSIDE THE STUDENT DATA BASE
		for ( int tOTAL_LIST = 0; tOTAL_LIST < dATA_LIST.size() ; tOTAL_LIST ++ ){
			
			// THE PROGRAM HAS TO PRINT TO THE SCREEN THE FOLLOWING, USING THE GETTERS
			System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||-");
			System.out.println();
			System.out.println("STUDENT POSITION INDISE THE DATA BASE: " + ( tOTAL_LIST + 1 ) );
			System.out.println("\nTHE DETAILS FROM THE STUDENT ARE: \n");
			System.out.println("- STUDENT NUMBER: " + dATA_LIST.get(tOTAL_LIST).getSTUDENT_NUMBER() + "\n");
			System.out.println("- LASTNAME: " +  dATA_LIST.get(tOTAL_LIST).getSTUDENT_LASTNAME() + "            " + "- NAME: " + dATA_LIST.get(tOTAL_LIST).getSTUDENT_NAME() + "\n");
			System.out.println("- MOBILE PHONE: " + dATA_LIST.get(tOTAL_LIST).getSTUDENT_MOBILE_PHONE() + "    " + "- E-MAIL ADDRESS: " + dATA_LIST.get(tOTAL_LIST).getSTUDENT_EMAIL_ADDRESS());
			System.out.println();
			System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||-");
			System.out.println();
			System.out.println();
			
		}// / THIS IS THE END OF THE FOR LOOP

	}// THIS THE END OF THE SHOW THE STUDENTS LIST METHOD



//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	// THIS THE STARTING OF THE SHOW TO THE SCREEN STUDENT LAST NAME METHOD
	public static int sHOW_TO_SCREEN_LASTNAME (int pRINT_1){

		// THE PROGRAM HAS TO PRINT TO THE SCREEN THE FOLLOWING, USING THE GETTERS
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println();
		System.out.println("THE STUDENT LASTNAME BELONGS TO: \n");
		System.out.println("- STUDENT NUMBER: " + dATA_LIST.get(pRINT_1).getSTUDENT_NUMBER() + "\n");
		System.out.println("- LASTNAME: " + dATA_LIST.get(pRINT_1).getSTUDENT_LASTNAME() + "            " + "- NAME: " + dATA_LIST.get(pRINT_1).getSTUDENT_NAME() + "\n");
		System.out.println("- MOBILE PHONE: " + dATA_LIST.get(pRINT_1).getSTUDENT_MOBILE_PHONE() + "    " + "- E-MAIL ADDRESS: " + dATA_LIST.get(pRINT_1).getSTUDENT_EMAIL_ADDRESS());
		System.out.println();
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println();
		System.out.println();
		System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("IF YOU WANT TO GO BACK TO THE INFO REQUEST MENU AGAIN\nJUST PRESS THE NUMBER 0");
		System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println();
		System.out.println();

		// THE PROGRAM HAS TO RETURN AS pRINT_1
		return pRINT_1;

	}// THIS THE END OF THE SHOW TO THE SCREEN STUDENT LAST NAME METHOD



//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	// THIS THE STARTING OF THE SHOW TO THE SCREEN STUDENT NAME METHOD
	public static int sHOW_TO_SCREEN_NAME (int pRINT_2){

		// THE PROGRAM HAS TO PRINT TO THE SCREEN THE FOLLOWING, USING THE GETTERS
		System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println();
		System.out.println("THE STUDENT NAME BELONGS TO: \n");
		System.out.println("- STUDENT NUMBER: " + dATA_LIST.get(pRINT_2).getSTUDENT_NUMBER() + "\n");
		System.out.println("- LASTNAME: " + dATA_LIST.get(pRINT_2).getSTUDENT_LASTNAME() + "            " + "- NAME: " + dATA_LIST.get(pRINT_2).getSTUDENT_NAME() + "\n");
		System.out.println("- MOBILE PHONE: " + dATA_LIST.get(pRINT_2).getSTUDENT_MOBILE_PHONE() + "    " + "- E-MAIL ADDRESS: " + dATA_LIST.get(pRINT_2).getSTUDENT_EMAIL_ADDRESS());
		System.out.println();
		System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println();
		System.out.println();
		System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("IF YOU WANT TO GO BACK TO THE INFO REQUEST MENU AGAIN\nJUST PRESS THE NUMBER 0");
		System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println();
		System.out.println();
				 	
		// THE PROGRAM HAS TO RETURN AS pRINT_2
		return pRINT_2;

	}// THIS THE END OF THE SHOW TO THE SCREEN STUDENT NAME METHOD


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	// THIS THE STARTING OF THE SHOW TO THE SCREEN STUDENT NUMBER METHOD
	public static int sHOW_TO_SCREEN_STUDENT_NUMBER (int pRINT_3){

		// THE PROGRAM HAS TO PRINT TO THE SCREEN THE FOLLOWING, USING THE GETTERS
		System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println();
		System.out.println("THE STUDENT NUMBER BELONGS TO: \n");
		System.out.println("- STUDENT NUMBER: " + dATA_LIST.get(pRINT_3).getSTUDENT_NUMBER() + "\n");
		System.out.println("- LASTNAME: " + dATA_LIST.get(pRINT_3).getSTUDENT_LASTNAME() + "            " + "- NAME: " + dATA_LIST.get(pRINT_3).getSTUDENT_NAME() + "\n");
		System.out.println("- MOBILE PHONE: " + dATA_LIST.get(pRINT_3).getSTUDENT_MOBILE_PHONE() + "    " + "- E-MAIL ADDRESS: " + dATA_LIST.get(pRINT_3).getSTUDENT_EMAIL_ADDRESS());
		System.out.println();
		System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println();
		System.out.println();
		System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("IF YOU WANT TO GO BACK TO THE INFO REQUEST MENU AGAIN\nJUST PRESS THE NUMBER 0");
		System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println();
		System.out.println();
				 	
		// THE PROGRAM HAS TO RETURN AS pRINT_3
		return pRINT_3;

	}// THIS THE END OF THE SHOW TO THE SCREEN STUDENT NAME METHOD

}// THIS IS THE END OF THE GEOMAIN CLASS