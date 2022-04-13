package com.example.shark.repositry;

import com.example.shark.entity.Offers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OffersRepositry extends JpaRepository<Offers,String> {
}
