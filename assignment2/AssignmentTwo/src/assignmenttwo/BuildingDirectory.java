/*
 * 7.	What is a hashtable? Explain its use with an example program. 
 */

package assignmenttwo;


/**
 *
 * @author zacharylevy
 * @version 20140715
 */

import java.util.Enumeration;
import java.util.Hashtable;

public class BuildingDirectory {
    // instance vars
    Hashtable<String, Integer> directory = new Hashtable<String, Integer>();

    // constructor
    public BuildingDirectory () {
        // fill up the building directory with:
        // company name, unit #
        directory.put("ACME", 101);
        directory.put("Valve", 102);
        directory.put("Facebook", 201);
        directory.put("Toys R Us", 202);
        directory.put("Empty", 301);
        directory.put("Athabasca", 302);
    }
    
    // returns the hashtable directory
    // prints out the hashtable in hashtabl form
    public Hashtable getDirectory() {
        System.out.println("Directory: " + directory);
        return directory;
    }
    
    // gets just the company names and prints them out
    public void getCompanies() {
        System.out.print("Directory: ");
        
        // ENUMERATE the keys of the hashtable
        Enumeration<String> directoryKeys = directory.keys();
        // while the hashtable has more keys
        while (directoryKeys.hasMoreElements()) {
            // use the enumeration method nextElement to get the next key in the hashtable
            String company = directoryKeys.nextElement();
            Integer room = directory.get(company);
            if (directoryKeys.hasMoreElements()) {
                System.out.print(company + ", ");
            } else {
                System.out.println(company + ".");
            }
        } 
    }
    
    // gets the company's office unit # by company name
    public Integer getOffice(String companyName) {
        System.out.println(directory.get(companyName));
        return directory.get(companyName);
    }
}
