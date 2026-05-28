package mg.yoan.arith.controller;

import mg.yoan.arith.service.ArithService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArithController {

    private final ArithService arithService;

    public ArithController(ArithService arithService) {
        this.arithService = arithService;
    }

    @PostMapping("/add")
    public int add(@RequestBody Operands operands) {
        return arithService.Addition(operands.a(), operands.b());
    }

    public record Operands(int a, int b) {}
}
