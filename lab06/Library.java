import java.util.ArrayList;
import java.util.List;

public class Library {

    // a. Members collection
    private List<Member> members;

    // b. Titles collection
    private List<Title> titles;

    // c. Borrowables collection
    private List<Borrowable> borrowables;

    // d. Default constructor
    public Library() {
        members = new ArrayList<Member>();
        titles = new ArrayList<Title>();
        borrowables = new ArrayList<Borrowable>();
    }

    // e. Add member
    public void addMember(int id, String name) throws AlreadyExistsException {
        //if id is already contained, THROW EXCEPTION
        if(containsId(id))
            throw new AlreadyExistsException("Member already exists with id: "+ id);

        Member m = new Member(id, name);
        members.add(m);
    }

    // f. Add title
    public void addTitle(Title t) {
        titles.add(t);
    }

    // g. Add borrowable item
    public void addBorrowable(Borrowable b) {
        borrowables.add(b);
    }

    // h. Display all members
    public void displayAllMembers() {
        System.out.println("\n--- LIBRARY MEMBERS ---");

        for (Member m : members) {
            System.out.println(m);
        }
    }

    // i. Display all borrowables
    public void displayAllBorrowables() {
        System.out.println("\n--- BORROWABLE ITEMS ---");

        for (Borrowable b : borrowables) {
            System.out.println(b);
        }
    }

    // j. Display borrowed items only
    public void displayBorrowedItems() {
        System.out.println("\n--- BORROWED ITEMS ---");
    }
}