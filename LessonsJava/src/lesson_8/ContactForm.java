package lesson_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactForm extends JFrame { // Наследование из класса JFrame
    private JTextField name_field, emale_field;
    private JRadioButton male, female;
    private JCheckBox check;

    // Создание конструктора

    public ContactForm() {
        super( "Контактная форма"); // Название приложения.
        super.setBounds(200, 100, 100, 230); // Ширина и высота приложения.
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Выход из приложения

        Container conteiner = super.getContentPane(); // Создание обьекта (приложения)
        conteiner.setLayout(new GridLayout(5, 2, 2, 10)); // Создание слоя (ряды, столбцы внутри приложения)

        JLabel name = new JLabel("Введите имя:"); // Создание строк в приложении
        name_field = new JTextField("", 1); // Создание поля для ввода
        JLabel emale = new JLabel("Введите emale:");
        emale_field = new JTextField("@", 1);

        conteiner.add(name); // Добавление обьектов в приложение
        conteiner.add(name_field);
        conteiner.add(emale);
        conteiner.add(emale_field);

        male = new JRadioButton("мужской"); // Создание радио кнопки
        female = new JRadioButton("женский");

        check = new JCheckBox("Согласен!", false); // Cоздание кнопки с галочкой
        JButton send_button = new JButton(" Отправить "); // Создание кнопки отправки

        male.setSelected(true); // Выбор галочки с мужским полом

        conteiner.add(male);
        conteiner.add(female);

        ButtonGroup group = new ButtonGroup(); // Создание обьекта для создания группы кнопок

        group.add(male); // Добавление кнопок
        group.add(female);

        conteiner.add(check);
        conteiner.add(send_button);

        send_button.addActionListener(new ButtonEventManager()); // Создание всплывающего окна
    }
    // Создание вложенного класса для работы всплывающего окна
    class ButtonEventManager implements ActionListener { // Наследуем класс ActionListener

        @Override
        public void actionPerformed(ActionEvent e) {
            String name = name_field.getText(); // Получение информации из полей конструктора
            String emale = emale_field.getText();
            String isMale = "Мужской";
            if (!male.isSelected()) {
                isMale = "Женский";
            }
            boolean checkBox = check.isSelected(); // Получение значений из обьекта check

            // Создание всплывающего окна
            JOptionPane.showMessageDialog(null, "Ваша почта: " + emale + "\nВаш пол: " + isMale + "\nВы согласны? " + checkBox, "Привет! " + name, JOptionPane.PLAIN_MESSAGE);
        }
    }
}