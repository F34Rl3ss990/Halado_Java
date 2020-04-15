package azazel.hu;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


@ToString
@NoArgsConstructor
public class Calculator {
    @Getter
    private double result;

    public double szamol(double x, double y, String operator){
        if(operator.equals("+")){
            result = x+y;
            return result;
        } else if (operator.equals("-")){
            result = x-y;
            return result;
        } else if(operator.equals("*")){
            result = x*y;
            return result;
        } else if (operator.equals("/")&& y!=0){
            result = x/y;
            return result;
        }
        return 0;
    }
}
