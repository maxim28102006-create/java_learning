package week4;
import java.util.Objects;

public class Book {
    private String title;
    private int pages;

    Book(String title, int pages){
        this.title = title;
        this.pages = pages;
    }

    @Override
    public String toString(){
        return "Book{title='" + title + "', pages=" + pages + "}";
    }

    @Override
    public int hashCode(){
        return Objects.hash(title, pages);
    }



    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Book other = (Book) o;
        if(title.equals(other.title) && other.pages == pages){
            return true;
        }
        return false;
    }

}
