import static org.junit.Assert.*;
import org.junit.*;
import CalculatorManagement.*;

public class CalculatorTest{

  Calculator calculator;

  @Before
  public void before(){
    calculator = new Calculator(); 
  }

  // Add user values
  @Test 
  public void canAddValues(){
    assertEquals(calculator.add(3, 4), 7, 0.001);
  }

  @Test
  public void canAddOneMinusValueToPositiveValue(){
    assertEquals(calculator.add(-3, 9), 6, 0.001 );
  }

  @Test
  public void canAddTwoMinusValues(){
    assertEquals(calculator.add(-34, -12), -46, 0.001 );
  }

  @Test
  public void canAddDecimalValueToPositiveValue(){
    assertEquals(calculator.add(1.5f, 5), 6.5, 0.001);
  }

  @Test
  public void canAddTwoDecimalValues(){
    assertEquals(calculator.add(36.6f, 7.9f), 44.5, 0.001);
  }

  @Test
  public void canAddMinusDecimalValueToPositiveValue(){
    assertEquals(calculator.add(-30.7f, 9), -21.7f, 0.001);
  }

  @Test 
  public void canAddMinusDecimalValues(){
    assertEquals(calculator.add(-58.12f, -26.6f), -84.72, 0.001);
  }


 // Subtract user inputs
  @Test 
  public void canSubtractValues(){
    assertEquals(calculator.subtract(10, 5), 5, 0.001);
  }

  @Test
  public void canSubtractOneMinusValueFromPositiveValue(){
    assertEquals(calculator.subtract(-200, 5), -205, 0.001);
  }

  @Test
  public void canSubtractTwoMinusValues(){
    assertEquals(calculator.add(-55, -45), -100, 0.001 );
  }

  @Test
  public void canSubtractDecimalValueFromPoistiveValue(){
    assertEquals(calculator.subtract(21, 0.65f), 20.35, 0.001);
  }

  @Test
  public void canSubtractTwoDecimalValues(){
    assertEquals(calculator.subtract(100.7f, 5.8f), 94.89, 0.01);
  }

  @Test
  public void canSubtractMinusDecimalValueToPositiveValue(){
    assertEquals(calculator.subtract(-1000.71f, 19), -1019.71, 0.001);
  }

  @Test 
  public void canSubtractMinusDecimalValues(){
    assertEquals(calculator.subtract(-90.9f, -22.6f), -68.30, 0.001);
  }


 // Multiply user inputs
  @Test 
  public void canMultiplyValues(){
    assertEquals(calculator.multiply(10, 2), 20, 0.001);
  }

  @Test
  public void canMultiplyOneMinusValueToPostiveValue(){
    assertEquals(calculator.multiply(-4, 50), -200, 0.001);
  }

  @Test
  public void canMultiplyTwoMinusValues(){
    assertEquals(calculator.multiply(-7, -9), 63, 0.001);
  }

  @Test
  public void canMultiplyDecimalValueFromPoistiveValue(){
    assertEquals(calculator.multiply(87, 0.10f), 8.69f, 0.1);
  }

  @Test
  public void canMultiplyTwoDecimalValues(){
    assertEquals(calculator.multiply(100.7f, 5.5f), 553.85, 0.01);
  }

  @Test
  public void canMultiplyMinusDecimalValueToPositiveValue(){
    assertEquals(calculator.multiply(-270.71f, 5), -1353.54, 0.01);
  }

  @Test 
  public void canMultiplyMinusDecimalValues(){
    assertEquals(calculator.multiply(-64.75f, -0.6f), 38.85, 0.001);
  }


 // Divide user inputs
  @Test 
  public void canDivideValues(){
    assertEquals(calculator.divide(9, 3), 3, 0.001);
  }

  @Test
  public void canDivideOneMinusValueToPostiveValue(){
    assertEquals(calculator.divide(-400, 100), -4, 0.001);
  }

  @Test
  public void canMultiplyTwoDivideValues(){
    assertEquals(calculator.divide(-21, -7), 3, 0.001);
  }

  @Test
  public void canDivideDecimalValueFromPoistiveValue(){
    assertEquals(calculator.divide(10, 0.10f), 100, 0.001);
  }

  @Test
  public void canDivideTwoDecimalValues(){
    assertEquals(calculator.divide(45.9f, 0.3f), 153, 0.01);
  }

  @Test
  public void canDivideMinusDecimalValueToPositiveValue(){
    assertEquals(calculator.divide(-654.7f, 5), -130.94, 0.01);
  }

  @Test 
  public void canDivideMinusDecimalValues(){
    assertEquals(calculator.divide(-9594.5f, -5.3f), 1810.282, 0.001);
  }
  
  


}

