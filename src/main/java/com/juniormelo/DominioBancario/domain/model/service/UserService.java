package com.juniormelo.DominioBancario.domain.model.service;

import com.juniormelo.DominioBancario.domain.model.User;
import com.juniormelo.DominioBancario.domain.model.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    private UserRepository repository;
    public UserService(UserRepository repository) {
        this.repository = repository;
    }
    public List<User>create(User user) {
        repository.save(user);
        return read();
    }
    public List<User> read(){
        return  repository.findAll();
    }
    public List<User> update(User user){
        repository.save(user);
        return read();
    }
    public List<User>delete(Long id){
        repository.deleteById(id);
        return read();
    }
}
