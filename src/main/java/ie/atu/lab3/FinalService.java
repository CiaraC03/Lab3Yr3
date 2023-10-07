package ie.atu.lab3;

public class FinalService {
    public String finalMessage(User user)
    {
        String message = "Thank you " + user.getName() + ". Your message has been received!";
        return message;
    }
}
