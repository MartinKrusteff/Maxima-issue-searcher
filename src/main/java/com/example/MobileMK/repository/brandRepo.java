package com.example.MobileMK.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.MobileMK.model.entity.BrandEntity;

public interface brandRepo<brandEntity> extends JpaRepository<BrandEntity, Long>{
}
