package com.example.demomvcedoclass.service;

import com.example.demomvcedoclass.dto.CartDto;
import com.example.demomvcedoclass.dto.SignUp;
import com.example.demomvcedoclass.model.Carts;
import com.example.demomvcedoclass.model.Users;
import com.example.demomvcedoclass.repository.CartsRepository;
import com.example.demomvcedoclass.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService{
    private final UsersRepository usersRepository;
    private final CartsRepository cartsRepository;

    public ResponseEntity<Users> createUser(SignUp signUp){
        Users newUsers = new Users();
        newUsers.setFirstName(signUp.getFirstName());
        newUsers.setLastName(signUp.getLastName());
        newUsers.setUserName(signUp.getUserName());
        newUsers.setEmail(signUp.getEmail());
        newUsers.setPassword(signUp.getPassword());
        newUsers.setLocation(signUp.getLocation());

        Users savedUsers = usersRepository.save(newUsers);
        return  new ResponseEntity<>(savedUsers, HttpStatus.CREATED);
    }

    public ResponseEntity<Carts> addToCart(CartDto cartDto){
        Carts newCart = new Carts();
        newCart.setProductName(cartDto.getProductName());
        newCart.setProductQuantity(cartDto.getProductQuantity());
        newCart.setProductAmount(cartDto.getProductAmount());

        Carts addedCart = cartsRepository.save(newCart);
        return new ResponseEntity<>(addedCart,HttpStatus.CREATED);
    }
}
