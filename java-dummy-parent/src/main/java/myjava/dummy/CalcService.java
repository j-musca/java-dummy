package myjava.dummy;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class CalcService {

    public int sum(int... numbers) {
        return Arrays.stream(numbers).sum();
    }
}
