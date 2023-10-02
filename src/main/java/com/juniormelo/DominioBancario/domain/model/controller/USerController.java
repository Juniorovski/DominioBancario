package com.juniormelo.DominioBancario.domain.model.controller;

import com.juniormelo.DominioBancario.domain.model.User;
import com.juniormelo.DominioBancario.domain.model.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/users")
public class USerController {
private UserService service;

    public USerController(UserService service) {
        this.service = service;
    }
  @GetMapping
    List<User> list(User user){
      return service.read();
  }
  @PostMapping
  List<User>save(@RequestBody User user){
        return service.create(user);
  }
  @PutMapping
    List<User>update(@RequestBody User user){
        return service.update(user);
  }
  @DeleteMapping("/{id}")
    List<User>delete(@PathVariable("id") Long id){
        return service.delete(id);
    }


}
