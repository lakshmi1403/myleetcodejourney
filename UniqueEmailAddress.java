/*
Solution:

-> So first we have to split the input based on the delimiter '@'
-> Next we have to parse the first half which is split from the above step.
-> And the we have to append the text after '.' and ignore the text after '+'
-> This way we can get the number of valid email addresses.
*/
package com.example.myleetcodejourney;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueEmailAddress {

    public static int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        for(String s : emails){

            StringBuilder sb = new StringBuilder();
            int delimiter = s.indexOf("@");

            for(int i=0;i<delimiter;i++){
                char ch = s.charAt(i);
                if(ch == '+') break;
                if(ch!='.') sb.append(ch);
            }

            sb.append(s.substring(delimiter));
            set.add(sb.toString());
        }
        return set.size();
    }

    public static void main(String[] args){

            // Create a Scanner object for user input
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter email addresses
            System.out.println("Enter email addresses (type 'done' to finish input):");

            // Create a HashSet to store unique email addresses
            HashSet<String> emailSet = new HashSet<>();

            // Keep taking user input until they type 'done'
            while (true) {
                String email = scanner.nextLine().trim();

                // Check if the user wants to finish input
                if (email.equalsIgnoreCase("done")) {
                    break;
                }

                // Add the entered email to the HashSet
                emailSet.add(email);
            }

            // Close the Scanner
            scanner.close();

            // Convert the HashSet to an array
            String[] emails = emailSet.toArray(new String[0]);

            // Call the numUniqueEmails method and print the result
            int uniqueEmailsCount = numUniqueEmails(emails);
            System.out.println("Number of unique emails: " + uniqueEmailsCount);
        }
}


