package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        TextReport report = new TextReport();
        HtmlReport report1 = new HtmlReport();
        String text = report1.generate("Report's name", "Report's body");
        System.out.println(text);
    }
}
