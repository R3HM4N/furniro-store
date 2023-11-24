package az.crocusoft.ecommerce.repository;

import az.crocusoft.ecommerce.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
    public List<Order> findByDate(LocalDate date);

}

