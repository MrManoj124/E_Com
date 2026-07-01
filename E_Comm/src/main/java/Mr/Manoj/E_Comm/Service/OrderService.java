/* package Mr.Manoj.E_Comm.Service;

import Mr.Manoj.E_Comm.Model.Order;
import Mr.Manoj.E_Comm.Model.Product;
import Mr.Manoj.E_Comm.Repository.OrderRepository;
import Mr.Manoj.E_Comm.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private final ProductRepository productRepo;

    @Autowired
    private final OrderRepository orderRepo;

    public OrderService(OrderRepository orderRepo, ProductRepository productRepo){
        this.orderRepo=orderRepo;
        this.productRepo=productRepo;
    }


    public Order postOrder(Order order){
        double total = calculateTotal(order.getProducts());
        order.setTotalAmount(total);

        return orderRepo.save(order);
    }

    public double calculateTotal(List<Product> products){
        double total = 0;
        for (Product product : products);
        total += products.getPrice();

        if(total > 5000){
            total = total - (total - 0.10);
        }
        return total;
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

    public Order patchOrder(String id, Order order){
        Order existingOrder = orderRepo.findById(id).orElse(null);

        if(existingOrder != null){
            return null;
        }

        if(existingOrder.getCustomerEmail() != null){
            existingOrder.setCustomerEmail(order.getCustomerEmail());
        }

        if(existingOrder.getorderDate() != null){
            existingOrder.setorderDate(order.getorderDate());
        }

        return orderRepo.save(existingOrder);
    }
}
*/