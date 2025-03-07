package com.example.myappdemo.Controller;
import com.example.myappdemo.Model.Beer;
import com.example.myappdemo.Service.BeerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/beer")
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }


    @GetMapping("/{id}")
    public Beer getBeerById() {
        return new Beer(1L, "trophy",12.9);
    }

    // this is to get all the beers
    @GetMapping("/all")
    public List<Beer> getBeers() {
        return beerService.getAllBeers();
    }

    @PostMapping("/create")
    public Beer createBeer(@RequestBody  Beer beer) {
        return beerService.saveBeer(beer);
    }

    @PutMapping("/{id}")
    public Beer updateBeer(@PathVariable Long id, @RequestBody Beer beer) {
        return beerService.updateBeer(id, beer);
    }

    @DeleteMapping("/{id}")
    public void deleteBeer(@PathVariable Long id) {
        beerService.deleteBeer(id);
    }
}
