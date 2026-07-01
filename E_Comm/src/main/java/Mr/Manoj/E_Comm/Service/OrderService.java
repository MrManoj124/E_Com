package Mr.Manoj.E_Comm.Service;

import Mr.Manoj.E_Comm.Model.Order;
import Mr.Manoj.E_Comm.Model.Product;
import Mr.Manoj.E_Comm.Repository.OrderRepository;
import Mr.Manoj.E_Comm.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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


    public Order saveOrder(Order order){
        List<Product> fullProducts = new ArrayList<>();
        double total = 0;

        for(Product p : order.getProducts()){
            Product dbProduct = productRepo.findById(p.getProductId()).orElse(null);

            if(dbProduct == null){
                return  null;
            }

            fullProducts.add(dbProduct);
            total += dbProduct.getPrice();
        }
        if(total > 5000){
            total = total * 0.9;
        }

        order.setProducts(fullProducts);
        order.settotalAmount(total);
    }

    public Order getOrderById(String id){
        return orderRepo.findById(id).orElse(null);
    }

    public Order updateOrder(String id, Order order){
        Order existing = orderRepo.findById(id).orElse(null);

        if(existing != null){
            existing.setorderDate(order.getorderDate());
            if(order.getStatus().equals("PENDING")
            || order.getStatus().equals("CONFIRMED")
            || order.getStatus().equals("SHIPPED)"
            || order.getStatus().equals("DELIVERED")){
                existing.setStatus(order.getStatus());
            }

            existing.setCustomerEmail(order.getCustomerEmail());
            existing.setTotalAmount(order.getTotalAmount());
        }
    }

    public Order patchOrder(String id, Order order){
        Order existing = orderRepo.findById(id).orElse(null);

        if(existing != null){
            if(order.getorderDate() != null){
                existing.setorderDate(order.getorderDate());
            }

            if(order.getTotalAmount() > 0){
                existing.setTotalAmount(order.getTotalAmount());
            }

            if(order.getCustomerEmail() != null){
                existing.setCustomerEmail(order.getCustomerEmail());
            }

            if(order.getStatus() != null){
                existing.setStatus(order.getStatus());
            }

            return  orderRepo.save(existing);
        }
        return null;
    }

    public  String deleteOrder(String id){
        orderRepo.deleteById(id);
        return "Delete Order Successfully";
    }
}
