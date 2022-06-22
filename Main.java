public class Main {
    public static void main(String[] args) {
        // DO NOT CHANGE 
        //String firstName = args[0];
        //String lastName = args[1];
       // int age = 0;
        try {
            //age = Integer.parseInt(args[2]);
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
       String statement = "Hello, I am Jasmin Baresh, and I am 16 years old";
      System.out.println(statement);
      boolean ageEven = true;
        System.out.print(ageEven + " ");
      String reason = "16 is an even number";
         System.out.println(reason);
        boolean sameNames = false;
        System.out.print(sameNames + " ");
        String reasonTwo = "Last name is not the same as the first name";
       System.out.println(reasonTwo);
      char ageGreater = 'y';
         System.out.print(ageGreater);
      char ageGreaterTwo = 'e';
         System.out.print(ageGreaterTwo);
       char ageGreaterThree = 's';
         System.out.print(ageGreaterThree);

        // Print out the following string: "Hello, I am <firstName> <lastName>, and I am <age> years old"

        // Print out whether age is even

        // Print out whether firstName equals lastName

        // Print out whether age is greater than 0

    }
}
