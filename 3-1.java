

public class student {
  private String name;
  private int age;
  private int stuNumber;
  private String province;
  private String city;

  student(){};
  student(String m_name,int m_age,int m_stuNumber,String m_province,String m_city){
    name = m_name;
    age = m_age;
    stuNumber = m_stuNumber;
    province = m_province;
    city = m_city;
  }

  public void how_old() {
    System.out.println("my name is "+name+". I'm "+age+" years old");
  }

  public void what_is_your_number() {
    System.out.println("my name is "+name+". my student number is "+stuNumber);
  }
}
