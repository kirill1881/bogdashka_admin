package com.example.bogdashka_admin.repos;

import com.example.bogdashka_admin.models.BuyModel;
import com.example.bogdashka_admin.models.DataModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepo extends JpaRepository<DataModel, Long> {
}
