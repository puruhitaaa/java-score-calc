import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;

public class CalcScore extends JFrame implements ActionListener {
  private String[] labels = { "Nama", "NIM", "Tubes", "Quiz", "Tugas", "UTS", "UAS" };
  private JTextField[] textFields = new JTextField[labels.length];
  private JLabel lblHasil;

  public CalcScore() {
    setTitle("Hitung Skor Akhir");
    setSize(300, 300);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    setLayout(new BorderLayout());
    JPanel contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(10, 10, 10, 10)); // Menambahkan padding
    contentPane.setLayout(new GridLayout(labels.length + 1, 2));

    for (int i = 0; i < labels.length; i++) {
      JLabel label = new JLabel(labels[i]);
      textFields[i] = new JTextField();
      contentPane.add(label);
      contentPane.add(textFields[i]);
    }

    lblHasil = new JLabel("");
    JButton btnHitung = new JButton("Hitung");
    btnHitung.addActionListener(this);

    contentPane.add(btnHitung);
    contentPane.add(lblHasil);

    add(contentPane, BorderLayout.CENTER);

    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getActionCommand().equals("Hitung")) {
      String nama = textFields[0].getText();
      String nim = textFields[1].getText();

      double[] nilai = new double[labels.length - 2];
      for (int i = 2; i < labels.length; i++) {
        nilai[i - 2] = Double.parseDouble(textFields[i].getText());
      }

      double nilaiAkhir = 0.0;
      double[] persentase = { 0.3, 0.1, 0.1, 0.25, 0.25 };

      for (int i = 0; i < nilai.length; i++) {
        nilaiAkhir += nilai[i] * persentase[i];
      }

      lblHasil.setText("Nama: " + nama + ", NIM: " + nim + ", Nilai Akhir: " + nilaiAkhir);
    }
  }

  public static void main(String[] args) {
    new CalcScore();
  }
}
