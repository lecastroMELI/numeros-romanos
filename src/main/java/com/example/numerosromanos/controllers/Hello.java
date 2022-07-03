package com.example.numerosromanos.controllers;

import com.example.numerosromanos.dto.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user") // INDICA QUE user É USADO PARA ACIONAR ESSE CONTROLLER
public class Hello {

    @GetMapping
    public String sayHelloWold() {
        return "Hello World";
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello";
    }

    @GetMapping("world")
    public String sayWorld() {
        return "World";
    }

    @GetMapping("/msg/{name}")
    public String showTheName(@PathVariable String name) {
        return "Hello World " + name + "!!";
    }

    @GetMapping("/cadastro")
    public String register(@RequestParam String name, @RequestParam int id) {
        return "Usuário: " + name + " seu id é: " + id;
    }


    // REFERENTE A CLASSE USER
    @PostMapping
    public String getUser(@RequestBody User user) {
        return "Usuário recebido - " + user.toString();
    }

    @PostMapping("/byid")
    public ResponseEntity<User> getUserById(@RequestBody User user) {
        if(user.getId() == 9090) {
            return new ResponseEntity(user, HttpStatus.OK);
        }
        return new ResponseEntity("BAD REQUEST", HttpStatus.BAD_REQUEST);
    }

    // RETORNAR APENAS A INFORMAÇÃO DESEJADA
    // RETORNA APENAS O NOME
    @PostMapping("/byid/name")
    public ResponseEntity<UserDto> getUserById_2(@RequestBody User user) {
        // valida pelo id
        if(user.getId() == 9090) {
            // cria um objeto userDto do tipo user
            UserDto userDto = new UserDto(user);
            // no retorno uso o objeto criado, para retornar o que está definido na classe UserDto, no nosso exemplo,
            // apenas o nome será retornado
            return new ResponseEntity(userDto, HttpStatus.OK);
        }
        return new ResponseEntity("BAD REQUEST", HttpStatus.BAD_REQUEST);
    }

}
