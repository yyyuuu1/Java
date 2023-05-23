package com.objectOriented.homework;

public class homework09 {
    public static void main(String[] args) {
        // 9.定义Music类，里面有音乐名name、音乐时长times属性，
        // 并有播放play功能和返回本身属性信息的功能方法getInfo.

        Music a = new Music("青花瓷", 3.12);
        a.play();
        System.out.println(a.getInfo());
    }
}


class Music {
    String name;
    double times;

    public Music(String name, double times) {
        this.name = name;
        this.times = times;
    }

    public void play() {
        System.out.println("正在播放音乐" + this.name + "\n时长为" + this.times + "分钟");
    }

    public String getInfo() {
        return this.name + this.times;
    }
}