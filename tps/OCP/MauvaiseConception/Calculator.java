package tps.OCP.MauvaiseConception;

public class Calculator {

  void Calculate( CalculatorOperation operation){

    if (operation instanceof Addition) {
      // addition
    } else if (operation instanceof Subtraction) {
      // substraction
    }

  }
}


class Addition extends CalculatorOperation { 
  double left, right, result; 
} 

class Subtraction extends CalculatorOperation { 
  double left, right, result;
}