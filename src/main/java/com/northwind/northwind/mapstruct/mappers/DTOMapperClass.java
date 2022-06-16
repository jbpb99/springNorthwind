package com.northwind.northwind.mapstruct.mappers;

import com.northwind.northwind.dto.OrderDetailDto;
import com.northwind.northwind.dto.OrderDto;
import com.northwind.northwind.dto.ProductDto;
import com.northwind.northwind.dto.ShipperDto;
import com.northwind.northwind.entities.Order;
import com.northwind.northwind.entities.OrderDetail;
import com.northwind.northwind.entities.Product;
import com.northwind.northwind.entities.Shipper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DTOMapperClass {

    //Values that will be shown to user from Orders
    public static OrderDto orderInfo(Order order) {
        OrderDto orders = new OrderDto();

        orders.setOrder_id(order.getOrder_id());
        orders.setOrderDate(order.getOrderDate());
        orders.setEmployee(order.getEmployee().getEmployee_id());

        return orders;
    }

    //Values that will be shown to user from OrderDetails
    public static OrderDetailDto orderDetailDto(OrderDetail orderDetail) {
        OrderDetailDto detailDto = new OrderDetailDto();

        detailDto.setOrderDetailId(orderDetail.getOrderDetailId());
        detailDto.setOrder(orderDetail.getOrder().getOrder_id());
        detailDto.setProduct(orderDetail.getProduct().getProduct_id());
        detailDto.setProductName(orderDetail.getProduct().getProductName());
        detailDto.setQuantity(orderDetail.getQuantity());

        return detailDto;

    }

    //Values that will be shown to user from Products
    public static ProductDto productDto(Product product) {
        ProductDto productDto = new ProductDto();

        productDto.setProduct_id(product.getProduct_id());
        productDto.setProductName(product.getProductName());
        productDto.setUnit(product.getUnit());
        productDto.setPrice(product.getPrice());
        productDto.setCategory(product.getCategory().getCategory_id());
        productDto.setSupplier(product.getSupplier().getSupplier_id());

        return productDto;
    }

    //Values that will be shown to user from Shippers
    public static ShipperDto shipperDto(Shipper shipper) {
        ShipperDto shipperDto = new ShipperDto();

        shipperDto.setShipper_id(shipper.getShipper_id());
        shipperDto.setShipperName(shipper.getShipperName());
        shipperDto.setPhone(shipper.getPhone());

        return shipperDto;
    }

}
