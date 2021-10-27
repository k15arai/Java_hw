public class AlfredTest {
    /*
    * This main method will always be the launch point for a Java application.
    * For now, we are using the main to test all our AlfredQuotes methods.
    */
    public static void main(String[] args) {
        // Make an instance of AlfredQuotes to access all it's methods
        AlfredQuotes alfredBot = new AlfredQuotes();

        // Make some test greetings, providing necessary data
        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("Beth Kane", "evening");
        String testDateAnnouncement = alfredBot.dateAnnouncment();

        String alexisTest = alfredBot.respondBeforeAlexis(
            "Alexis! Play some low-fi beats."
        );
        String alfredTest = alfredBot.respondBeforeAlexis(
            "I can't find my yo-yo. Maybe Alfred will know where it is."
        );
        String notRelevantTest = alfredBot.respondBeforeAlexis(
            "Maybe that's what Batman is about. Not winning. But failing.."
        );
        String bonusTest = alfredBot.respondToAnExactString(
            "Where am I"
        );
        String bonusTest_2 = alfredBot.respondToAnExactString(
            "Have you seen my friend, Kenji"
        );
        String bonusTest_3 = alfredBot.respondToAnExactString(
            "I am having a moment of crisis, and it's your fault."
        );

        // Print the greetings to test
        System.out.println(testGreeting);

        // Uncomment these one at a time as you implement each method.
        System.out.println(testGuestGreeting);
        System.out.println(testDateAnnouncement);
        System.out.println(alexisTest);
        System.out.println(alfredTest);
        System.out.println(notRelevantTest);
        System.out.println(bonusTest);
        System.out.println(bonusTest_2);
        System.out.println(bonusTest_3);
    }
}