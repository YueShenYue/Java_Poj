/*
 * 
第2题：有两个类分别是：圆柱体Cylinder
数据成员包含底部半径 r和高 h）以及物体类CylinderObject（
数据成员包含底部半径 r、高 h、颜色coloer和重量weight）。
正确理解上述二者之间的关系。设计类中所需要的方法。
并写出主函数main进行测试类中的各个方法。
要求：每个类至少包含两个构造函数。
*/


class  CylinderObjectTest6220{
  public static void main(String args[])
  {
    CylinderObject a = new CylinderObject();
    
    CylinderObject b = new CylinderObject(2,4,"red",23.5);
    System.out.println(b.getS());
    System.out.println(b.getV());
    System.out.println(b.tostring());
  }
}


class Cylinder6220{
  int r;
  int h;
  Cylinder6220(){}
  Cylinder6220(int _r,int _h)
  {
    this.r = _r;
    this.h = _h;
  }
  
  double getS()
  {
    return 3.1415926 * r * r;
  }
 
  double getV()
  {
    return getS() * this.h;
  }
}

class CylinderObject extends Cylinder6220{
  String color;
  double weight;
  CylinderObject(){super();}
  CylinderObject(int _r,int _h,String _color,double _weight)
  {
    this.r = _r;
    this.h = _h;
    this.color = _color;
    this.weight = _weight;
  }
  
  String tostring(){
    return "this is CylinderObject  " + this.getV() + "   " + this.color + "    " + this.weight;
  }
}



