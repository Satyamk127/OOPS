
public interface Shap {

    public static final int i = 21;

    public abstract void clacuateArea(int n);

    public static void main(String[] args) {
        Circle a = new Circle();
        a.clacuateArea(5);
    }

}

class Circle implements Shap {

    public void clacuateArea(int n) {
        System.out.println("Circle Area is " + (Math.PI * n * n));

    }

    
}
