package com.example.bogdashka_admin.repos;

import com.example.bogdashka_admin.models.BuyModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface BuyRepo extends JpaRepository<BuyModel, Long> {
}
