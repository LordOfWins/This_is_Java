package org.object;

import java.util.HashMap;
import java.util.logging.Logger;

public class KeyExample {
    public static void main(String[] args) {
        Logger log = Logger.getGlobal();
        //Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 새엇ㅇ
        HashMap<Key, String> hashMap = new HashMap<>();
        //식별키 "new Key(1)"로 "홍길동"을 저장함
        hashMap.put(new Key(1), "홍길동");

        //식별키 "new Key(1)"로 "홍길동"을 읽어옴
        String value = hashMap.get(new Key(1));
        log.info(value);
    }
}
