package alekssandher.api_rest_java.model;

import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "tb_card")
public class Card {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;
    
    @Column(name = "available_limit", precision = 13, scale = 2)
    private BigDecimal limit;


}