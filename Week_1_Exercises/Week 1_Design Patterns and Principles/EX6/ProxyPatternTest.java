public class ProxyPatternTest {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        // Image will be loaded from the remote server and displayed
        image1.display();

        // Image will not be loaded again, it will be displayed directly from cache
        image1.display();

        // Image will be loaded from the remote server and displayed
        image2.display();

        // Image will not be loaded again, it will be displayed directly from cache
        image2.display();
    }
}
