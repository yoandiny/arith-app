package mg.yoan.arith.service;

import org.springframework.stereotype.Service;

@Service
public class ArithService {

    public double Addition(double a, double b){
        return a + b;
    }

    public double Substract(double a, double b){
        return a - b;
    }

    public double Multiplication(double a, double b){
        return a * b;
    }
}
