package com.example.myappdemo;

import com.example.myappdemo.Controller.BeerController;
import com.example.myappdemo.Model.Beer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootTest
public class BeerControllerTest {

    @Autowired
    BeerController beerController;

    void getBeerById(){
        System.out.println(beerController.getBeerById());
    }
}
