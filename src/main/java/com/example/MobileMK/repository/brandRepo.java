package com.example.MobileMK.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.MobileMK.model.entity.BrandEntity;
import org.springframework.stereotype.Repository;

public interface brandRepo extends JpaRepository<BrandEntity, Long>{
    @Query(value = "select b from BrandEntity b WHERE b.name LIKE %?1% or b.text LIKE %?1%")
    public  List<BrandEntity> findByKeyword(String keyword);


}


