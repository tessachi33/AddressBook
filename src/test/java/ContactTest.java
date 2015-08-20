import org.junit.*;
import static org.junit.Assert.*;



public class ContactTest {

  @Rule
   public ClearRule clearRule = new ClearRule();

   @Test
     public void contact_instantiatesCorrectly_true() {
        Contact myContact = new Contact("Teresa", "333", "555", "email@email.com");
       assertEquals(true, myContact instanceof Contact);
     }

       @Test
    public void contact_instantiatesNameWithDescription_true(){
      Contact myContact = new Contact("Teresa", "333", "555", "email@email.com");
     assertEquals("Teresa", myContact.getName());
    }

     @Test
    public void contact_instantiatesHomeNumberWithDescription_true(){
      Contact myContact = new Contact("Teresa", "333", "555", "email@email.com");
      assertEquals("333", myContact.getHomeNumber());
    }

     @Test
    public void contact_instantiatesCellNumberWithDescription_true(){
      Contact myContact = new Contact("Teresa", "333", "555", "email@email.com");
      assertEquals("555", myContact.getCellNumber());
    }

    @Test
    public void contact_instantiatesEmailWithDescription_true(){
      Contact myContact = new Contact("Teresa", "333", "555", "email@email.com");
      assertEquals("email@email.com", myContact.getEmail());
    }

      @Test
   public void all_returnsAllInstancesOfontact_true() {
     Contact myContact1 = new Contact("Teresa", "333", "555", "email@email.com");
     Contact myContact2 = new Contact("Dave", "222", "666", "email@gmail.com");
    assertTrue(Contact.all().contains(myContact1));
    assertTrue(Contact.all().contains(myContact2));
  }

}
