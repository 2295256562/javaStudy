package _13super调用父类构造器;

/**
 * 子类的全部构造器默认一定会调用父类的无参构造器
 * super(...)：会根据参数选择调用父类的某个构造器
 *
 * 总结：
 *      可以在子类构造器中通过super(...)指定调用父类的构造器，以便调用。
 *      父类构造器初始化继承自父类的数据
 */
public class TestDemo {
    public static void main(String[] args) {
        Monkey monkey = new Monkey("孙悟空", 10, '雄');
        monkey.eatBanana();
    }
}

class Monkey extends Animal {

    public Monkey(String name, int age, char sex) {
        // 根据参数匹配调用父类构造器
       super(name, age, sex);
    }

    public void eatBanana (){
        System.out.println(getName()+"-->"+getAge()+"-->"+"在吃香蕉~~~");
    }
}


class Animal {

    private String name;
    private int age;
    private char sex;

    public Animal() {
    }

    public Animal(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
