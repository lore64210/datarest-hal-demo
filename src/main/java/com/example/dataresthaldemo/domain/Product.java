package com.example.projectBase.domain;

import lombok.Data;
import javax.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;



@Data
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @CreationTimestamp
    private LocalDateTime fechaCreacion;

    
	private String code;

	private String name;

	private String description;

}
