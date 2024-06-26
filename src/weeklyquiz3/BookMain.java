package weeklyquiz3;

import java.util.EmptyStackException;
import java.util.List;
import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        BookShelf<String> bookShelf = new BookShelf<>();
        BookStack<Integer> bookStack = new BookStack<>();

        Scanner scanner = new Scanner(System.in);
        // 무한 반복으로 책을 입력 받음
        while (true) {
            System.out.println("제목, 저자, 식별자를 입력하세요. 0을 입력하면 종료됩니다.");
            String input = scanner.nextLine();
            // 0이 입력되면 종료
            if (input.equals("0")) break;

            // 공백을 기준으로 제목, 저자, 식별자 구분
            String[] split = input.split(" ");
            String title = split[0];
            String author = split[1];
            String identifier = split[2];

            // 식별자로 String을 갖는 Book 객체와 int를 갖는 Book 객체를 각각 생성
            Book<String> book1 = new Book<>(title, author, identifier);
            Book<Integer> book2 = new Book<>(title, author, Integer.parseInt(identifier));

            // 각각의 Book 객체를 Shelf와 Stack에 넣음
            bookShelf.addBook(book1);
            bookStack.pushBook(book2);
        }
        scanner.close();

        System.out.println();


        System.out.println("=========저자로 검색=========");
        List<Book<String>> bookList = bookShelf.searchByAuthor("Caller");
        bookShelf.printBooks(bookList);


        System.out.println();


        System.out.println("=========제목으로 검색=========");
        bookList = bookShelf.searchByTitle("Java");
        bookShelf.printBooks(bookList);

        System.out.println();


        System.out.println("=========remove() 테스트=========");
        // 새 Book 객체를 생성하여 인자로 넘겨줌
        bookShelf.removeBook(new Book<>("java", "client", "1234"));

        // 책 삭제 후 전체 목록 출력
        bookShelf.printBooks();

        System.out.println();
        System.out.println("=========pop() 테스트=========");
        try {
            Book<Integer> foundBook = bookStack.popBook();
            // pop에 성공하면 제거한 Book을 출력하고, 전체 Book 리스트 출력
            System.out.print("삭제된 책 = ");
            foundBook.printBook();
            System.out.println("삭제 후");
            bookStack.printBooks();
        } catch (EmptyStackException e){
            System.out.println("서고에 책이 존재하지 않습니다.");
        }

        System.out.println();
        System.out.println("=========peek() 테스트=========");
        try {
            Book<Integer> foundBook = bookStack.peekBook();
            // peek에 성공하면 반환한 Book을 출력하고, 전체 Book 리스트 출력
            System.out.print("반환된 책 = ");
            foundBook.printBook();
            System.out.println("반환 후");
            bookStack.printBooks();
        } catch (EmptyStackException e){
            System.out.println("서고에 책이 존재하지 않습니다.");
        }

        System.out.println();
        System.out.println("=========isEmpty() 테스트=========");
        System.out.println(bookStack.isEmpty()? "서고에 책이 존재하지 않습니다." : "서고에 책이 존재합니다.");


    }

}
