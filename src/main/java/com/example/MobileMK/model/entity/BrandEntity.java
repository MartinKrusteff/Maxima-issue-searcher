package com.example.MobileMK.model.entity;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class BrandEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 300)
    public String name;

    @Column(nullable=false, length = 5000)
    public String text;
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }
    public static void addAttribute(String string, List<BrandEntity> findAll) {
        // TODO Auto-generated method stub

    }


}
