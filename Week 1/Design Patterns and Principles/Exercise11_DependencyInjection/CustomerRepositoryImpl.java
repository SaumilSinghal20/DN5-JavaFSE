public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public String findCustomerById(int id) {
        // hardcoding a mock customer for demo purposes
        return "Customer_" + id;
    }
}
