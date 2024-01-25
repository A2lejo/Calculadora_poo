import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import sun.java2d.ScreenUpdateManager;

public class form1 {
    private JButton senButton;
    private JButton cosButton;
    private JButton tanButton;
    private JButton Absoluto;
    private JButton xʸButton;
    private JButton logButton;
    private JButton suma;
    private JButton resta;
    private JButton multiplicacion;
    private JButton raiz;
    private JButton cuadrado;
    private JButton division;
    private JButton negativo;
    private JButton DELButton;
    private JButton ACButton;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a6Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a3Button;
    private JButton a0Button;
    private JButton point;
    private JButton igual;
    private JLabel guardarOperaciones;
    private JLabel calcular;
    JPanel calculadora;

    public form1() {
        ScriptEngineManager sem = new ScriptEngineManager();
        ScriptEngine se = sem.getEngineByName("JavaScript");
        senButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x= Double.parseDouble(calcular.getText());
                calcular.setText("sen(" + calcular.getText() + ")");
                guardarOperaciones.setText(Math.sin(Math.toRadians(x)) + "");
            }
        });
        cosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = Double.parseDouble(calcular.getText());
                calcular.setText("cos(" + calcular.getText() + ")");
                guardarOperaciones.setText(Math.cos(Math.toRadians(x)) + "");
            }
        });
        tanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x=Double.parseDouble(calcular.getText());
                calcular.setText("tan("+ calcular.getText()+")");
                guardarOperaciones.setText(String.valueOf(Math.tan(Math.toRadians(x))));
            }
        });
        Absoluto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = Double.parseDouble(calcular.getText());
                calcular.setText("|"+calcular.getText()+"|");
                if (x<0){
                    x=x*-1;
                }
                guardarOperaciones.setText(String.valueOf(x));
            }
        });
        xʸButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular.setText(calcular.getText()+"**");
            }
        });
        logButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular.setText(calcular.getText() + "+");
            }
        });
        resta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular.setText(calcular.getText() + "-");
            }
        });
        multiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular.setText(calcular.getText() + "*");
            }
        });
        raiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        cuadrado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular.setText(calcular.getText() + "^");
            }
        });
        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular.setText(calcular.getText() + "/");
            }
        });
        negativo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        DELButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular.setText(calcular.getText().substring(0, calcular.getText().length() - 1));
                igual.doClick();
            }
        });
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular.setText("");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular.setText(calcular.getText() + "7");
                igual.doClick();
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular.setText(calcular.getText() + "8");
                igual.doClick();
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular.setText(calcular.getText() + "9");
                igual.doClick();
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular.setText(calcular.getText() + "0");
                igual.doClick();
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular.setText(calcular.getText() + "1");
                igual.doClick();
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular.setText(calcular.getText() + "2");
                igual.doClick();
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular.setText(calcular.getText() + "6");
                igual.doClick();
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular.setText(calcular.getText() + "4");
                igual.doClick();
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular.setText(calcular.getText() + "5");
                igual.doClick();
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular.setText(calcular.getText() + "3");
                igual.doClick();
            }
        });
        point.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (calcular.getText().contains(".")) {
                    return;
                } else {
                    calcular.setText(calcular.getText() + ".");
                }
            }
        });
        igual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String resultado = se.eval(calcular.getText()).toString();
                    guardarOperaciones.setText(resultado);
                } catch (Exception exception) {
                    System.out.println(exception);
                }
            }
        });
    }
}
