package Interview.FullForce.DataStructure.codingEverything.DesignPatterns;

/**
 * consider a USB to Ethernet adapter.
 * To use an adapter:
 * <p>
 * 1. The client makes a request to the adapter by calling a method on it using the target interface.
 * 2. The adapter translates that request on the adaptee using the adaptee interface.
 * 3. Client receive the results of the call and is unaware of adapter’s presence.
 */

interface Bird {
  // birds implement Bird interface that allows them to fly and make sounds adaptee interface
  public void fly();
  public void makeSound();
}

interface ToyDuck {
  // target interface - toyducks dont fly they just make squeaking sound
  public void squeak();
}

class Eagle implements Bird {
  // a concrete implementation of bird
  @Override
  public void fly() {
    System.out.println("Flying");
  }
  @Override
  public void makeSound() {
    System.out.println("Chirp Chirp");
  }
}

class PlasticToyDuck implements ToyDuck {
  @Override
  public void squeak() {
    System.out.println("Squeak");
  }
}

class BirdAdapter implements ToyDuck {
  // You need to implement the interface your client expects to use.
  Bird bird;

  public BirdAdapter(Bird bird) {
    // we need reference to the object we are adapting
    this.bird = bird;
  }

  public void squeak() {
    // translate the methods appropriately
    bird.makeSound();
  }
}

class Main {
  public static void main(String args[]) {
    Eagle eagle = new Eagle();
    ToyDuck toyDuck = new PlasticToyDuck();

    // Wrap a bird in a birdAdapter so that it behaves like toy duck
    ToyDuck birdAdapter = new BirdAdapter(eagle);

    System.out.println("Eagle...");
    eagle.fly();
    eagle.makeSound();

    System.out.println("ToyDuck...");
    toyDuck.squeak();

    // toy duck behaving like a bird
    System.out.println("BirdAdapter...");
    birdAdapter.squeak();
  }
}
