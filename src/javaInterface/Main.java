package javaInterface;

public class Main implements Imath,Iscience {
    @Override
    public void mathTeacher() {
        System.out.println("maths is fun if u understand well");
    }

    @Override
    public void scienceTeacher() {
        System.out.println("science teacher sucks");
    }

    public static void main(String[] args) {
        Main rv = new Main();
        rv.mathTeacher();
        rv.scienceTeacher();
    }
}
