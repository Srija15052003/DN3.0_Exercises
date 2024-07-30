public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Customer findCustomerById(String customerId) {
        // Simulate database lookup
        return new Customer(customerId, "John Doe", "johndoe@example.com");
    }
}
