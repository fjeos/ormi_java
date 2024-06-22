package weeklyquiz3;

import java.util.EmptyStackException;
import java.util.List;
import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        BookShelf<String> bookShelf = new BookShelf<>();
        BookStack<Integer> bookStack = new BookStack<>();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("제목, 저자, 식별자를 입력하세요. 0을 입력하면 종료됩니다.");
            String input = scanner.nextLine();
            if (input.equals("0")) break;
            String[] split = input.split(" ");
            String title = split[0];
            String author = split[1];
            String identifier = split[2];

            Book<String> book1 = new Book<>(title, author, identifier);
            Book<Integer> book2 = new Book<>(title, author, Integer.parseInt(identifier));

            bookShelf.addBook(book1);
            bookStack.pushBook(book2);
        }

        System.out.println();
        System.out.println("=========저자로 검색=========");
        List<Book<String>> bookList = bookShelf.searchByAuthor("LimTaeHo");
        if (bookList.isEmpty()) {
            System.out.println("해당 저자의 책이 없습니다.");
        } else {
            for (Book<String> book : bookList) {
                printBook(book);
            }
        }

        System.out.println();
        System.out.println("=========제목으로 검색=========");
        bookList = bookShelf.searchByTitle("Java");
        if (bookList.isEmpty()) {
            System.out.println("해당 제목의 책이 없습니다.");
        } else {
            for (Book<String> book : bookList) {
                printBook(book);
            }
        }

        System.out.println();
        System.out.println("=========삭제 테스트=========");
        bookShelf.removeBook(new Book<>("java", "java", "1234"));
        for (Book<String> book : bookShelf.getBooks()) {
            printBook(book);
        }

        System.out.println();
        System.out.println("=========pop() 테스트=========");
        try {
            Book<Integer> foundBook = bookStack.popBook();
            printBook(foundBook);
            System.out.println(bookStack.isEmpty());
        } catch (EmptyStackException e){
            System.out.println("서고에 책이 존재하지 않습니다.");
        }

        System.out.println();
        System.out.println("=========peek() 테스트=========");
        try {
            Book<Integer> foundBook = bookStack.peekBook();
            printBook(foundBook);
            System.out.println(bookStack.isEmpty());
        } catch (EmptyStackException e){
            System.out.println("서고에 책이 존재하지 않습니다.");
        } finally {
            scanner.close();
        }


    }

    private static void printBook(Book foundBook) {
        System.out.println("책 제목: " + foundBook.getTitle() + "  저자: " + foundBook.getAuthor() +
                "  식별자: " + foundBook.getIdentifier());
    }
}
