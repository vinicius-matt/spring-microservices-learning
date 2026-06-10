package order_service.dto;

public record ProdutoResponse(
        Long id,
        String nome,
        Double preco
) {}