package tech.arthur.springsecurity.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

@Data
@NoArgsConstructor
@Entity()
@Table(name = "post_table")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "post_id", unique = true)
    private long postId;

    @ManyToOne
    private User user;

    @Column(nullable = false, length = 250)
    private String content;

    @CreationTimestamp
    private Instant creationTimestamp;
}
