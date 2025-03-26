package projeto.nuvem.projetoNuvem.Controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import projeto.nuvem.projetoNuvem.Entities.Product;

@RestController
@CrossOrigin
public class ProductController {
    Product[] products = {
            new Product("Sabonete Dove", "Sabonete hidratante para pele sensível", "https://example.com/dove.jpg", "Dove", "2025-12-31", "Higiene Pessoal"),
            new Product("Arroz Tio João", "Arroz branco tipo 1, 5kg", "https://example.com/arroz.jpg", "Tio João", "2026-01-10", "Alimentos"),
            new Product("Coca-Cola 2L", "Refrigerante sabor cola", "https://example.com/coca.jpg", "Coca-Cola", "2025-06-01", "Bebidas"),
            new Product("Creme Dental Colgate", "Creme dental branqueador", "https://example.com/colgate.jpg", "Colgate", "2026-03-20", "Higiene Bucal"),
            new Product("Detergente Ypê", "Detergente neutro 500ml", "https://example.com/ype.jpg", "Ypê", "2026-05-05", "Limpeza"),
            new Product("Leite Italac", "Leite integral UHT 1L", "https://example.com/leite.jpg", "Italac", "2025-04-15", "Laticínios")
    };

    @GetMapping("/products")
    public Product[] getProducts() {
        return products;
    }
}
