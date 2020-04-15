package azazel.hu;


import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void szamolOsszeadas() {
        Calculator calculator = new Calculator();
        double result = 5.0+5.0;
        double szamolResult = calculator.szamol(5,5,"+");
        Assert.assertEquals(result, szamolResult, 0);
    }
    @Test
    public void szamolKivonas() {
        Calculator calculator = new Calculator();
        double result = 5.0-2.0;
        double szamolResult = calculator.szamol(5,2,"-");
        Assert.assertEquals(result, szamolResult, 0);
    }
    @Test
    public void szamolSzorzas() {
        Calculator calculator = new Calculator();
        double result = 5.0*5.0;
        double szamolResult = calculator.szamol(5,5,"*");
        Assert.assertEquals(25, szamolResult, 0);
    }
    @Test
    public void szamolOsztas() {
        Calculator calculator = new Calculator();
        double result = 5.0/ 2.0;
        double szamolResult = calculator.szamol(5,2,"/");
        Assert.assertEquals(result, szamolResult, 0);
    }
    @Test
    public void szamolOsztasIfYNull() {
        Calculator calculator = new Calculator();
        double result = 5.0/0.0;
        double szamolResult = calculator.szamol(5,0,"/");
        Assert.assertEquals(result, szamolResult, 0);
        Assert.assertEquals(calculator.getResult(), calculator.szamol(5,0,"/"),0);
    }
    @Test
    public void getResult() {
        Calculator calculator = new Calculator();
        double result = calculator.szamol(3,2,"+");
        Assert.assertEquals(result, calculator.getResult(), 0);
    }
}