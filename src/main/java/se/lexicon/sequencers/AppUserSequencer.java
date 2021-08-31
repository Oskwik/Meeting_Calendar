package se.lexicon.sequencers;

public class AppUserSequencer {

   private static int appUserId = 1;

   public static int appUserId(){
       return appUserId++;
    }
   public static void reset(){
       appUserId = 1;

   }

}
