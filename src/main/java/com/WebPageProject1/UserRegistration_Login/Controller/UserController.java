package com.WebPageProject1.UserRegistration_Login.Controller;

import com.WebPageProject1.UserRegistration_Login.Dto.UserDto;
import com.WebPageProject1.UserRegistration_Login.Service.CustomUserDetailsService;
import com.WebPageProject1.UserRegistration_Login.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private CustomUserDetailsService customUserDetailsService;

    @GetMapping("/registration")
    public String getRegistrationPage(@ModelAttribute("user") UserDto userDto){

        return "registration";}

        @PostMapping("/registration")
        public String saveUser(@ModelAttribute("user")UserDto userDto,Model model){
            userService.save(userDto);
            model.addAttribute("message","Registered Successfully");
            return "registration";
    }
@GetMapping("/login")
    public String login(@ModelAttribute("user")UserDto userDto){
        return "login";
}
    }
