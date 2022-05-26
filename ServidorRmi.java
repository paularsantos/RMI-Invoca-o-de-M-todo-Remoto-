import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServidorRmi {

  public static void main(String[] args) {
    try {
      // cria um objeto para se tornar acessivel via rede
      I_Calcular calc = new Calcular();
      String objName = "rmi://localhost/Calc";

      LocateRegistry.createRegistry(1099);
      Naming.rebind(objName, calc);

      System.out.println("Aguardando o cliente!");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}