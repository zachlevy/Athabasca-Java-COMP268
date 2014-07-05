/*
 * A news magazine wants to conduct a survey across the four research
universities in Alberta. For each university, the magazine wants to gather the
number of departments, the number of students
doing research in each department, courses taken by each research student, and
marks scored by these students in courses. Design, develop, and implement a
Class to capture this information.

 */

package midtermquiz;

/**
 *
 * @author zacharylevy
 * @version 20140704
 */
import java.util.ArrayList;
import java.util.Scanner;

// this class captures research data from the console and stores it in an array called researchSurvey for later use
public class ResearchSurvey {
    // instance vars
    ArrayList<Sample> samplesList = new ArrayList<Sample>(); // mutable array holding all the samples
    Scanner in = new Scanner(System.in);
    
    // constructor
    public ResearchSurvey () {
        boolean stop = false;
        // while loop
        while (stop == false) {
            // get the input for new data samples, in csv form, no spaces
            System.out.println("Make a new sample in the format \"studentID,departmentID,universityID,courseID,grade\". Enter \"stop\" when finished.");
            String newSampleStrings = in.nextLine();
            // safeword
            if (newSampleStrings.equals("stop")) {
                // get out of the looooooop
                stop = true;
                break;
            } else {
                // get the csv from the console
                String[] newSample = newSampleStrings.split(","); // take in a csv, turn it into an array of strings

                
                Sample sample = new Sample(
                        Integer.parseInt(newSample[0]),
                        Integer.parseInt(newSample[1]),
                        Integer.parseInt(newSample[2]),
                        Integer.parseInt(newSample[3]),
                        Double.parseDouble(newSample[4])
                );
            }
            
        }
    }
    
    // sample inner class
    // takes in all the relevant data for a sample point
    // structured as if it were to be entered into a relational database
    public class Sample {
        // instance vars
        public int studentID;
        public int departmentID;
        public int universityID;
        public int courseID;
        public double grade;
        
        // constructor
        public Sample (
                int startStudentID,
                int startDepartmentID,
                int startUniversityID,
                int startCourseID,
                double startGrade) {
            studentID = startStudentID;
            departmentID = startDepartmentID;
            universityID = startUniversityID;
            courseID= startCourseID;
            grade = startGrade;
            
            // add this object to the samplesList array for later use
            samplesList.add(this);
        }
    }

}