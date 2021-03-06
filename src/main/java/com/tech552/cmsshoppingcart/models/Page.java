package com.tech552.cmsshoppingcart.models;

import lombok.Data;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity
@Table(name = "pages")
@Data
public class Page {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;
    private String slug;
    private String content;
    private int sorted;



}
