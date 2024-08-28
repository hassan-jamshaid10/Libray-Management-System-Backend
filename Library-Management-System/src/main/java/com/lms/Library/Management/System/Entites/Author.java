//package com.lms.Library.Management.System.Entites;
//import jakarta.persistence.*;
//import lombok.*;
//
//import java.util.List;
//
//@Data
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
//@Entity
//@Table(name = "Bauthor")
//public class Author {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(nullable = false)
//    private String name;
//
//    @Column(length = 1000)  // Adjust length as needed
//    private String bio;
//
//    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Book> books;
//}
//
