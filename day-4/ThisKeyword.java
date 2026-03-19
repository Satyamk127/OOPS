class Animal {

    String name;
    int age;

  
    Animal() {
        System.out.println("Animal created");
    }

    Animal(String name, int age) {
        this(); // constructor chaining
        this.name = name; // instance variable
        this.age = age;
    }

 
    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    // 4️⃣ Calling method using this
    void show() {
        this.display();
    }

    // 5️⃣ Passing current object
    void passObject(Animal obj) {
        System.out.println("Object received: " + obj.name);
    }

    void callPass() {
        passObject(this);
    }

    // 6️⃣ Returning current object
    Animal getObject() {
        return this;
    }
}

class ThisKeyword{
  public static void main(String[] args) {
      Animal a = new Animal();
      Animal b = new Animal("parrote",20);
      // b.show();
      // b.callPass();
      a.getObject();
  }
}