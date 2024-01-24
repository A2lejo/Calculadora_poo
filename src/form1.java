import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

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
        senButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        cosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        tanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        Absoluto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        xʸButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

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
                char[] operador = calcular.getText().toCharArray();
                if (operador.length>0 && operador[operador.length - 1]!='+') {

                    if(guardarOperaciones.getText().equals("")){
                        calcular.setText(calcular.getText() + "+");
                    } else {
                        calcular.setText(guardarOperaciones.getText() + "+");
                    }

                    String[] numeros = calcular.getText().split("[\\+\\-\\*/]");
                    //String[] operadores = calcular.getText().split("[0-9]+");

                    double resultado = Double.parseDouble(guardarOperaciones.getText());
                    for (String numeroStr : numeros) {
                        if (!numeroStr.isEmpty()) {
                            resultado += Double.parseDouble(numeroStr);
                        }
                    }
                    guardarOperaciones.setText(String.valueOf(resultado));

                } else {
                    guardarOperaciones.setText(calcular.getText());
                }
            }

        });
        resta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char[] operador = calcular.getText().toCharArray();
                if (operador.length>0 && operador[operador.length - 1]!='-') {

                    if(!guardarOperaciones.getText().isEmpty()){
                        calcular.setText(guardarOperaciones.getText() + "-");
                    }else{
                        calcular.setText(calcular.getText() + "-");
                    }
                    String[] numeros = calcular.getText().split("[\\+\\-\\*/]");
                    String[] operadores = calcular.getText().split("[0-9]+");
                    double resultado = Double.parseDouble(guardarOperaciones.getText());
                    for (String numeroStr : numeros) {
                        if (!numeroStr.isEmpty()) {
                            resultado -= Double.parseDouble(numeroStr);
                        }
                    }
                    guardarOperaciones.setText(String.valueOf(resultado));

                } else {
                    guardarOperaciones.setText(calcular.getText());
                }
            }
        });
        multiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

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

            }
        });
        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

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
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular.setText(calcular.getText() + "8");
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular.setText(calcular.getText() + "9");
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular.setText(calcular.getText() + "0");
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular.setText(calcular.getText() + "1");
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular.setText(calcular.getText() + "2");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular.setText(calcular.getText() + "6");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular.setText(calcular.getText() + "4");
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular.setText(calcular.getText() + "5");
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular.setText(calcular.getText() + "3");
            }
        });
        point.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular.setText(calcular.getText() + ".");
            }
        });
        igual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
