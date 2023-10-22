package HW.HW_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.List;

/* Должно запуститься приложение где нажимая кннопки будут ввыдиться вопросы и ответы к Заднию 1 Урока 4.
*  Прииложение не разделено на классы чтобы не скачивать все пакеты. Но на самом деле хотелось разбить на классы
*  в отдельные классы и пакеты. Предусмотрен ручной ввод пути к текстовому файлу home_task_4
* */
public class AppTaskOne {
    public static void main(String[] args) {
        String localSepar = System.getProperty("file.separator");
        String path = System.getProperty("user.dir");
        String fullPath = path + localSepar + "src" + localSepar +"main" + localSepar + "java" +localSepar + "HW" + localSepar +
                          "HW_4" + localSepar + "home_task_4.txt";
        List<String> question = new ArrayList<>();
        List<String> answers = new ArrayList<>();
        if (Files.exists(Path.of(fullPath))) {
            try (BufferedReader br = new BufferedReader(new FileReader(fullPath))) {
                String line;
                while ((line = br.readLine()) != null){
                    question.add(line);
                    line = br.readLine();
                    answers.add(line);
                    line = br.readLine();
                }
            } catch (IOException e) {
                new IOException(e);
            }
        }else {
            System.out.println("Введите полнный путь до файла home_task_4.txt");
            Scanner input = new Scanner(System.in);
            String enteredFullPath = input.nextLine();
            try (BufferedReader br = new BufferedReader(new FileReader(enteredFullPath))) {
                String line;
                while ((line = br.readLine()) != null){
                    question.add(line);
                    line = br.readLine();
                    answers.add(line);
                    line = br.readLine();
                }
            } catch (IOException e) {
                new IOException(e);
            }
        }

        JFrame frame = new JFrame("Home Task 4");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new MultiPusher(question, answers));
        frame.setSize(1000, 800);
        frame.setVisible(true);

    }
    public static class MultiPusher extends JPanel {
        List<String> question, answers;
        JTextPane questFirst, ansFirst,questSecond,ansSecond,
                questThird, ansThird, questForth, ansForth;
        Button questionButton, answerButton;
        JTextArea textArea;
        public MultiPusher(List<String> question, List<String> answers){
            this.question = question;
            this.answers = answers;

            GridLayout gr = new GridLayout(6, 2);

            super.setLayout(gr);

            questFirst = new JTextPane();
            questFirst.setText("Вопрос 1");
            ansFirst = new JTextPane();
            ansFirst.setText("Ответ 1");

            questSecond = new JTextPane();
            questSecond.setText("Вопрос 2");
            ansSecond = new JTextPane();
            ansSecond.setText("Ответ 2");

            questThird = new JTextPane();
            questThird.setText("Вопрос 3");
            ansThird = new JTextPane();
            ansThird.setText("Ответ 3");

            questForth = new JTextPane();
            questForth.setText("Вопрос 4");
            ansForth = new JTextPane();
            ansForth.setText("Ответ 4");

            questionButton = new Button("Вывести вопрос 1");
            answerButton = new Button("Вывести Ответ 1");

            super.add(questFirst);
            super.add(ansFirst);
            super.add(questSecond);
            super.add(ansSecond);
            super.add(questThird);
            super.add(ansThird);
            super.add(questForth);
            super.add(ansForth);
            super.add(questionButton);
            super.add(answerButton);

            ActionListener al = new MyActionListener();
            questionButton.addActionListener(al);
            answerButton.addActionListener(al);

        }
        public class MyActionListener implements ActionListener{
            public void actionPerformed(ActionEvent e){
                if (e.getSource().equals(questionButton)){
                    if (questionButton.getLabel().equals("Вывести вопрос 1")){
                        questFirst.setText(question.get(0));
                        questionButton.setLabel("Вывести вопрос 2");
                    } else if (questionButton.getLabel().equals("Вывести вопрос 2")) {
                        questSecond.setText(question.get(1));
                        questionButton.setLabel("Вывести вопрос 3");
                    }else if (questionButton.getLabel().equals("Вывести вопрос 3")) {
                        questThird.setText(question.get(2));
                        questionButton.setLabel("Вывести вопрос 4");
                    } else if (questionButton.getLabel().equals("Вывести вопрос 4")){
                        questForth.setText(question.get(3));
                        questionButton.setLabel("Конец");
                    }
                } else if (e.getSource().equals(answerButton)) {
                    if (answerButton.getLabel().equals("Вывести Ответ 1")){
                        ansFirst.setText(answers.get(0));
                        answerButton.setLabel("Вывести Ответ 2");
                    } else if (answerButton.getLabel().equals("Вывести Ответ 2")) {
                        ansSecond.setText(answers.get(1));
                        answerButton.setLabel("Вывести Ответ 3");
                    }else if (answerButton.getLabel().equals("Вывести Ответ 3")) {
                        ansThird.setText(answers.get(2));
                        answerButton.setLabel("Вывести Ответ 4");
                    } else if (answerButton.getLabel().equals("Вывести Ответ 4")){
                        ansForth.setText(answers.get(3));
                        answerButton.setLabel("Конец");
                    }
                }
            }
        }
    }
}
