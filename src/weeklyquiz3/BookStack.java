package weeklyquiz3;

import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;

public class BookStack<T> {
    Stack<Book<T>> books;

    public BookStack() {
        this.books = new Stack<>();
    }

    // book을 books 스택에 추가
    public void pushBook(Book<T> book) {
        books.push(book);
    }

    // books 스택의 맨 위에 있는 book을 빼서 반환
    // books가 비어있으면 EmptyStackException을 던짐
    public Book<T> popBook() throws EmptyStackException {
        return books.pop();
    }

    // books 스택의 맨 위에 있는 book을 반환
    // books가 비어있으면 EmptyStackException을 던짐
    public Book<T> peekBook() throws EmptyStackException {
        return books.peek();
    }

    // 스택이 비어있는지 검사
    public boolean isEmpty() {
        return books.isEmpty();
    }

    // 전체 books 스택을 출력
    public void printBooks() {
        for (Book<T> tBook : books) {
            System.out.println("책 제목: " + tBook.getTitle() + " \t저자: " + tBook.getAuthor() +
                    " \t식별자: " + tBook.getIdentifier());
        }
    }

}
