package shop.example.shop.services;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClientService {
    public void addProduct(Integer...product);
}
