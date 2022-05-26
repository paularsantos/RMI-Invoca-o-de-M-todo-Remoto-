import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Cliente {

  public static void main(String[] args) throws Exception {

    try {
      String objName = "rmi://localhost:1099/Calc";

      I_Calcular stub = (I_Calcular) Naming.lookup(objName);
      System.out.println("O Resultado da multiplicacao eh: " + stub.multiplicacao(9, 2));

    } catch (MalformedURLException | RemoteException | NotBoundException e) {

      e.printStackTrace();
    }

  }

}
