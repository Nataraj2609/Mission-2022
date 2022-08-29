package Interview.FullForce.DataStructure.codingEverything.EducativeJava1.LLAssessment;

import java.util.ArrayList;
import java.util.List;

/**
 * Very important questions
 */
public class VisiblityOfPrimAndNonPrim {
  public static void main(String[] args) {
    int i = 10;
    String str = "Amreetha";

    modifyInt_Str(i, str);
    System.out.println();
    System.out.println("Back to main");
    // INT not modified - Prim - call by value
    System.out.println(i);
    //String not modified because it is IMMUTABLE
    System.out.println(str);

    List<String> l1 = new ArrayList<>();
    List<String> l2 = new ArrayList<>();
    l1.add("abc");
    l2.add("def");

    modify(l1, l2);
    System.out.println();
    System.out.println("Back to main");
    // In the called function, l1 reference is de-referenced & new object is set, changed. No side effects for this object
    System.out.println(l1);
    // MUTABLE - modified the value at reference
    System.out.println(l2);

    container c = new container();
    c.val = 20;
    c.commitValues = new ArrayList<>();
    c.commitValues.add(5);
    c.commitValues.add(15);
    c.name = "Radplus Project ";

    modifyContainer(c);
    System.out.println();
    System.out.println("Back to main");
    System.out.println(c.val);
    // MUTABLE class - Hence, name is changed.
    System.out.println(c.name);
    System.out.println(c.commitValues);

    List<String> projMembersList = new ArrayList<>();
    projMembersList.add("Wan li");
    projMembersList.add("Nat");
    projMembersList.add("Ben");
    projMembersList.add("Kalai");
    ImmutableProjectContainer immutableProjectContainer = new ImmutableProjectContainer(21014,"Nx2", projMembersList);
    modifyImmutable(immutableProjectContainer);
    System.out.println();
    System.out.println("Back to main");
    System.out.println(immutableProjectContainer.getProjectId());
    System.out.println(immutableProjectContainer.getProjectName());
    System.out.println(immutableProjectContainer.getProjectMembers());
  }

  private static void modifyImmutable(ImmutableProjectContainer immutableProjectContainer) {
    //Because we are returning new list cloned each time, it will not print prasanth & Tyler
    immutableProjectContainer.getProjectMembers().add("Prasanth");
    immutableProjectContainer.getProjectMembers().add("Tyler");
    System.out.println();
    System.out.println("Inside modifyImmutableProjectContainer");
    System.out.println(immutableProjectContainer.getProjectId());
    System.out.println(immutableProjectContainer.getProjectName());
    System.out.println(immutableProjectContainer.getProjectMembers());
  }

  private static void modifyContainer(container c) {
    System.out.println("Inside modifyContainer");
    c.name = "Nx Server project";
    System.out.println(c.name);
  }

  private static void modifyInt_Str(int i, String str) {
    i = 20;
    str = str.concat("John");
    System.out.println("Inside modifyInt_Str");
    System.out.println(i);
    System.out.println(str);
  }

  private static void modify(List<String> l1, List<String> l2) {
    l1 = new ArrayList<>();
    l1.add("ghi");
    l2.add("jkl");

    System.out.println("Inside modify - ");
    System.out.println(l1);
    System.out.println(l2);
    System.out.println();
  }
}

class container {
  int val;
  String name;
  List<Integer> commitValues;
}

final class ImmutableProjectContainer {
  private final int projectId;
  private final String projectName;
  private final List<String> projectMembers;

  ImmutableProjectContainer(int projectId, String projectName, List<String> projectMembers) {
    this.projectId = projectId;
    this.projectName = projectName;
    List<String> tempProjMembers = new ArrayList<>(projectMembers);
    this.projectMembers = tempProjMembers;
  }

  public int getProjectId() {
    return projectId;
  }

  public String getProjectName() {
    return projectName;
  }

  public List<String> getProjectMembers() {
    return new ArrayList<>(projectMembers);
  }
}