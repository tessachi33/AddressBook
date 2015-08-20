import java.util.ArrayList;

public class AddressBook{
  private static ArrayList<AddressBook> instances = new ArrayList<AddressBook>();

  private String mUserName;
  private int mId;
  private ArrayList<Contact> mContacts;

  public AddressBook(String userName){
    mUserName = userName;
    instances.add(this);
    mId = instances.size();
    mContacts = new ArrayList<Contact>();
  }

  public String getUserName(){
    return mUserName;
  }

  public int getId(){
    return mId;
  }

  public ArrayList<Contact> getContacts(){
    return mContacts;
  }

  public void addContact(Contact contact) {
    mContacts.add(contact);
  }

  public static ArrayList<AddressBook> all() {
    return instances;
  }

  public static void clear(){
    instances.clear();
  }

  public static AddressBook find(int id) {
    try{
      return instances.get(id -1);
    } catch (IndexOutOfBoundsException e){
      return null;
    }
  }


}
