/*
 * 
��2�⣺��������ֱ��ǣ�Բ����Cylinder
���ݳ�Ա�����ײ��뾶 r�͸� h���Լ�������CylinderObject��
���ݳ�Ա�����ײ��뾶 r���� h����ɫcoloer������weight����
��ȷ�����������֮��Ĺ�ϵ�������������Ҫ�ķ�����
��д��������main���в������еĸ���������
Ҫ��ÿ�������ٰ����������캯����
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



