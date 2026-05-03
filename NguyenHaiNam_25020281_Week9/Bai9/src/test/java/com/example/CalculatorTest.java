package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @Test
    public void testLoggingOutput() {
        Calculator calculator = new Calculator();
        
        // Kịch bản 1: Chia hợp lệ -> Sẽ sinh ra log INFO
        calculator.divide(20, 5);
        
        // Kịch bản 2: Chia cho 0 -> Sẽ sinh ra log INFO (bắt đầu) và ERROR (ngoại lệ)
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });
    }
}