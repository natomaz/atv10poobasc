package br.classes;

import javax.swing.JOptionPane;

public class bascara {
private int a;
private int b;
private int c;
public double x1;
public double x2;
public double d;

public void setA(int a){
    this.a = a;
}
public void setB(int b){
    this.b = b;
}
public void setC(int c){
    this.c = c;
}
public void calcularDelta(){ 
    d =  (b * b) + ((-4) * (a * c)); JOptionPane.showMessageDialog(null, "Delta: "+d);
}

public void calcularX(){
    x1 = ((-(b) + Math.sqrt(d)) / 2 * a);
    x2 = ((-(b) - Math.sqrt(d)) / 2 * a);
    JOptionPane.showMessageDialog(null, "x1: "+x1
                                  +"\nx2: "+x2);
}

}
