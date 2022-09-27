package org.clazz;

public class NewInstanceExample {
    public static void main(String[] args) {
        try {
//            Class<?> clazz = Class.forName("org.clazz.SendAction");
            Class clazz = Class.forName("org.clazz.RecieveAction");
            Action action = (Action) clazz.newInstance();
            action.execute();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}
