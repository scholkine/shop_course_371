package ua.com.shop_course_371.shop_course_371.entity;

import lombok.*;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Users {
    private Long id;
    private String username;
    private String password;
    private Roles roles;
    private Set<Roles> rolesSet;
}
