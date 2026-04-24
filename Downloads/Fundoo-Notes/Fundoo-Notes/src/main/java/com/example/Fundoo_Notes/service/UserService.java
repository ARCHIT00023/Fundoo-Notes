package com.example.Fundoo_Notes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Fundoo_Notes.dto.LoginDto;
import com.example.Fundoo_Notes.entity.User;

@Service
public class UserService {

@Autowired
private UserRepository userRepository;

public User register(User dto){

User user=new User();
user.setName(dto.getName());
user.setEmail(dto.getEmail());
user.setPassword(dto.getPassword());

return userRepository.save(user);

}

public String login(LoginDto dto){

User user=((Object) userRepository.findByEmail(dto.getEmail()))
.orElseThrow();

if(user.getPassword().equals(dto.getPassword())){
return "Login Successful";
}

return "Invalid Credentials";

}

}