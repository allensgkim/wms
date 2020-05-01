package com.brazil.cerp.domain.sample;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import lombok.*;

import java.math.BigDecimal;

@ToString
@Builder
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class SampleDto {

    @ApiParam(value = "member ID", required = true)
    @ApiModelProperty(notes = "The database generated product ID")
    private Integer id;

    @ApiParam(value = "Product ID")
    @ApiModelProperty(notes = "The application-specific product ID")
    private String productId;

    @ApiParam(value = "Description")
    @ApiModelProperty(notes = "The product description")
    private String description;

    @ApiParam(value = "Price")
    @ApiModelProperty(notes = "The price of the product")
    private BigDecimal price;
}
