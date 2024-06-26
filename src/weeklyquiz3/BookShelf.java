package weeklyquiz3;

import java.util.ArrayList;
import java.util.List;

public class BookShelf<T> implements BookManager<T> {
    // Book 배열
    private List<Book<T>> books;

    public BookShelf() {
        this.books = new ArrayList<>();
    }

    // 매개변수로 전달받은 Book을 리스트에 추가
    @Override
    public void addBook(Book<T> book) {
        books.add(book);
    }

    // 리스트에서 book 삭제 -> 리스트에 해당 book이 없어도 아무일도 일어나지 않음
    @Override
    public void removeBook(Book<T> book) {
        if (books.remove(book)) {
            System.out.println("Book 삭제");
            book.printBook();
        }
    }

    // 제목으로 book 검색
    @Override
    public List<Book<T>> searchByTitle(String title) {
        List<Book<T>> returnList = new ArrayList<>();
        // 대소문자 구별 X -> 각 제목들을 소문자로 만들어 포함여부 검색 -> 부분 일치도 결과에 포함
        for (Book<T> book : books) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                returnList.add(book);
            }
        }
        return returnList;
    }

    // 작가로 book 검색
    @Override
    public List<Book<T>> searchByAuthor(String author) {
        List<Book<T>> returnList = new ArrayList<>();
        // 제목으로 검색과 같이 소문자로 만들어 포함 여부 검색
        for (Book<T> book : books) {
            if (book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                returnList.add(book);
            }
        }
        return returnList;
    }

    // books 리스트를 반환하는 getter
    public List<Book<T>> getBooks() {
        return books;
    }

    // 전체 books 리스트를 출력
    public void printBooks() {
        System.out.println("\n==현재 도서 목록==");
        for (Book<T> tBook : books) {
            System.out.println("책 제목: " + tBook.getTitle() + " \t저자: " + tBook.getAuthor() +
                    " \t식별자: " + tBook.getIdentifier());
        }
    }
    // 전달받은 리스트가 비어있지 않으면 출력
    public void printBooks(List<Book<T>> bookList) {
        if (bookList.isEmpty()){
            System.out.println("서고에 책이 없습니다.");
        } else {
            for (Book<T> tBook : bookList) {
                System.out.println("책 제목: " + tBook.getTitle() + " \t저자: " + tBook.getAuthor() +
                        " \t식별자: " + tBook.getIdentifier());
            }
        }
    }
}
