package com.springboot.awtprograms;

import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
/**
 * @author prabhakar, @Date 02-09-2024
 */

public class CalendarAWT extends Frame {
    private Label monthLabel;
    private Label yearLabel;
    private Button prevButton;
    private Button nextButton;
    private Panel calendarPanel;
    private int month;
    private int year;

    public CalendarAWT() {
        month = Calendar.getInstance().get(Calendar.MONTH);
        year = Calendar.getInstance().get(Calendar.YEAR);

        setLayout(new BorderLayout());

        Panel topPanel = new Panel();
        topPanel.setLayout(new FlowLayout());

        prevButton = new Button("<");
        nextButton = new Button(">");

        monthLabel = new Label();
        yearLabel = new Label();

        topPanel.add(prevButton);
        topPanel.add(monthLabel);
        topPanel.add(yearLabel);
        topPanel.add(nextButton);

        add(topPanel, BorderLayout.NORTH);

        calendarPanel = new Panel();
        calendarPanel.setLayout(new GridLayout(7, 7));
        add(calendarPanel, BorderLayout.CENTER);

        prevButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                month--;
                if (month < 0) {
                    month = 11;
                    year--;
                }
                updateCalendar();
            }
        });

        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                month++;
                if (month > 11) {
                    month = 0;
                    year++;
                }
                updateCalendar();
            }
        });

        updateCalendar();

        setTitle("AWT Calendar");
        setSize(400, 300);
        setVisible(true);
    }

    private void updateCalendar() {
        calendarPanel.removeAll();

        String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        for (String day : days) {
            calendarPanel.add(new Label(day));
        }

        Calendar cal = Calendar.getInstance();
        cal.set(year, month, 1);
        int startDay = cal.get(Calendar.DAY_OF_WEEK) - 1;
        int numberOfDays = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

        for (int i = 0; i < startDay; i++) {
            calendarPanel.add(new Label(" "));
        }

        for (int i = 1; i <= numberOfDays; i++) {
            calendarPanel.add(new Label(String.valueOf(i)));
        }

        monthLabel.setText(cal.getDisplayName(Calendar.MONTH, Calendar.LONG, getLocale()));
        yearLabel.setText(String.valueOf(year));

        calendarPanel.revalidate();
        calendarPanel.repaint();
    }

    public static void main(String[] args) {
        new CalendarAWT();
    }
}

