import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return String.format("Hello, %s.Lovely to see you.",name);
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return "it is currently " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        int alexis = conversation.toLowerCase().indexOf("Alexis".toLowerCase());
        int alfred = conversation.toLowerCase().indexOf("Alfred".toLowerCase());
        if (alexis != -1){
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        else if(alfred != -1){
            return "At your service.";
        }
        return "Right. And with that I shall retire.";
    }
	// NINJA BONUS
	// See the specs to overload the guestGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

