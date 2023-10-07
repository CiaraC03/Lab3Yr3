package ie.atu.lab3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestBody {

    private final FinalService finalService;

            @Autowired
            public RequestBody(FinalService finalService)
            {
                this.finalService = finalService;
            }

    @PostMapping("RegisterUserBody")
    @ResponseStatus(HttpStatus.CREATED)
    public String registerUserCredentials(@org.springframework.web.bind.annotation.RequestBody User user)
    {
        System.out.println("Name: " + user.getName());
        System.out.println("Email: "+ user.getEmail());
        return finalService.finalMessage(user);
    }


}
