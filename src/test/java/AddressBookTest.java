import java.util.ArrayList;

import org.junit.*;
import static org.junit.Assert.*;

public class AddressBookTest {

  @Test
  public void getUserName_returnsUserName_true() {
    AddressBook testAddressBook = new AddressBook("Teresa");
    assertEquals("Teresa", testAddressBook.getUserName());
  }

    @Test
    public void getId_returnsAddressBookId() {
      AddressBook testAddressBook = new AddressBook("Teresa");
      assertTrue(AddressBook.all().size() == testAddressBook.getId());
    }

    @Test
    public void getTasks_initiallyReturnsEmptyArrayList() {
      AddressBook testAddressBook = new AddressBook("Teresa");
      assertTrue(testAddressBook.getContacts() instanceof ArrayList);
    }

    @Test
      public void all_returnsAllInstancesOfAddressBook_true() {
        AddressBook testAddressBook1 = new AddressBook("Teresa");
        AddressBook testAddressBook2 = new AddressBook("Alex");
        assertTrue(AddressBook.all().contains(testAddressBook1));
        assertTrue(AddressBook.all().contains(testAddressBook2));
      }

      @Test
      public void clear_removesAllAddressBookInstancesFromMemory() {
        AddressBook testAddressBook = new AddressBook("Alex");
        AddressBook.clear();
        assertEquals(AddressBook.all().size(), 0);
      }

    @Test
    public void find_returnsAddressBookWithSameId() {
      AddressBook testAddressBook = new AddressBook("Alex");
      assertEquals(AddressBook.find(testAddressBook.getId()), testAddressBook);
    }

    @Test
    public void addContact_addsContactToList() {
      AddressBook testAddressBook = new AddressBook("Alex");
      Contact testContact = new Contact("Teresa", "333", "555", "email@email.com");
      testAddressBook.addContact(testContact);
      assertTrue(testAddressBook.getContacts().contains(testContact));
    }
  }
