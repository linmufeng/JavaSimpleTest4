class Yuanzhui 
{
    public static void main(String[] args) 
    {
        Circle circle = new Circle(10);                                         //����1
        System.out.println("main������circle������" + circle);
        System.out.println("main������circle�İ뾶" + circle.getRadius());

        Circular circular = new Circular(circle, 20);                           //����2
        System.out.println("circularԲ׶��bottom������" + circular.bottom);
        System.out.println("circularԲ׶��bottom�İ뾶" + circular.getBottomRadius());
        System.out.println("circularԲ׶�����" + circular.getVolme());

        double r = 8888;
        System.out.println("Բ׶���ĵ�Բbottom�İ뾶��" + r);

        circular.setBottomRadius(r);                                            //����3
        System.out.println("circularԲ׶��bottom�İ뾶" + circular.getBottomRadius());
        System.out.println("circularԲ׶�����" + circular.getVolme());
        System.out.println("main������circle�İ뾶" + circle.getRadius());
        System.out.println("main������circle�����÷����仯ǰ" + circle);

        circle = new Circle(1000);                                              //����4 ���´���circle
        System.out.println("����main������circle������" + circle);
        System.out.println("���ǲ�Ӱ��circularԲ׶��bottom������");
        System.out.println("circularԲ׶��bottom������" + circular.bottom);
        System.out.println("circularԲ׶��bottom�İ뾶" + circular.getBottomRadius());
    }
}