package square;


class sq{
    int side;

    public int area(int side){
       int result;

       result = side*side;
        return result;
    }

    public int parameter(int side){
        int parameter = 4*side;

        return parameter;
    }

}

public class square {
    public static void main(String[] args) {

        sq square1= new sq();
        sq square2= new sq();

        square1.side = 10;
        square2.side = 12;

        int ar = square1.area(square1.side);
        int parameter = square1.parameter(square1.side);

        int ar2 = square1.area(square2.side);
        int parameter2 = square1.parameter(square2.side);

        System.out.println("area of square1 is "+ar);
        System.out.println("parameter of square1 is "+parameter);
        System.out.println("area of square2 is "+ar2);
        System.out.println("parameter of square2 is "+parameter2);
    }
}
