package ua.com.shop_course_371.shop_course_371.entity;

import lombok.*;
import java.math.BigDecimal;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Product {
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private String image;
    private Category category;
    private List<ProductHasOrder> orderList;
    private List<AttributeHasProducts> productsList;
}
