package ua.com.shop_course_371.shop_course_371.entity;

import lombok.*;

import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Roles {
    private Long id;
    private String name;
    private Set<Users> usersSet;
}
