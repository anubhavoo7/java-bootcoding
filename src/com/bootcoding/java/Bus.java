public class Bus {
    double dimensions;
    String Brand;
    String color;
    String Type;

    public void print(){
        System.out.println("Dimension: "+dimensions+"m");
        System.out.println("Brand: "+Brand);
        System.out.println("color: "+color);
        System.out.println("Type: "+Type);
    }

    public static void main(String[] args) {
        Bus b1=new Bus();
        b1.dimensions= 15;
        b1.Brand="Volvo";
        b1.color="Red";
        b1.Type="intercity";
        b1.print();
    }
}
