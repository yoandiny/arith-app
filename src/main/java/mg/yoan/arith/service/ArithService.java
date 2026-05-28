package mg.yoan.arith.service;

import org.springframework.stereotype.Service;

@Service
public class ArithService {

    public int Addition(int a, int b){
        return a + b;
    }

    public int Substract(int a, int b){
        return a - b;
    }
}
