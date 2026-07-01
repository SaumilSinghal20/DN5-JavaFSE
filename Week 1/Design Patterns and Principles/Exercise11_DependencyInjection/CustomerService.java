public class CustomerService {
    private CustomerRepository repo;

    // dependency is injected through constructor
    public CustomerService(CustomerRepository r) {
        this.repo = r;
    }

    public void printCustomerName(int id) {
        String c = repo.findCustomerById(id);
        System.out.println("Found customer: " + c);
    }
}
