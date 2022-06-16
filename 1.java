class FruitsTest6220{
  public static void main(String args[]){
    Fruits6220 a = new Fruits6220();
    
    a.setName("Wahaha");
    a.setColor("blue");
    a.setWeight(10.1);
    a.setHome("BJ");
    a.setYear(2022);
    a.setMonth(1);
    a.setDay(3);
    
    System.out.println(a.getName());
    System.out.println(a.getColor());
    System.out.println(a.getWeight());
    System.out.println(a.getHome());
    System.out.println(a.getYear());
    System.out.println(a.getMonth());
    System.out.println(a.getDay());
  
  }
}


class Fruits6220{
  String name;
  String color;
  double weight;
  String home;
  int yy;
  int mm;
  int dd;
  
  Fruits6220(){}
  Fruits6220(String _name,  String _color,double _weight,String _home,int _yy,int _mm,int _dd)
  {
    this.name = _name;
    this.color = _color;
    this.weight = _weight;
    this.home = _home;
    this.yy = _yy;
    this.mm = _mm;
    this.dd = _dd;
  }
  
  String getName(){return this.name;}
  String getColor(){return this.color;}
  double getWeight(){return this.weight;}
  String getHome(){return this.home;}
  int getYear(){return this.yy;}
  int getMonth(){return this.mm;}
  int getDay(){return this.dd;}
  
  void setName(String _name){ this.name = _name; }
  void setColor(String _color){ this.color = _color; }
  void setWeight(double _weight){  this.weight = _weight; }
  void setHome(String _home){ this.home = _home; }
  void setYear(int _yy){ this.yy = _yy; }
  void setMonth(int _mm){ this.mm = _mm; }
  void setDay(int _dd){ this.dd = _dd; }
}

