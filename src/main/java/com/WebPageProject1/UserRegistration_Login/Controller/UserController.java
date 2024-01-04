package com.WebPageProject1.UserRegistration_Login.Controller;

import com.WebPageProject1.UserRegistration_Login.Dto.UserDto;
import com.WebPageProject1.UserRegistration_Login.Service.CustomUserDetailsService;
import com.WebPageProject1.UserRegistration_Login.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.Principal;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private CustomUserDetailsService customUserDetailsService;

    @GetMapping("/registration")
    public String getRegistrationPage(@ModelAttribute("user") UserDto userDto){
        return "registration";}

        @PostMapping("/registration")
        public String saveUser(@ModelAttribute("user")UserDto userDto,Model model){
            userService.save(userDto);
            model.addAttribute("message","Registered Successfully");
            return "login";
    }
    @GetMapping("/login")
    public String getLoginPage(@ModelAttribute("user") UserDto userDto){
        return "login";}
    @PostMapping("/login")
    public String loginSuccess(Model model, Principal principal) {
        if (principal != null) {
            String username = principal.getName();
            // Your login logic here

            // Redirect to the user-page
            return "home";
        }

        // Handle the case when principal is null, maybe redirect to an error page
        return "login";
    }
//    @GetMapping("/home")
//    public String homePage(@ModelAttribute("user") UserDto userDto){
//
//        return "home";
//    }
    }
