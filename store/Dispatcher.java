package store;

//dispatcher that gives the user the correct view based off of recieved request.

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
