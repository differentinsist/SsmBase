package com.yun.a1collection;

import java.util.*;

public class test1 {

    public static void main(String[] args) {


        //Collection/List/ArrayList/LinkedList/Vector/Set/HashSet/TreeSet/LinkedHashSet
        //Collections
        //Map

        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("key1","value1");
        hashMap.put("key2","value2");
        hashMap.put("key4","value4");
        hashMap.put("key3","value3");
        System.out.println(hashMap);


//        //map集合第一种遍历方式：
//        Set<String> allKeys = hashMap.keySet();
//        Iterator iterator = allKeys.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        Set<Map.Entry<String, String>> set = hashMap.entrySet();
        Iterator<Map.Entry<String, String>> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+ "  ");
        }
        System.out.println();
        //获取到所有key后也可以使用增强for循环
        for(Map.Entry<String,String> keySets : set){
            System.out.print(keySets+ "  ");
        }

//        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
//        linkedHashSet.add("33");
//        linkedHashSet.add("22");
//        linkedHashSet.add("44");
//        linkedHashSet.add("11");
//        linkedHashSet.add("aa");
//        System.out.println(linkedHashSet);

        //HashSet的无序是指没有索引对吧？但是他还是怎么存就怎么取的对吧？
//        HashSet<String> hashSet = new HashSet<String>();
//        hashSet.add("aa");
//        hashSet.add("dd");
//        hashSet.add("aa");
//        hashSet.add("cc");
//        hashSet.add("ee");
//        hashSet.add("1");
//        hashSet.add("2");
//        hashSet.add("3");
//        System.out.println(hashSet);
//        //有用是无序无索引；所以不能使用普通for循环；因为没索引  但是可以使用迭代器和增强for循环
//        Iterator<String> iterator = hashSet.iterator();
//        while(iterator.hasNext())
//            System.out.print(iterator.next() +" ");
//        for(String hash : hashSet){
//            System.out.print("  "+ hash);
//        }

//        LinkedList<String> linkedList = new LinkedList<String>();
//        linkedList.add("33");linkedList.add("11");linkedList.add("22");
//        System.out.println(linkedList);
//        for(String linked : linkedList){
//            System.out.println(linked);
//        }

//        ArrayList<String> list1 = new ArrayList<String>();
//        list1.add("cc");list1.add("aa");list1.add("11");list1.add("bb");
//        System.out.println(list1);
//        Collections.addAll(list1,"ee","ff","ee");
//        Collections.sort(list1);
//        System.out.println(list1);
//        for (int i=0; i<list1.size(); i++){
//            System.out.print(list1.get(i)+ "  ");
//        }
//        System.out.println();
//        Iterator<String> iterator = list1.iterator();
//        while(iterator.hasNext())
//            System.out.print(iterator.next()+ "  ");


//        List<String> list = new ArrayList<String>();
//        list.add("aa");
//        list.add("bb");
//        list.add("ccc");
//        //遍历的三种方式：
//        //1、使用for循环遍历集合
//        for(int i = 0; i<list.size(); i++){
//            System.out.println("for循环遍历集合:"+list.get(i));
//        }
//        //2、使用迭代器遍历集合
//        Iterator<String> iterator = list.iterator();
//        while(iterator.hasNext()){
//            System.out.println("迭代器遍历集合："+ iterator.next());
//        }
//        //3、使用增强for循环
//        for (String listList : list){
//            System.out.println("增强for循环："+listList);
//        }
//
//        List<String> strings = new LinkedList<String>();


    }
}
