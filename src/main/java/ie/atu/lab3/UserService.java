package ie.atu.lab3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private EmailService emailService;

    @Autowired
    public void UserService(EmailService emailService)
    {
        this.emailService = emailService;
    }

    public String registerUser(String name, String email)
    {
        //user registration logic

        //send confirmation email
        return emailService.sendEmail(name, email);
    }



}
