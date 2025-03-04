package com.example.myappdemo.Service;

import com.example.myappdemo.Model.Beer;
import com.example.myappdemo.Repository.BeerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeerService {

    private final BeerRepository beerRepository;

    public BeerService(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    public String findBeerById(Long id) {
        return "Beer found with ID: " + id;
    }

    public Beer saveBeer(Beer beer) {
        Beer newBeer  = new Beer();
        newBeer.setName(beer.getName());
        newBeer.setAlcoholContent(beer.getAlcoholContent());
        beerRepository.save(newBeer);
        return newBeer;
    }   public List<Beer> getAllBeers() {

        List<Beer> beers = beerRepository.findAll();
        return beers;
    }

    public Beer updateBeer(Long id, Beer beer) {
        return beer;
    }

    public void deleteBeer(Long id) {
        return;
    }
}

