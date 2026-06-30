package Mr.Manoj.E_Comm.Service;

import Mr.Manoj.E_Comm.Model.Order;
import Mr.Manoj.E_Comm.Repository.OrderRepository;
import Mr.Manoj.E_Comm.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService {



    @Autowired
    private final OrderRepository orderRepo;

    public OrderService(OrderRepository orderRepo){
        this.orderRepo=orderRepo;
    }

    public Order postOrd(Order order){
        return orderRepo.save(order);
    }

    public List<Order> getAllOrders(){
        return orderRepo.findAll();
    }

    public Order getOrderById(String id){
        return orderRepo.findById(id).orElse(null);
    }

    public String updateOrder(String id, Order newOrder){
        Order existOrder=getOrderById(id);
        if(existOrder != null){
            existOrder.setCustomerEmail(newOrder.getCustomerEmail());
            existOrder.setorderDate(newOrder.getorderDate());

            return orderRepo.save(existOrder);
        }
        return null;
    }

    public Order deleteOrder(String id){
        Order order = orderRepo.getOrderById(id);
        if(order != null){
            orderRepo.deleteById(id);
            return "Order deleted Successfully";
        }
        return "Order is null";
    }
}
