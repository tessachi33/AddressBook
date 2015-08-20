import java.util.ArrayList;


public class Contact {
  private static ArrayList<Contact> instances = new ArrayList<Contact>();

  private String mName;
  private String mHomeNumber;
  private String mCellPhone;
  private String mEmail;
  private int mId;


  public Contact(String name, String homeNumber, String cellNumber, String email) {
    mName = name;
    mHomeNumber = homeNumber;
    mCellPhone = cellNumber;
    mEmail = email;
    instances.add(this);
    mId = instances.size();
  }

  public String getName(){

    return mName;
  }
  public String getHomeNumber(){

    return mHomeNumber;
  }
  public String getCellNumber(){

    return mCellPhone;
  }
  public String getEmail(){

    return mEmail;
    }
  public static ArrayList<Contact> all(){
    return instances;
  }
  public int getId() {
    return mId;
  }
  
  public static Contact find(int id){
    try {
      return instances.get(id - 1);
    } catch (IndexOutOfBoundsException e){
      return null;
    }
    }
    public static void clear(){
      instances.clear();
    }
  }
