package com.syahirg.rest.webservices.restfulwebservices.post;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.syahirg.rest.webservices.restfulwebservices.user.User;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Post {

    @Id
    @GeneratedValue
    private Integer id;

    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private User user;
}
