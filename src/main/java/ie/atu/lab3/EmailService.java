package ie.atu.lab3;

import org.springframework.stereotype.Service;

@Service
public class EmailService {
    public String sendEmail(String name, String email)
    {
        return "Welcome " + name + ". Your email is " + email;
    }

}
