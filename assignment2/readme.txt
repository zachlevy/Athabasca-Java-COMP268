Assignment 2 was coded using NetBeans 8.0
The AssignmentTwo.java class has all the example classes being run
There is 1 class for each question, exception of questions 7 and 9.
Written answers for questions 7 and 9 are in "Assignment 2 Written Answers.pdf"



Test Plans
** I only made test plans for programs that require console input as per http://scis.lms.athabascau.ca/mod/forum/discuss.php?d=35553


Question 1 FileIO
	Expected behaviour:
		input.txt is in the Netbeans Java project root dir
			if does not exist, throws IOException
		output.txt does not already exist
			if already exists, overwrites file

Question 13 VectorNumbers.java
	Expected behaviour:
		user enters an integer in console
			if string with letters, responds with You have not entered a integer. Enter a integer > 0
		user enters a positive integer in console
			if negative or 0, responds with "You entered a integer < 1. Enter a integer > 0"
		if decimal integer, responds with
			You have not entered a integer. Enter a integer > 0

Question 12 ReverseParagraph.java
	Expected behaviour:
		user enters a multi-sentence paragraph
			if not multi-sentence, no error caught, still a paragraph.
			if no period, error output to console "Enter a real paragraph with a ".""

Question 25 GetSetGo.java
	Expected behaviour:
		user enters any chars as a string
			all characters accepted, no error catching


