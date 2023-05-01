package ua.com.shop_course_371.shop_course_371.entity;

import lombok.*;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Order {
    private Long id;
    private Date creationDate;
    private String delivery;
    private boolean orderStatus;
    private Client client;
    private List<ProductHasOrder> orderList;
}
