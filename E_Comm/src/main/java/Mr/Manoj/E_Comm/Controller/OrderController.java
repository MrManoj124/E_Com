package Mr.Manoj.E_Comm.Controller;

import Mr.Manoj.E_Comm.Model.Order;
import Mr.Manoj.E_Comm.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public Order saveOrder(@RequestBody Order order){
        return orderService.saveOrder(order);
    }

    @GetMapping
    public List<Order> getAllOrder(){
        return orderService.getAllOrder();
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable String id){
        return orderService.getOrderById(id);
    }

    @PutMapping("/{id}")
    public Order updateOrder(@PathVariable String id, @RequestBody Order order){
        return orderService.updateOrder(id, order);
    }

    @PatchMapping("/{id}")
    public Order patchOrder(@PathVariable String id, @RequestBody Order order){
        return orderService.patchOrder(id, order);
    }

    @DeleteMapping("/{id}")
    public String deleteOrderById(@PathVariable String id){
        orderService.getOrderById(id);
        return "Delete the Order successfully";
    }

}
