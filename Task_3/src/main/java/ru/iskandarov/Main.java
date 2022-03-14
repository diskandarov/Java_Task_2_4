package ru.iskandarov;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        List<String> listline = null;
        Queue<String> queue = null;
        try {
            File file = new File("src/main/java/ru/iskandarov/poem.txt");
            //создаем объект FileReader для объекта File
            FileReader poem = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(poem);
            // считаем сначала первую строку
            listline = new ArrayList<>();
            queue = new LinkedList<>();
            String line = "";
            while (line != null) {
                line = reader.readLine();
                if (line != null) {
                    listline.add(line);
                    queue.add(line);
                }
            }
            poem.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int i = 1;
        boolean rewritef = false;
        assert listline != null;
        for (String listline1 : listline) {
            if ("".equals(listline1)) {
                i++;
                rewritef = false;
            } else {
                String stri = Integer.toString(i);
                File file = new File("src/main/java/ru/iskandarov/part" + stri + ".txt");
                FileWriter fr = null;
                BufferedWriter br = null;
                try {
                    fr = new FileWriter(file, rewritef);
                    br = new BufferedWriter(fr);
                    String dataWithNewLine = listline1 + System.getProperty("line.separator");
                    br.write(dataWithNewLine);
                    rewritef = true;
                    br.close();
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        queuewriter(queue);
    }

    public static void queuewriter(Queue queue) {
        int d;
        d = queue.size();
        for (int i = 0; i < d; i++) {
            System.out.println(queue.poll());
            try {
                int a = 1;
                int b = 3000;
                int random_number1 = a + (int) (Math.random() * b);
                Thread.sleep(random_number1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


