
import java.util.List;
import java.util.Random;

public class Member implements User {
    List<Book> books;
	double fines = 0;

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

    public String SetID(Random rand) {
        int id = 1000 + rand.nextInt(9000);

        return Integer.toString(id);
    }

    public List<Book> GetBooks() {
        return books;
    }

    public double SetFines(double amount) {
        fines += amount;
        return fines;
    }
    
    public void GetFines() {

    }

    public double PayFines(double amount) {
        fines -= amount;
        return fines;
    }

    public void CheckoutBook () {

    }

    public void ReturnBook() {
        
    }
}
