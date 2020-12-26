/* 
* ArrayBasicOperations.java
*
* Description:   Given an array of integer type with 10 elements, make a program that allows to perform
                 the 4 basic operations with this array: printing, updating, insertion and deletion.
                 At first, all elements of the array must be null
* Documentation: https://github.com/JoseCintra/DataStructures-Algorithms
* Language:      Java
* Author:        José Cintra
* Date:          2020, December
* License:       Unlicense, described in http://unlicense.org
* Obs:           In order to clarify the algorithm and improve the didactics, we did not validate the values
                 reported by the user, such as checking the acceptable value ranges. 
                 This is like exercise for the student.
*
*/

public class ArrayBasicOperations {
   public static void main(String[] args) {

      Integer[] intArray = { null, null, null, null, null, null, null, null, null, null };
      int op = 1; // Number of desired operation

      while (op != 0) {

         System.out.println("\n\nArray Basic Operations\n");

         System.out.println("0 - Exit");
         System.out.println("1 - Print");
         System.out.println("2 - Update");
         System.out.println("3 - Insert");
         System.out.println("4 - Delete\n");
         System.out.print("Choose a option --> ");

         op = Integer.parseInt(System.console().readLine());
         System.out.println(op);

         if (op == 1) {
            printArray(intArray);
         }
         if (op == 2) {
            updateArray(intArray);
         }
         if (op == 3) {
            insertArray(intArray);
         }
         if (op == 4) {
            deleteArray(intArray);
         }
      }

   }

   // Method to print an array
   private static void printArray(Integer[] intArray) {
      System.out.println("\nArray contents printed through method:");
      for (Integer val : intArray)
         System.out.print(val + " ");
   }

   // Method for changing the value of array element by its index
   private static void updateArray(Integer[] intArray) {
      System.out.println("Enter the index:");
      int index = Integer.parseInt(System.console().readLine());
      System.out.println("Enter the Value for that index:");
      int value = Integer.parseInt(System.console().readLine());
      intArray[index] = value;
   }

   // Method for inserting an element in the array in a position given by its index
   private static void insertArray(Integer[] intArray) {
      System.out.println("Enter the index:");
      int index = Integer.parseInt(System.console().readLine());
      System.out.println("Enter the Value to be inserted:");
      int value = Integer.parseInt(System.console().readLine());
      // Now shift rest of the elements. The last element will be lost
      for (int i = (intArray.length - 2); i >= index; i--) {
         intArray[i + 1] = intArray[i];
      }
      intArray[index] = value;
   }

   // Method for deleting a array element by its index
   private static void deleteArray(Integer[] intArray) {
      System.out.println("Enter the index:");
      int index = Integer.parseInt(System.console().readLine());
      // Now shift rest of the elements. The last element will be empty
      for (int i = index; i <= (intArray.length - 2); i++) {
         intArray[i] = intArray[i + 1];
      }
      intArray[intArray.length - 1] = null;
   }

}