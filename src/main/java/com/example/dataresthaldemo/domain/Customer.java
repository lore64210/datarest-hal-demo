package com.example.projectBase.domain;

import lombok.Data;
import javax.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

import java.util.List;


@Data
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @CreationTimestamp
    private LocalDateTime fechaCreacion;

    
	private String names;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "products_id")
	private List<Product> productss;

}
