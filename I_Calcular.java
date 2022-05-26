import java.rmi.Remote;
import java.rmi.RemoteException;

public interface I_Calcular extends Remote {

  int multiplicacao(int n1, int n2) throws RemoteException;
}