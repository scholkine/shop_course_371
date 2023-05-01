package ua.com.shop_course_371.shop_course_371.entity;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class ProductHasOrder {
    private Long id;
    private Product product;
    private Order order;
    private int quantity;
}
