package ua.com.shop_course_371.shop_course_371.entity;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class AttributeHasProducts {
    private Long ID;
    private Attribute attribute;
    private Product product;
}
