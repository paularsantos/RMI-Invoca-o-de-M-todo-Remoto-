import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class Calcular extends UnicastRemoteObject implements I_Calcular {

  public Calcular() throws RemoteException {
    // super(); // is allways called!
  }

  private static final long serialVersionUID = 1L;

  public int multiplicacao(int n1, int n2) throws RemoteException {

    return n1 * n2;
  }

}