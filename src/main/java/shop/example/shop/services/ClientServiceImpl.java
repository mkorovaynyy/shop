package shop.example.shop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.example.shop.model.Client;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService{

    private final Client client;

    public ClientServiceImpl(Client client) {
        this.client = client;
    }

    @Override
    public void addProduct(Integer... product) {
        for(int i = 0; i < product.length; i++) {
            client.getBasket().getList().add(product[i]);
        }
    }

    public Client getClient() {
        return client;
    }
    public List<Integer> getBasket() {
        return client.getBasket().getList();
    }
}
