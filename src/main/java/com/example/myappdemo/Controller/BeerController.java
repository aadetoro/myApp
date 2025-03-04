package com.example.myappdemo.Controller;
import com.example.myappdemo.Model.Beer;
import com.example.myappdemo.Service.BeerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api/beer")
public class BeerController {

    private final BeerService beerService;

    @GetMapping("/{id}")
    public Beer getBeerById() {
        return new Beer(getBeerById().getId(), "trophy",12.9);
    }

    @PostMapping
    public Beer createBeer(@RequestBody Beer beer) {
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
