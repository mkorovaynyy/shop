package shop.example.shop.controllers;

import org.springframework.web.bind.annotation.*;
import shop.example.shop.services.ClientServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class ClientController {

    private final ClientServiceImpl clientServiceImpl;

    public ClientController(ClientServiceImpl clientServiceImpl) {
        this.clientServiceImpl = clientServiceImpl;
    }

    @GetMapping(path = "/add", params = "idProduct")
    public void addProduct(@RequestParam("idProduct") Integer [] products) {
       clientServiceImpl.addProduct(products);
    }
    @GetMapping(path = "/get")
    public List<Integer> getProduct() {
        return clientServiceImpl.getBasket();
    }
}
