import java.util.Date;

public class AlfredQuotes {
    /* 
    * Inputs: None
    * Return Type: String
    * Description: Returns a generic greeting that Alfred will say to anyone.
    */
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }

    /*
    * Inputs: String name, String dayPeriod
    *                      Assume "morning", "afternoon", or "evening".
    * Return Type: String
    * Description: Returns a greeting that includes the person's name as well
    * as the day period. For example: "Good evening, Beth Kane. Lovely to see
    * you."
    * Tip: Try using the String.format method for string interpolation in Java
    */
    public String guestGreeting(String name, String dayPeriod) {
        // Your Code Here
        return String.format("Good evening, %s. Lovely to see you this %s.", name, dayPeriod);
    }
    /*
    * Inputs: None
    * Return Type: String
    * Description: Returns a polite announcement of the current date.
    */
    public String dateAnnouncment() {
        // Your Code Here
        Date date = new Date();
        return "The date is: " + date; 
    }

    /****************************
    Final Challenge!
    Alfred is listening. Write a method that accepts any string of conversation.
    If "Alexis" appears in the conversation return an obliging response, for example:
    "At your service. As you wish, naturally."

    If neither name is found, return an appropriate response, for instance:
    "Right. And with that I shall retire."
    *****************************/
    /* 
    * Inputs: String (A Conversation)
    * Return Type: String (Something Alfred would say in response)
    * Tip: Use the indexOf String method
    */
    public String respondBeforeAlexis(String conversation) {
        // Your Code Here
        if ( conversation.contains("Alexis") ) {
            return "At your service.";
        } else {
            return "Right. And with that I shall retire.";
        }
    }
    // Ninja Bonus
    // Write your own AlfredQuote method using any of the String methods you have learned!
    public String respondToAnExactString(String conversation) {
        if ( conversation.contentEquals("Where am I") ) {
            return "Please open the window and call for help.";
        } else if ( conversation.endsWith("Kenji") ) {
            return "Do you know my friend, Kenji?";
        } else {
            return "I have no words, my friend.";
        }
    }
}