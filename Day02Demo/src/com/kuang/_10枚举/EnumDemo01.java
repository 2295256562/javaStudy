package com.kuang._10枚举;

/**
 *  枚举是面向对象的特殊类型
 *
 *  枚举类的作用？
 *      枚举是用于做信息标志和信息分类
 *
 *  枚举类的格式：
 *      修饰符 enum 枚举名称 {
 *          实例1名称， 实例2名称...
 *      }
 *
 *   枚举类的特点：
 *      1. 枚举类是final修饰的，不能被继承。
 *      2. 枚举类默认继承了枚举类型：java.lang.Enum
 *      3. 枚举类的第一行罗列的是枚举类对象。而且是用常量存储的。
 *      4. 所以枚举累的第一行写的都是常量名称，默认存储了枚举对象。
 *      5. 枚举类的构造器默认是私有的。
 *      6. 枚举类相当于多例设计模式。
 */
public class EnumDemo01 {
    public static void main(String[] args) {
        Sex S1 = Sex.BOY;
        System.out.println(S1);
    }
}


enum Sex {
    BOY, GIRL
}