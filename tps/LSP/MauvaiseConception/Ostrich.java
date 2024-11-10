package tps.LSP.MauvaiseConception;

public class Ostrich extends Bird{

  @Override
  void fly() {
    // ostrich can't fly !!!
    throw new UnsupportedOperationException("Ostrich can't fly !");
  }
}
