package calculadora;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICalculadora extends Remote {

    public double getValorA() throws RemoteException;


    public double getValorB() throws RemoteException;

    public void setValorA(double valorA) throws RemoteException;

    public void setValorB(double valorB) throws RemoteException;

    /**
     * Realiza a adição.
     *
     * @return Um valor real.
     */
    public double getSoma() throws RemoteException;

    /**
     * Realiza a subtração
     *
     * @return Um valor real.
     */
    public double getDiferenca() throws RemoteException;

    /**
     * Realiza a multiplicação.
     *
     * @return Um valor real.
     */
    public double getProduto() throws RemoteException;

    /**
     * Realiza a divisão.
     *
     * @return Um valor real.
     */
    public double getQuociente() throws RemoteException;
}
