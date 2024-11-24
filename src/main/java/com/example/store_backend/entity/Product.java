package com.example.store_backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private @Getter int id;

    private @Getter @Setter String title;

    @Column( length = 100000 )
    private @Getter @Setter String description;

    private @Getter @Setter String category;

    private @Getter @Setter float price;

    private @Getter @Setter float rating;

    private @Getter @Setter int availableStock;

    @Override
    public String toString() {
        return "Product {" +
                "id=" + id +
                ", title='" +  title + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", price='" + price + '\'' +
                ", rating='" + rating + '\'' +
                ", availableStock='" + availableStock +
                '}';
    }
}