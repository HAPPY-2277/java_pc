

public class Pos {
  double x = 0;
  double y = 0;
  Pos(){}
  Pos(double m_x,double m_y){
    x = m_x;
    y = m_y;
  }
  public void equal(Pos m_pos) {
    x = m_pos.x;
    y = m_pos.y;
  }
}
public class Circle {
  public final double PI =3.1415926535;
  protected double radius = 0;
  protected Pos pos;

  circle(){};
  circle(double r, Pos m_pos){
    radius = r;
    pos.equal(m_pos);
  }

  public void draw() {
    
  }
  public void move(Pos new_pos) {
    pos.equal(new_pos);
  }
  public void resize(double r) {
    radius = r;
  }
}
