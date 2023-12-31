package com.WebPageProject1.UserRegistration_Login.Service;

import com.WebPageProject1.UserRegistration_Login.UserRepo.UserRepository;
import com.WebPageProject1.UserRegistration_Login.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(email);

        if(user == null){
            throw new UsernameNotFoundException("user not found");
        }
        return new CustomUserDetail(user);
    }
}
