package ru.kors.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(
        schema = "security",
        name = "authority"
)
public class Authority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
