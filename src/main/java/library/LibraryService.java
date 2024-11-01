package library;

import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;

public class LibraryService extends LibraryServiceGrpc.LibraryServiceImplBase{

    private List<LibraryOuterClass.Book> books = new ArrayList<>();

    public LibraryService() {
    }

    @Override
    public void addBook(LibraryOuterClass.AddBookRequest request, StreamObserver<LibraryOuterClass.AddBookResponse> responseObserver) {

          LibraryOuterClass.Book book= request.getBook();
          String namebook= book.getTitle();
          LibraryOuterClass.AddBookResponse.Builder resp= LibraryOuterClass.AddBookResponse.newBuilder();

          boolean bookExists = false;
              for (LibraryOuterClass.Book j : books) {
                  if (namebook.equals(j.getTitle())) {
                      bookExists = true;
                      break;}}

              if (bookExists) {
                  resp.setMessage("Book Already Exists");
              } else {
                  books.add(book);
                  resp.setMessage("Book Added Successfully");
              }
              responseObserver.onNext(resp.build());
              responseObserver.onCompleted();
          }
          @Override
          public void searchBook(LibraryOuterClass.SearchBookRequest request, StreamObserver<LibraryOuterClass.SearchBookResponse> responseObserver) {

            List<String> searchKeywords = request.getKeywordsList();
            List<LibraryOuterClass.Book> MatchedBooks = new ArrayList<>();

            for (LibraryOuterClass.Book book : books) {
                boolean containsKeyword = false;
                for (String keyword : book.getKeywordsList()) {
                    if (searchKeywords.contains(keyword)) {
                        containsKeyword = true;
                        break;}
                }

                if (containsKeyword) {
                    MatchedBooks.add(book);
                }
            }

            LibraryOuterClass.SearchBookResponse.Builder response = LibraryOuterClass.SearchBookResponse.newBuilder();
            responseObserver.onNext(response.build());
            responseObserver.onCompleted();
        }
    }







    
