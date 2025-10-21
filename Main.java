public class Main {

   public static void main(String []args) {

      /*  CODECOLLAB HINT: I use spacing between lines of code intentionally 
       *  to help you isolate a section to focus on for your discussion post! 
       */

      // *** STRING CREATION & CONCATENATION ***
      System.out.println("--- STRINGS ---");

      String scroll1 = "The treasure lies beyond the mountains.";
      String scroll2 = "Beware of the dragon's lair!";
      String secretMessage = new String("The treasure lies beyond the mountains.");
      
      System.out.println("📜 Scroll 1 says: " + scroll1);
      System.out.println("📜 Scroll 2 says: " + scroll2);

      // *** STRING CLASS METHODS ***
      System.out.println("\n--- STRING METHODS ---");

      int lengthScroll1 = scroll1.length();
      System.out.print(lengthScroll1);
      System.out.println(" characters in Scroll 1");

      System.out.print( scroll2.length() );
      System.out.println(" characters in Scroll 2");

      String location = scroll1.substring(18, 38);
      System.out.println("\n Location from Scroll 1: " + location); 

      String warning = scroll2.substring(14);
      System.out.println(" Hidden warning in Scroll 2: " + warning);

      int treasureIndex = scroll1.indexOf("treasure");
      System.out.println("\n Position of 'treasure' in Scroll 1: " + treasureIndex);

      int dragonIndex = scroll1.indexOf("dragon");
      System.out.println(" Position of 'dragon' in Scroll 1: " + dragonIndex);

      System.out.println("\n Does Scroll 1 match the secret message?: " + scroll1.equals(secretMessage));
      System.out.println(" Does Scroll 2 match the secret message?: " + scroll2.equals(secretMessage));

      System.out.println("\n Comparing Scroll 1 to Scroll 2: " + scroll1.compareTo(scroll2));
      System.out.println(" Comparing Scroll 2 to Scroll 1: " + scroll2.compareTo(scroll1));

      // CHALLENGE SECTION: Mixing up methods...
      System.out.println("\n--- CHALLENGE SECTION ---");

      String scroll3 = "Legends claim the treasure has magic abilities...";
      System.out.println("📜 Scroll 3 says: " + scroll3);

      int magicIndex = scroll3.indexOf("magic");
      int magicLength = "magic".length();
      String magicWord = scroll3.substring(magicIndex, magicIndex + magicLength);

      System.out.println("🪄  Special word: " + magicWord.toUpperCase() );
      
   }
}
