package ua.com.shop_course_371.shop_course_371.entity;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Address {
    private Long id;
    private String country;
    private String town;
    private String house;
    private Client client;
}
