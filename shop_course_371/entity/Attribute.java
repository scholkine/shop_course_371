package ua.com.shop_course_371.shop_course_371.entity;

import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Attribute {
    private Long id;
    private String name;
    private String description;
    private String unit;
    private List<AttributeHasProducts> productsList;
}
