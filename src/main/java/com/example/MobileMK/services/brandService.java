package com.example.MobileMK.services;
import com.example.MobileMK.model.entity.BrandEntity;
import com.example.MobileMK.repository.brandRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BrandService {

    @Autowired
    BrandRepo brandRepo;
    @Override
    public List<brandEntitys> getAllBrands();{
        return brandRepo.getAllBrands();
    }

}
