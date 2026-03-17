package kr.ac.kopo.pcu.bookmarket.repository;
import kr.ac.kopo.pcu.bookmarket.domain.Book;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
@Repository

public class BookRepositoryImpl implements BookRepository {
    private List<Book> listOfBooks = new ArrayList<Book>();

    public BookRepositoryImpl(){
        Book book1 = new Book();
        book1.setBookId("isbn1001");
        book1.setName("스프링 부트 완전정복");
        book1.setDescription("스프링 부트는 스프링을 기반으로 쉽고 빠르게 웹 애플리케이션을 개발할 수 있는 도구이다. 이 책에서는 스프링 부트의 기본 개념을 쉽게 이해하고 다양한 실습 예제로 빠르게 익힐 수 있다. 그리고 단계별 실습을 따라 하다 보면 도서 쇼핑몰 구축 프로젝트를 완성할 수 있다. 개념-실습-프로젝트의 3단계 학습으로 스프링 부트를 제대로 익힌다면 개발 시간을 단축하고 생산성을 높일 수 있는 개발자로 성장할 수 있다.");
        book1.setPublisher("길벗캠퍼스");
        book1.setCategory("IT전문서");
        book1.setAuthor("송미영");
        book1.setUnitPrice(new BigDecimal(35000));
        book1.setReleaseDate("2024/12/31");

        Book book2 = new Book();
        book2.setBookId("isbn1002");
        book2.setName("인간 실격");
        book2.setDescription("불안한 청춘의 통과 의례와도 같은 소설");
        book2.setPublisher("민음사");
        book2.setAuthor("디자이 오사무");
        book2.setCategory("고전소설");
        book2.setUnitPrice(new BigDecimal(20000));
        book2.setReleaseDate("2012/04/10");

        Book book3 = new Book();
        book3.setBookId("isbn1003");
        book3.setName("1984");
        book3.setDescription("21세기, 고도의 정보화 사회에 던지는 조지 오웰의 경고\n" +
                "거대 지배 체제하에 놓인 개인은 어떻게 저항하고 어떻게 시스템에 의해 파멸되는가\n" +
                "세계가 나아갈 방향을 제시하는 탁월한 통찰");
        book3.setPublisher("민음사");
        book3.setAuthor("조지 오웰");
        book3.setCategory("고전소설");
        book3.setUnitPrice(new BigDecimal(22000));
        book3.setReleaseDate("2007/03/30");
        listOfBooks.add(book1);
        listOfBooks.add(book2);
        listOfBooks.add(book3);

    }
    @Override
    public List<Book> getAllBookList(){
        return listOfBooks;
    }
}
