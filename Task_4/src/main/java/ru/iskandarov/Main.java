package ru.iskandarov;

import ru.pflb.mq.dummy.exception.DummyException;
import ru.pflb.mq.dummy.implementation.ConnectionImpl;
import ru.pflb.mq.dummy.interfaces.Connection;
import ru.pflb.mq.dummy.interfaces.Destination;
import ru.pflb.mq.dummy.interfaces.Producer;
import ru.pflb.mq.dummy.interfaces.Session;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class Main {
    private static String var1;

    public static void main(String[] args) {
        List<String> listline = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите полный путь к файлу: ");
        String pathfile = sc.nextLine();
        sc.close();
        try {
            File file = new File(pathfile);
            //создаем объект FileReader для объекта File
            FileReader masseges = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(masseges);
            // считаем сначала первую строку
            listline = new ArrayList<>();
            String line = "";
            while (line != null) {
                line = reader.readLine();
                if (line != null) {
                    listline.add(line);
                }
            }
            masseges.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Connection connect1 = new ConnectionImpl();
        connect1.start();
        Session session1 = connect1.createSession(true);
        try {
            Destination destination = session1.createDestination("MyQueue");
            assert listline != null;
            printmas(listline, session1, destination);
                        session1.close();
            connect1.close();
        } catch (DummyException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
    public static void printmas(List<String> listline, Session session1, Destination destination) throws InterruptedException, DummyException {
        int count = 0;
        for (String listline1 : listline) {
            Producer producer = session1.createProducer(destination);
            producer.send(listline1);
            Thread.sleep(2000);
            count++;
            if (count == listline.size()) {
                printmas(listline, session1, destination);
            }
        }
    }
}
