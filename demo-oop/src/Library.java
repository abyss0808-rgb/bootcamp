public class Library {
  private Book[]books;//costrustor add
  private Librarian librarian;


  // Reqirements:
  //Every Library has one Librarian ONLY
  //Every Librarian may work for more than one Library.

  public Library(){
    this.books = new Book[0];
  }

  public Librarian getLibrarian(){
    return this.librarian;
  }


  public void add(Book book){
    Book[]newBooks = new Book[this.books.length + 1];
    for(int i = 0;i < this.books.length;i++){
      newBooks[i] = this.books[i];
    }
    newBooks[newBooks.length - 1] = book;
    this.books = newBooks;
  }

  public int numberOfBook(){
    return this.
  }

  public static void main(String[] args) {
    //2 Scenario:
    //1. Library Object to find Librarian Object(Attribute )
    //2. Librarian Object to find Library Object

    Library library = new Library;
  }
}