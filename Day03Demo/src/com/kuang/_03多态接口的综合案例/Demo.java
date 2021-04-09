package com.kuang._03多态接口的综合案例;

/**
 *
 */
public class Demo {
    public static void main(String[] args) {
        // 买一台电脑
        Computer computer = new Computer();
        // 买一个鼠标
        USB luoji = new Mouse("罗技");
        computer.install(luoji);

        KeyBoard board = new KeyBoard("狼蛛");
        computer.install(board);
    }
}

class Computer{
    // 提供一个安装USB设备的入口
    public void install(USB usb){
        usb.connect();
        // 使用多态调用对象特有方法
        // 判断对象是不是鼠标
        if (usb instanceof Mouse){
            Mouse m = (Mouse) usb;
            m.dbClick();
        }else if (usb instanceof KeyBoard){
            KeyBoard k = (KeyBoard) usb;
            k.keyDown();
        }
        usb.unconect();
    }
}

// 定义键盘
class KeyBoard implements USB {
    private String name;

    public KeyBoard(String name) {
        this.name = name;
    }

    public void keyDown(){
        System.out.println("使用" + name + "牌键盘打字速度超级快~~");
    }

    @Override
    public void connect() {
        System.out.println("键盘连接了~~~~");
    }

    @Override
    public void unconect() {
        System.out.println("键盘被拔了┭┮﹏┭┮");
    }
}

// 定义鼠标功能
class Mouse implements USB {
    private String name;

    public Mouse(String name) {
        this.name = name;
    }

    public void dbClick(){
        System.out.println("小手飞快的双击鼠标" + name);
    }

    @Override
    public void connect() {
        System.out.println("鼠标连接了~~~~");
    }

    @Override
    public void unconect() {
        System.out.println("鼠标被女朋友拔了┭┮﹏┭┮");
    }
}

// 定义USB规范
interface USB {
    void connect();
    void unconect();
}