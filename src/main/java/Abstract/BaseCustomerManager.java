package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService{


    public void Save(Customer customer) {

        System.out.println("Saved to db : " + customer.FirstName + "" + customer.LastName);
    }
}



