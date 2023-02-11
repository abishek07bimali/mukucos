package com.example.cosmetic.Pojo;
import com.example.cosmetic.Entity.Order;
import com.example.cosmetic.Entity.User;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderPojo {
    private Integer id;

    private String quantity;
    private  String address;
    private  int product_id;
    private  int user_id;



    public OrderPojo(Order order) {
        this.id=order.getId();
        this.quantity=order.getQuantity();
        this.address=order.getAddress();
        this.product_id=order.getProduct_id().getId();
        this.user_id=order.getUser_id().getId();
    }
}
