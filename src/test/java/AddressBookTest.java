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

  // @Test
  //   public void all_returnsAllInstancesOfCategories_true() {
  //     Category firstCategory = new Category("Home");
  //     Category secondCategory = new Category("Dogs");
  //     assertTrue(Category.all().contains(firstCategory));
  //     assertTrue(Category.all().contains(secondCategory));
  //   }
  //
  //   @Test
  //   public void clear_removesAllCategoryInstancesFromMemory() {
  //     Category testCategory = new Category("Home");
  //     Category.clear();
  //     assertEquals(Category.all().size(), 0);
  //   }
  //
  //   @Test
  //   public void find_returnsCategoryWithSameId() {
  //     Category testCategory = new Category("Home");
  //     assertEquals(Category.find(testCategory.getId()), testCategory);
  //   }
  //
  //   @Test
  //   public void addTask_addsTaskToList() {
  //     Category testCategory = new Category("Bob's Used Tasks");
  //     Task testTask = new Task("Mow the lawn");
  //     testCategory.addTask(testTask);
  //     assertTrue(testCategory.getTasks().contains(testTask));
  //   }
  }
