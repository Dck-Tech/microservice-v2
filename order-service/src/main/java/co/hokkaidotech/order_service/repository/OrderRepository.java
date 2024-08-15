package co.hokkaidotech.order_service.repository;

import co.hokkaidotech.order_service.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository <Order, Long>  {

}
