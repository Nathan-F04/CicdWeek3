package ie.atu.week3cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping
    public String getProducts()
    {
        return "products";
    }
}
