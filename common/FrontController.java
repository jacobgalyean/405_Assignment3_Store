package common;

import java.rmi.*;

public interface FrontController extends Remote {

    public void dispatchRequest(String accType);
}
