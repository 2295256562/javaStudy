package com.kuang.utils;

import sun.nio.ch.FileKey;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Set;

/**
 * @author xinman.kuang
 * @date 2021/8/20 20:07
 *
 * 反射工具类
 */
final public class ReflectUtils {
    private ReflectUtils(){
        throw new RuntimeException("不用new");
    }

    /**
     * 反射创建对象（无参）
     * @param className 完全限定名（包名称 +类名称）
     * @param <T> 支持泛型
     * @return 返回创建对象
     * @throws Exception
     */
    private static <T> T creatObject(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        Constructor<?> struct = clazz.getDeclaredConstructor();
        return (T) struct.newInstance();
    }

    /**
     * 反射创建对象(无参)
     * @param clazz 字节码文件对应的class对象
     * @param <T> 支持泛型
     * @return
     * @throws Exception
     */
    private static <T> T creatObject(Class<T> clazz) throws Exception {
        Constructor<T> struct = clazz.getDeclaredConstructor();
        return struct.newInstance();
    }

    /**
     * 反射调用有参构造创建对象
     * @param clazz 字节码文件对应的class对象
     * @param values 参数实际的值
     * @param params 参数类型的class对象
     * @param <T> 支持泛型
     * @return 返回创建的对象
     */
    private static <T> T creatObject(Class<T> clazz, Object[] values, Class...params) throws Exception {
        Constructor<T> struct = clazz.getDeclaredConstructor(params);
        return struct.newInstance(values);
    }

    /**
     * 反射调用有参构造创建对象
     * @param className 字符串表示的类的名称（包名称+类名称）
     * @param values 参数实际的值
     * @param params 参数类型的class对象
     * @param <T> 支持泛型
     * @return 返回创建的对象
     * @throws Exception
     */
    private static <T> T creatObject(String className, Object[] values, Class...params) throws Exception {
        // 根据参数名称获取对应的class对象
        Class<?> clazz = Class.forName(className);
        // 根据参数类型获取class对象的构造器
        Constructor<?> struct = clazz.getDeclaredConstructor(params);
        // 使用构造器创建对象
        return (T) struct.newInstance(values);
    }

    /**
     * 使用反射调用无参方法
     * @param obj 方法所属的对象
     * @param methodName 字符创表示的方法名称
     * @param <T> 参数是一个泛型对象
     * @param <R> 返回类型支持泛型
     * @return 返回方法调用的结果
     */
    private static <T, R> R invokeMethod(T obj, String methodName) throws Exception {
        Class<?> clazz = obj.getClass();
        Method method = clazz.getDeclaredMethod(methodName);
        return (R) method.invoke(obj);
    }

    /**
     * 使用反射调用带有参数的成员方法
     * @param obj 方法所属的对象
     * @param methodName 以字符串形式表示的方法名称
     * @param values 参数实际的值
     * @param params 参数的类型
     * @param <T> 参数是一个泛型对象
     * @param <R> 返回类型支持泛型
     * @return 返回方法调用的结果，void方法返回null
     * @throws Exception
     */
    private static <T, R> R invokeMethod(T obj, String methodName, Object[] values, Class... params) throws Exception {
        Class<?> clazz = obj.getClass();
        Method method = clazz.getDeclaredMethod(methodName, params);
        return (R) method.invoke(obj, values);
    }

    /**
     * 暴力访问私有属性
     * @param obj 字段所属的对象
     * @param fieldName 字段名称
     * @param value 字段的值
     * @param <T> 支持泛型
     * @throws Exception
     */
    private static <T> void accessField(T obj, String fieldName, Object value) throws Exception {
        Class<?> clazz = obj.getClass();
        Field field = clazz.getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(obj, value);
    }

    /**
     * 暴力破解指定对象的所有属性
     * @param obj 参与暴力破解的对象
     * @param map 对象的属性名和对象的属性值
     * @param <T> 参数支持泛型
     * @throws Exception
     */
    private static <T> void accessAllFields(T obj, Map<String, Object> map) throws Exception {
        Class<?> clazz = obj.getClass();
        for (Map.Entry<String, Object> en : map.entrySet()) {
            String fieldKey = en.getKey();
            Object fieldValue = en.getValue();
            Field field = clazz.getDeclaredField(fieldKey);
            field.setAccessible(true);
            field.set(obj, fieldValue);
        }
    }

}
