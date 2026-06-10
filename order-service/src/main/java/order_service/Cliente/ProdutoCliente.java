package order_service.Cliente;

import order_service.dto.ProdutoResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ProdutoCliente {

    private final RestTemplate restTemplate;

    public ProdutoCliente(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ProdutoResponse buscarProduto(Long id) {
        return restTemplate.getForObject(
                "http://localhost:8081/produto/" + id,
                ProdutoResponse.class
        );
    }
}
