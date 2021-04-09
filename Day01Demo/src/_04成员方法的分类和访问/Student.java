package _04成员方法的分类和访问;

/**
 * 静态方法属于类，有static修饰，直接用类名访问即可
 * 实例方法属于类，无static修饰，必须先创建对象，然后用对象来访问
 *
 * 静态方法也可以被对象共享访问，但不推荐，因为静态方法直接用类名访问即可。
 */

public class Student {

    // 实例成员变量
    private String name;
    private int age;

    // 静态方法：有static修饰符，属于类，直接用类名访问即可
    public static void inAddr() {
        System.out.println("我们正在学习java的类");
    }

    // 实例方法：无static修饰，遇到对象，必须用对象访问
    public void eat() {
        System.out.println(name + "已经" + age + "岁,在吃好吃的！！");
    }

    public static void main(String[] args) {
        // 使用类名.静态方法    可以调用静态方法
        Student.inAddr();

        // 同类中访问静态方法可以省略类名不写
        inAddr();

        // 访问实例方法的方式：对象.实例方法
        Student student = new Student();
        student.name = "xxx";
        student.age = 1000;
        student.eat();
    }
}
