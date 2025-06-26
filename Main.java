import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

class ColoredGradeReportGUI extends JFrame {

    private JComboBox<String> courseBox, semesterBox;
    private JButton generateBtn, exportPdfBtn, exportCsvBtn, closeBtn;
    private JTable gradeTable;

    public ColoredGradeReportGUI() {
        // بنیادی فریم سیٹنگز
        setTitle("Instructor - Generate Student Grades Report");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // رنگوں کی تعریف (آپ اپنی مرضی کے مطابق بدل سکتے ہیں)
        Color backgroundColor = new Color(30, 40, 70);         // گہرا نیلا
        Color panelColor      = new Color(45, 60, 100);        // معمولی نیلا
        Color buttonColor     = new Color(100, 150, 240);      // ہلکا نیلا
        Color buttonTextColor = Color.WHITE;                   // سفید ٹیکسٹ برائے بٹن
        Color headerColor     = new Color(20, 25, 50);         // ٹیبل ہیڈر کے لیے بہت گہرا نیلا
        Color headerTextColor = Color.WHITE;                   // ہیڈر میں سفید ٹیکسٹ
        Color rowAltColor     = new Color(235, 235, 255);      // ٹیبل کی متبادل قطار کے لیے ہلکا نیلا

        // فریم کا بیک گراؤنڈ
        getContentPane().setBackground(backgroundColor);

        // ----- Top Panel (کنٹرولز) -----
        JPanel topPanel = new JPanel(new GridLayout(2, 3, 10, 10));
        topPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        topPanel.setBackground(panelColor);

        // لیبلز اور ڈراپ ڈاؤنز
        JLabel courseLabel = new JLabel("Select Course:");
        courseLabel.setForeground(Color.WHITE);
        topPanel.add(courseLabel);

        courseBox = new JComboBox<>(new String[]{"BSc CS 101", "BSc Math 202", "Intro to Java"});
        courseBox.setBackground(Color.WHITE);
        courseBox.setForeground(Color.BLACK);
        topPanel.add(courseBox);

        JLabel semesterLabel = new JLabel("Select Semester:");
        semesterLabel.setForeground(Color.WHITE);
        topPanel.add(semesterLabel);

        semesterBox = new JComboBox<>(new String[]{"Spring 2025", "Fall 2025"});
        semesterBox.setBackground(Color.WHITE);
        semesterBox.setForeground(Color.BLACK);
        topPanel.add(semesterBox);

        // Generate Report بٹن
        generateBtn = new JButton("Generate Report");
        generateBtn.setBackground(buttonColor);
        generateBtn.setForeground(buttonTextColor);
        generateBtn.setFocusPainted(false);
        topPanel.add(generateBtn);

        // Close بٹن
        closeBtn = new JButton("Close");
        closeBtn.setBackground(buttonColor);
        closeBtn.setForeground(buttonTextColor);
        closeBtn.setFocusPainted(false);
        topPanel.add(closeBtn);

        add(topPanel, BorderLayout.NORTH);

        // ----- Table (ڈسپلے ایریا) -----
        gradeTable = new JTable();
        JScrollPane scrollPane = new JScrollPane(gradeTable);
        scrollPane.getViewport().setBackground(Color.WHITE); // اگر خالی جگہ ہے تو یہ سفید رہے

        // ٹیبل ہیڈر کا کلر سیٹ کرنا
        gradeTable.getTableHeader().setBackground(headerColor);
        gradeTable.getTableHeader().setForeground(headerTextColor);
        gradeTable.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 14));

        // ٹیبل کی متبادل قطاروں کے لیے Renderer
        gradeTable.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(
                    JTable table, Object value, boolean isSelected,
                    boolean hasFocus, int row, int col) {

                Component c = super.getTableCellRendererComponent(
                        table, value, isSelected, hasFocus, row, col);

                if (!isSelected) {
                    if (row % 2 == 0) {
                        c.setBackground(Color.WHITE);
                    } else {
                        c.setBackground(rowAltColor);
                    }
                    c.setForeground(Color.BLACK);
                }
                return c;
            }
        });

        add(scrollPane, BorderLayout.CENTER);

        // ----- Bottom Panel
        JPanel bottomPanel = new JPanel();
        bottomPanel.setBackground(panelColor);

        exportPdfBtn = new JButton("Export as PDF");
        exportPdfBtn.setBackground(buttonColor);
        exportPdfBtn.setForeground(buttonTextColor);
        exportPdfBtn.setFocusPainted(false);
        bottomPanel.add(exportPdfBtn);

        exportCsvBtn = new JButton("Export as CSV");
        exportCsvBtn.setBackground(buttonColor);
        exportCsvBtn.setForeground(buttonTextColor);
        exportCsvBtn.setFocusPainted(false);
        bottomPanel.add(exportCsvBtn);

        add(bottomPanel, BorderLayout.SOUTH);

        // ----- Action Listeners -----
        generateBtn.addActionListener(e -> generateReport());
        closeBtn.addActionListener(e -> dispose());

        setVisible(true);
    }

    private void generateReport() {

        String[] columns = {"Student ID", "Student Name", "Grade"};
        Object[][] data = {
                {"1001", "Ali Khan", "A"},
                {"1002", "Sara Iqbal", "B+"},
                {"1003", "Zain Ahmed", "A-"},
                {"1004", "Nida Malik", "B"},
                {"1005", "Hamza Raza", "C+"}
        };

        DefaultTableModel model = new DefaultTableModel(data, columns);
        gradeTable.setModel(model);

        gradeTable.getTableHeader().setBackground(new Color(20, 25, 50));
        gradeTable.getTableHeader().setForeground(Color.WHITE);
        gradeTable.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 14));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ColoredGradeReportGUI::new);
    }
}
