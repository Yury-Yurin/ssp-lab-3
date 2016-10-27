package task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by yury on 27.10.16.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        List<String> keys = new ArrayList<>();
        List<String> files = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        for (String arg : args) {
            if (arg.startsWith("-")) {
                keys.add(arg);
            } else if (arg.contains("/") || arg.contains(".") || arg.contains(".txt")) {
                files.add(arg);
            } else strings.add(arg);
        }
        if (keys.size() == 0) {
            if (files.size() == 1) {
                BufferedReader in = new BufferedReader(new FileReader(files.get(0)));
                String str = "";
                while ((str = in.readLine()) != null) {
                    System.out.println(str);
                }
            }
            if (files.size() == 2) {
                BufferedReader in1 = new BufferedReader(new FileReader(files.get(0)));
                BufferedReader in2 = new BufferedReader(new FileReader(files.get(1)));
                Object[] lines1 = in1.lines().toArray();
                Object[] lines2 = in2.lines().toArray();
                for (int i = 0; i < (lines1.length > lines2.length ? lines1.length : lines2.length); i++) {
                    if (i < lines1.length && i < lines2.length) {
                        System.out.println(lines1[i].toString() + " " + lines2[i].toString());
                    }
                    if (i >= lines1.length && i < lines2.length) {
                        System.out.println(lines2[i].toString());
                    }
                    if (i < lines1.length && i >= lines2.length) {
                        System.out.println(lines1[i].toString());
                    }
                }

            }
        }
        if (keys.size() == 1) {
            if (keys.get(0).equals("-s")) {
                if (files.size() == 1) {
                    BufferedReader in = new BufferedReader(new FileReader(files.get(0)));
                    String str = "";
                    while ((str = in.readLine()) != null) {
                        System.out.print(str + " ");
                    }
                }
                if (files.size() == 2) {
                    BufferedReader in1 = new BufferedReader(new FileReader(files.get(0)));
                    BufferedReader in2 = new BufferedReader(new FileReader(files.get(1)));
                    Object[] lines1 = in1.lines().toArray();
                    Object[] lines2 = in2.lines().toArray();
                    for (int i = 0; i < lines1.length; i++) {
                        System.out.print(lines1[i] + " ");
                    }
                    System.out.println();
                    for (int i = 0; i < lines2.length; i++) {
                        System.out.print(lines2[i] + " ");
                    }

                }
            }
            if (keys.get(0).equals("-d")) {
                if (files.size() == 1) {
                    Integer iter = 0;
                    BufferedReader in = new BufferedReader(new FileReader(files.get(0)));
                    String str = "";
                    while ((str = in.readLine()) != null) {
                        System.out.println(str + strings.get(0).charAt(iter));
                        iter++;
                        if (iter.equals(strings.get(0).length()))
                            iter = 0;
                    }
                }
                if (files.size() == 2) {
                    Integer iter = 0;
                    BufferedReader in1 = new BufferedReader(new FileReader(files.get(0)));
                    BufferedReader in2 = new BufferedReader(new FileReader(files.get(1)));
                    Object[] lines1 = in1.lines().toArray();
                    Object[] lines2 = in2.lines().toArray();
                    for (int i = 0; i < (lines1.length > lines2.length ? lines1.length : lines2.length); i++) {
                        if (i < lines1.length && i < lines2.length) {
                            System.out.println(lines1[i].toString() + strings.get(0).charAt(iter) + lines2[i].toString());
                            iter++;
                            if (iter.equals(strings.get(0).length()))
                                iter = 0;
                        }
                        if (i >= lines1.length && i < lines2.length) {
                            System.out.println(lines2[i].toString());
                        }
                        if (i < lines1.length && i >= lines2.length) {
                            System.out.println(lines1[i].toString());
                        }

                    }

                }
            }
        }
            if (keys.size() == 2) {
                if (files.size() == 1) {
                    Integer iter = 0;
                    BufferedReader in = new BufferedReader(new FileReader(files.get(0)));
                    String str = "";
                    while ((str = in.readLine()) != null) {
                        System.out.print(str + strings.get(0).charAt(iter));
                        iter++;
                        if (iter.equals(strings.get(0).length()))
                            iter = 0;
                    }
                    System.out.println();
                }
                if (files.size() == 2) {
                    Integer iter = 0;
                    BufferedReader in1 = new BufferedReader(new FileReader(files.get(0)));
                    BufferedReader in2 = new BufferedReader(new FileReader(files.get(1)));
                    Object[] lines1 = in1.lines().toArray();
                    Object[] lines2 = in2.lines().toArray();
                    for (int i = 0; i < lines1.length; i++) {
                        System.out.print(lines1[i].toString() + (i != lines1.length - 1 ? strings.get(0).charAt(iter) : ""));
                        iter++;
                        if (iter.equals(strings.get(0).length()))
                            iter = 0;
                    }
                    System.out.println();
                    for (int i = 0; i < lines2.length; i++) {
                        System.out.print(lines2[i].toString() + (i != lines2.length - 1 ? strings.get(0).charAt(iter) : ""));
                        iter++;
                        if (iter.equals(strings.get(0).length()))
                            iter = 0;
                    }

                }
                System.out.println();
            }
    }
}
