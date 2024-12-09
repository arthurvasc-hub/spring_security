package tech.arthur.springsecurity.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "role_table")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "roleId")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private long roleId;

    @Column(nullable = false, length = 50)
    private String name;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users;


    public enum Values{

        ADMIN(1L),

        BASIC(2L);

        final long roleId;

        Values(long roleId){

            this.roleId = roleId;
        }

    }
}
