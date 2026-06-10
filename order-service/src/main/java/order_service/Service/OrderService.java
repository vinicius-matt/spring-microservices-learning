package order_service.Service;

import order_service.Cliente.ProdutoCliente;
import order_service.Entity.OrderEntity;
import order_service.Repository.OrderRepository;
import order_service.dto.OrderDetalhesResponse;
import order_service.dto.ProdutoResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;

@Service
public class OrderService {

    private OrderRepository orderRepository;
    private ProdutoCliente produtoCliente;

    public OrderService(OrderRepository orderRepository, ProdutoCliente produtoCliente) {
        this.orderRepository = orderRepository;
        this.produtoCliente = produtoCliente;
    }

    public OrderEntity gerarOS(OrderEntity orderEntity) {

        try {

            produtoCliente.buscarProduto(
                    orderEntity.getProdutoId()
            );

            return orderRepository.save(orderEntity);

        } catch (HttpClientErrorException.NotFound e) {

            throw new RuntimeException(
                    "Produto não encontrado"
            );
        }
    }
    public List<OrderEntity> listarTodasOS() {
        return orderRepository.findAll();
    }

    public OrderEntity buscarOS(Long id) {
        return orderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pedido não encontrado"));
    }

    public OrderDetalhesResponse buscarDetalhes(Long id) {
        OrderEntity order = buscarOS(id);
        ProdutoResponse produto =
                produtoCliente.buscarProduto(
                        order.getProdutoId()
                );

        return new OrderDetalhesResponse(
                order.getId(),
                order.getQuantidade(),
                produto
        );
    }

}