package model;

import gui.CustomerGUI;
import gui.AdminGUI;

public class Customer extends User {
    public Customer(int id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public void showGUI() {
        new CustomerGUI(this);
    }
}

 class Admin extends User {
    public Admin(int id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public void showGUI() {
        new AdminGUI(this);
    }
}
