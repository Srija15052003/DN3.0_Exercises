/*import java.util.List;

public class Library {
    public static Book linearSearchByTitle(List<Book> books, String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null; // Book not found
    }
}*/


import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class Library {
    public static Book binarySearchByTitle(List<Book> books, String title) {
        Collections.sort(books, Comparator.comparing(Book::getTitle));

        int left = 0;
        int right = books.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int compare = books.get(mid).getTitle().compareToIgnoreCase(title);

            if (compare == 0) {
                return books.get(mid);
            } else if (compare < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null; // Book not found
    }
}
