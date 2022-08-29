package Interview.FullForce.DataStructure.codingEverything.DesignPatterns;

/**
 * Template method design pattern is to define an algorithm as a skeleton of operations
 * and leave the details to be implemented by the child classes.
 * The overall structure and sequence of the algorithm are preserved by the parent class.
 * Template means Preset format like HTML templates which has a fixed preset format.
 * Similarly in the template method pattern, we have a preset structure method called template method
 * which consists of steps. These steps can be an abstract method that will be implemented by its subclasses.
 * This behavioral design pattern is one of the easiest to understand and implement.
 * This design pattern is used popularly in framework development. This helps to avoid code duplication also.
 */
abstract class ComputerManufacturer {
  public void buildComputer() {
    addHardDisk();
    addRam();
    addKeyboard();
  }

  abstract void addHardDisk();

  abstract void addRam();

  abstract void addKeyboard();
}

class DesktopManufacturer extends ComputerManufacturer {
  @Override
  void addHardDisk() {
    System.out.println("Desktop - HardDisk added!");
  }

  @Override
  void addRam() {
    System.out.println("Desktop - RAM added!");
  }

  @Override
  void addKeyboard() {
    System.out.println("Desktop - Keyboard added!");
  }
}

class LaptopManufacturer extends ComputerManufacturer {
  @Override
  void addHardDisk() {
    System.out.println("Laptop - HardDisk added!");
  }

  @Override
  void addRam() {
    System.out.println("Laptop - RAM added!");
  }

  @Override
  void addKeyboard() {
    System.out.println("Laptop - Keyboard added!");
  }
}

class TemplateTest {
  public static void main(String[] args) {
    ComputerManufacturer cm = new DesktopManufacturer();
    cm.buildComputer();
  }
}
