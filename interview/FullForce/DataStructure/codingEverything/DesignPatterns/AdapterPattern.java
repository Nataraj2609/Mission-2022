package Interview.FullForce.DataStructure.codingEverything.DesignPatterns;

interface indianPowerSource{
  void powerSupplyVolt();
}

interface chargerPowerSource{
  void chargerVolt();
}

class IndianPowerSupply implements indianPowerSource{

  @Override
  public void powerSupplyVolt() {
    System.out.println("240 V Danger");
  }
}

class ChargerPowerSource implements chargerPowerSource{

  @Override
  public void chargerVolt() {
    System.out.println("18 V Ok - Dont Worry");
  }
}

class MobileAdapter implements chargerPowerSource{
  IndianPowerSupply indianPowerSupply;

  public MobileAdapter(IndianPowerSupply incomingIndianPowerSupply){
    this.indianPowerSupply = incomingIndianPowerSupply;
  }

  @Override
  public void chargerVolt() {
    System.out.println("MobileAdapter -> 18 V Successful");
    this.indianPowerSupply.powerSupplyVolt();
  }
}
class MainDemo {
  public static void main(String[] args) {
    IndianPowerSupply indianPowerSource = new IndianPowerSupply();
    indianPowerSource.powerSupplyVolt();

    ChargerPowerSource chargerPowerSource = new ChargerPowerSource();
    chargerPowerSource.chargerVolt();

    MobileAdapter mobileAdapter = new MobileAdapter(indianPowerSource);
    mobileAdapter.chargerVolt();
  }
}
