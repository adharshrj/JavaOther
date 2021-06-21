class Singleton {
    private int num = 10;
    
    private Singleton() {
    
    }
    
    private static class Helper {
    private static final Singleton uniqueInstance = new Singleton();
    }
    
    public static Singleton getInstance() {
    return Helper.uniqueInstance;
    }
    
    public int getNum() {
    return num;
    }
    
    public void setNum(int num) {
    this.num = num;
    }
    
    }
    
    public class SingletonDemo {
    public static void main(String args[]) {
    Singleton singleInstance = Singleton.getInstance(); // first instance of the class
    singleInstance.setNum(25);
    Singleton secondInstance = Singleton.getInstance(); // second instance of the class
    System.out.println(secondInstance.getNum()); // trying to get the class variable using getter method
    }
    }