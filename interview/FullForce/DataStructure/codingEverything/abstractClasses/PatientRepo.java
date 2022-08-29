package Interview.FullForce.DataStructure.codingEverything.abstractClasses;

public class PatientRepo extends BaseRepo implements BaseInterfaceRepo {

  @Override
  public void printRepo() {
    System.out.println("Patient Repo 9999#");
  }

  @Override
  public void hasId() {
    BaseInterfaceRepo.super.hasId();
  }

  public static void main(String[] args) {
//    PatientRepo p = new PatientRepo();
//    p.hasId();
//    p.printRepo();

    BaseRepo a = new PatientRepo() ;
    a.hasId();
    a.printRepo();
  }
}
