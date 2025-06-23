
import java.util.List;

public class Librarian implements User{

    @Override
    public void GetID() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void GetRole() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void Authenticate() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void AddBook() {

    }

	public void AddMember() {

    }

	public void RemoveBook() {

    }

	public void RemoveMemeber() {

    }

    public void PayFines() {

    }
    
    public List<Book> SearchBooks() {
        return new List<Book>();
    }
}
