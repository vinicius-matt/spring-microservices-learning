package order_service.dto;

public record OrderDetalhesResponse(
        Long id,
        Integer quantidade,
        ProdutoResponse produto
) {

}
