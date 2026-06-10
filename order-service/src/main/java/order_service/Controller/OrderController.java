package order_service.Controller;

import order_service.Cliente.ProdutoCliente;
import order_service.Entity.OrderEntity;
import order_service.Service.OrderService;
import order_service.dto.OrderDetalhesResponse;
import order_service.dto.ProdutoResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/OS")
public class OrderController {

    private final OrderService orderService;
    private final ProdutoCliente produtoCliente;

    public OrderController(ProdutoCliente produtoCliente, OrderService orderService) {
        this.orderService = orderService;
        this.produtoCliente = produtoCliente;
    }

    @PostMapping("/criar")
    public OrderEntity gerarOS(@RequestBody OrderEntity order) {
        return orderService.gerarOS(order);
    }

    @GetMapping("/listar")
    public List<OrderEntity> listarTodasOS() {
        return orderService.listarTodasOS();
    }

    @GetMapping("/{id}")
    public OrderEntity buscarOS(@PathVariable Long id) {
        return orderService.buscarOS(id);
    }

    @GetMapping("/detalhes/{id}")
    public OrderDetalhesResponse buscarDetalhes(@PathVariable Long id){
        return orderService.buscarDetalhes(id);
    }
}
