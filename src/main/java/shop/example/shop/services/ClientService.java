package shop.example.shop.services;

import org.springframework.stereotype.Service;
import shop.example.shop.model.Basket;
import shop.example.shop.model.Client;

import java.util.List;

@Service
public interface ClientService {
    public void addProduct(Integer...product);
    public default List<Integer> getBasket(Client client) {
        return client.getBasket().getList();
    }
}
