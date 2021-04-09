package com.kuang._01泛型的概述;

public class Demo01 {
    public static void main(String[] args) {
//        Integer[] a = {1,2,3,4,5};
//        String s = arrTOString(a);
//        System.out.println(s);
//
//
//        Double[] b = {99.1,22.2,11.3,44.1};
//        String s1 = arrTOString(b);
//        System.out.println(s1);


        StudentCrud st = new StudentCrud();
        st.add(new Student());


        TeacherCrud tr = new TeacherCrud();
        tr.add(new Teacher());
    }


    // 定义一个数组变为字符串的方法，形参为泛型，表示可以接收任意类型。
    public static <T> String arrTOString(T[] arr){
        StringBuffer buffer = new StringBuffer();
        buffer.append("[");

        if (arr != null && arr.length > 0){
            for (int i=0; i<arr.length; i++){
                T num = arr[i];
                buffer.append(i == arr.length-1?num:num+",");
            }
        }

        buffer.append("]");
        return buffer.toString();
    }
}
