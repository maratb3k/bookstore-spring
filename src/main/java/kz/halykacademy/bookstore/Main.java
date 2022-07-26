package kz.halykacademy.bookstore;

import kz.halykacademy.bookstore.DTOs.Book;
import kz.halykacademy.bookstore.DTOs.Publisher;
import kz.halykacademy.bookstore.providers.AuthorProviderRealization;
import kz.halykacademy.bookstore.providers.BookProviderRealization;
import kz.halykacademy.bookstore.providers.PublisherProviderRealization;
import kz.halykacademy.bookstore.services.BookServiceRealization;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args ) {
//        AuthorProviderRealization authorProviderRealization = new AuthorProviderRealization();
        //BookProviderRealization bookProviderRealization = new BookProviderRealization();
//        PublisherProviderRealization publisherProviderRealization = new PublisherProviderRealization();
//
//        System.out.println(authorProviderRealization.getAll());
//        System.out.println(bookProviderRealization.getAll());
//        System.out.println(publisherProviderRealization.getAll());

        ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
        BookServiceRealization bsr = (BookServiceRealization) context.getBean("bookService");
        System.out.println(bsr.getBooks());

    }
}
