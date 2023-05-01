package ua.com.shop_course_371.shop_course_371.entity;

import lombok.*;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Category {
    private Long id;
    private String name;
    private String description;
    private String image;
    private List<Product> productList;
}
