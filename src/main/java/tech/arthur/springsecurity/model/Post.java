package tech.arthur.springsecurity.model;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

@Entity()
@Table(name = "post_table")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "postId")
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
