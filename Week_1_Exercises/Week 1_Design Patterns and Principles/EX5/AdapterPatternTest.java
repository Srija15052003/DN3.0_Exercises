public class AdapterPatternTest {
    public static void main(String[] args) {
        // Create instances of the payment gateways
        PayPal payPal = new PayPal();
        Stripe stripe = new Stripe();
        Square square = new Square();

        // Create adapters for the payment gateways
        PaymentProcessor payPalAdapter = new PayPalAdapter(payPal);
        PaymentProcessor stripeAdapter = new StripeAdapter(stripe);
        PaymentProcessor squareAdapter = new SquareAdapter(square);

        // Process payments using the adapters
        System.out.println("Using PayPal Adapter:");
        payPalAdapter.processPayment(100.0);

        System.out.println("Using Stripe Adapter:");
        stripeAdapter.processPayment(200.0);

        System.out.println("Using Square Adapter:");
        squareAdapter.processPayment(300.0);
    }
}
