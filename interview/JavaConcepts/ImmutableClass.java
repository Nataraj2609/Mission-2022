package Interview.FullForce.JavaConcepts;

public final class ImmutableClass {

  String EmpName;
  AddressForImmutableClass address;

  public ImmutableClass(String EmpName, AddressForImmutableClass address){
    this.EmpName = EmpName;
    this.address = new AddressForImmutableClass(address.pincode, address.street);
  }

  public String getEmpName() {
    return this.EmpName;
  }

  public AddressForImmutableClass getAddress() {
    return new AddressForImmutableClass(this.address.pincode, this.address.street);
  }

  public static void main(String[] args) {
    AddressForImmutableClass a = new AddressForImmutableClass("6087", "Lal street");
    AddressForImmutableClass a2 = new AddressForImmutableClass("452", "sdfwfefewfsf street");

    ImmutableClass i;
    i = new ImmutableClass("John", a2);

    System.out.println(i.getEmpName());
    System.out.println(i.getAddress().pincode);
    System.out.println(i.getAddress().street);


  }
}

class AddressForImmutableClass {
  String pincode;
  String street;

  public AddressForImmutableClass(String pincode, String street) {
    this.pincode = pincode;
    this.street = street;
  }
}

