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
    public double add(@RequestBody Operands operands) {
        if(operands.a() < 0 || operands.b() < 0){
            throw new IllegalArgumentException("The given nummber has to be positive");
        }
        return arithService.Addition(operands.a(), operands.b());
    }

    @PostMapping("/substract")
    public double substract(@RequestBody Operands operands) {
        return arithService.Substract(operands.a(), operands.b());
    }

    @PostMapping("/multiplication")
    public double multiplication(@RequestBody Operands operands) {
        return arithService.Multiplication(operands.a(), operands.b());
    }

    @PostMapping("/divide")
    public double divide(@RequestBody Operands operands) {
        if(operands.b() == 0){
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return arithService.Divide(operands.a(), operands.b());
    }

    public record Operands(double a, double b) {}
}
