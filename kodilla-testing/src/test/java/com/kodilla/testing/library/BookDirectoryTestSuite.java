package com.kodilla.testing.library;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class BookDirectoryTestSuite {

    @Mock
    private LibraryDatabase libraryDatabaseMock;

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    void testListBooksWithConditionsReturnList() {
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBook = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBook.add(book1);
        resultListOfBook.add(book2);
        resultListOfBook.add(book3);
        resultListOfBook.add(book4);
        when(libraryDatabaseMock.listBookWithCondition("Secret")).thenReturn(resultListOfBook);
        //When
        List<Book> theListOfBook = bookLibrary.listBookWithCondition("Secret");
        //Then
        assertEquals(4, theListOfBook.size());
    }

    @Test
    void testListBookWithConditionMoreThen20() {
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBookWithCondition(anyString())).thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBookWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBookWithCondition("FortyBooks")).thenReturn(resultListOf40Books);
        //When
        List<Book> theListOf0Books0 = bookLibrary.listBookWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBookWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBookWithCondition("FortyBooks");
        //Then
        assertEquals(0, theListOf0Books0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    void testListBooksWithConditionFragmentShorterThen3() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        //When
        List<Book> theListOfBooks10 = bookLibrary.listBookWithCondition("An");
        //Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBookWithCondition(anyString());
    }

    @Test
    void testIfUserHas0Books() {
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> firstList = new ArrayList<>();
        List<LibraryUser> theUser1 = new ArrayList<>();
        LibraryUser user1 = new LibraryUser("d","s", "ds");
        theUser1.add(user1);
        int size = firstList.size();
        System.out.println("Size of books of user1 = " + size);
        when(libraryDatabaseMock.listBookInHandsOf(user1)).thenReturn(firstList);
        //When
        List<Book> resultOfFirstList  = bookLibrary.listBooksInHandsOf(user1);
        //Then
        assertEquals(0, resultOfFirstList.size());
    }

    @Test
    void testIfUserHas1Book() {
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> secondList = new ArrayList<>();
        Book book1 = new Book("W pustyni i w puszczy", "sdsd", 1970);
        secondList.add(book1);
        List<LibraryUser> theUser2 = new ArrayList<>();
        LibraryUser user2 = new LibraryUser("a", "r", "ar");
        theUser2.add(user2);
        int size = secondList.size();
        System.out.println("Size of books of user2 = " + size);
        when(libraryDatabaseMock.listBookInHandsOf(user2)).thenReturn(secondList);
        //When
        List<Book> resultOfSecondList = bookLibrary.listBooksInHandsOf(user2);
        //Then
        assertEquals(1, resultOfSecondList.size());
    }

    @Test
    void testIfUserHas5Books() {
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> thirdList = new ArrayList<>();
        Book book1 = new Book("ds","ds",2000);
        Book book2 = new Book("rs","rs",2001);
        Book book3 = new Book("ss","ss",2002);
        Book book4 = new Book("qs","qs",2003);
        Book book5 = new Book("ts","ts",2004);
        thirdList.add(book1);
        thirdList.add(book2);
        thirdList.add(book3);
        thirdList.add(book4);
        thirdList.add(book5);
        List<LibraryUser> theUser3 = new ArrayList<>();
        LibraryUser user3 = new LibraryUser("d","c","cd");
        theUser3.add(user3);
        int size = thirdList.size();
        System.out.println("Size of books of user3 = " + size);
        when(libraryDatabaseMock.listBookInHandsOf(user3)).thenReturn(thirdList);
        //When
        List<Book> resultOfThirdList = bookLibrary.listBooksInHandsOf(user3);
        //Then
        assertEquals(5, resultOfThirdList.size());

    }
}
