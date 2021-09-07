package tms.homeworkeleven.dump;

import tms.homeworkeleven.utils.RandomUtil;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FabricDump {

    public static final String EMPTY = "EMPTY";
    private static final Lock lock = new ReentrantLock();
    public static List<String> dump = new LinkedList<>();

    public static void dumpSet(String randomPart) {
        lock.lock();
        System.out.println(Thread.currentThread().getName());
        dump.add(randomPart);
        System.out.println(" 1:"+randomPart);
        unlockThread();
    }

    public static String dumpGet() {
        lock.lock();
        System.out.println(Thread.currentThread().getName());
        int sizeTemp = dump.size();
        System.out.println(" 2:"+sizeTemp);
        int randomPart = 0;
        if (sizeTemp <= 0) {
            System.out.println("3:"+EMPTY);
            unlockThread();
            return EMPTY;
        } else {
            randomPart = RandomUtil.RandomNumber(sizeTemp);
            System.out.println(" 4:"+sizeTemp);
            System.out.println(" 5:"+randomPart);
        }
        String get = dump.get(randomPart);
        System.out.println(" 6:"+get);
        System.out.println(" 7:"+dump.size());
        dump.remove(get);
        System.out.println(" 8:"+dump.size());
        unlockThread(); //<------------------------
        System.out.println(" 9:"+get);       //    как вернуть значение, а потом закрыть lock???????
        return get;     //<------------------------
    }

    private static void unlockThread() {
        lock.unlock();
    }
}
