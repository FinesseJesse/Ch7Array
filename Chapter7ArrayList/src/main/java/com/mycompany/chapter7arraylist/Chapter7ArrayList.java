/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.chapter7arraylist;

import java.util.*; 

/**
 *
 * @author jswai
 */
public class Chapter7ArrayList {

    /** Main method
     * @param args */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the total number of students
		System.out.print("Enter the nubmer of students: ");
                var s = input.nextInt();
                ArrayList<Integer> scores = new ArrayList<Integer>();
                while(scores.size() < s) scores.add(0);
		
                char[] grades = new char[scores.size()];
		/*ArrayList<String> grades = new ArrayList<>();
                grades.size() = scores.size();*/
                

		// Prompt the user to enter all the scores
		System.out.print("Enter " + scores.size() + " scores: ");
                for (int i = 0; i < scores.size(); i++) {
			scores.set(i, input.nextInt());
            }

		// Get grades
		getGrades(scores, grades);

		// Display results
		for (int i = 0; i < scores.size(); i++) {
			System.out.println("Student " + i + " score is " + 
                                scores.get(i) + " and grade is " + grades[i]);
		}
	}

	/** Method max returns the is highest score
     * @param array
     * @return  */
	public static int max(ArrayList<Integer> array) {
		int max = array.get(0);
		for (int i = 1; i < array.size(); i++) {
			if (array.get(i) > max)
				array.set(i, array.get(i));
		}
		return max;
	}

	/** Method getGrade assigns grades based on grading scheme
     * @param scores
     * @param grades */
	public static void getGrades(ArrayList<Integer> scores, char[] grades) {
		int best = max(scores);
		for (int i = 0; i < scores.size(); i++) {
			if (scores.get(i) >= best - 10)
				grades[i] = 'A';
			else if (scores.get(i) >= best - 20)
				grades[i] = 'B';
			else if (scores.get(i) >= best - 30)
				grades[i] = 'C';
			else if (scores.get(i) >= best - 40)
				grades[i] = 'D';
			else
				grades[i] = 'F';
		}
	} 
}