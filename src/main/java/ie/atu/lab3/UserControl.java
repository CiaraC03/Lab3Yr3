package ie.atu.lab3;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControl {

    private UserService userService; //created an object of class UserService

    @Autowired
    public void SetUserService(UserService userService)
    {
        this.userService = userService;
    }

    @GetMapping("/registerUser/{name}/{email}")
    public String registration(@PathVariable String name, @PathVariable String email)
    {
        return userService.registerUser(name, email);
    }


}
