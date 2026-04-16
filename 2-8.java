
public class Pos {
  double x = 0;
  double y = 0;

  Pos(){};
  Pos(double m_x,double m_y){
    x = m_x;
    y = m_y;
  }
}

public class Trace {
  int distance;
  Pos[] pos;
  String[] time;

  Trace(){};
  Trace(Pos[] m_pos, String[] time){

  }
  

  public void print() {
    for (Pos p : pos) {
      for (String t : time) {
        System.out.println("X:",p.x,", Y:",p.y,", time:",t);
      }
    }
}
