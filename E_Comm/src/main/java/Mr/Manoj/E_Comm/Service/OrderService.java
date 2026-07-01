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
}
