public class DependencyInjectionExample {
    public static void main(String[] args) {
        // creating the dependency
        CustomerRepository myRepo = new CustomerRepositoryImpl();
        
        // injecting it into the service
        CustomerService service = new CustomerService(myRepo);
        
        service.printCustomerName(55);
    }
}
