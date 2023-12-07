package store;

public class Dispatcher {
    
    AdminView adminView = new AdminView();
    CustomerView customerView = new CustomerView();

    Dispatcher() {

    }

    public void dispatch(String request) {
        if(request == "customer") {
            customerView.show();
        }

        else if(request == "admin") {
            adminView.show();
        }
    }
}
