import static javax.swing.JOptionPane.*;

public class Test {
    public static void main(String[] args) {
        double tall1 = Integer.parseInt(showInputDialog("tall1"));
        double tall2 = Integer.parseInt(showInputDialog("tall2"));

        String utTxt = "Heltalldivisjon" + tall1 % tall2 + "\n Divisjon" + tall1 / tall2;
        showMessageDialog(null, utTxt);
    }
}
