package javacourse;
public class AddTwoNum {
    int sum(int x, int y){
        int result = x+y;
        return result;
    }
    public static void main (String[] args) {
        int x = 5;
        int y = 5;
        AddTwoNum obj1 = new AddTwoNum();
        int result = obj1.sum(x,y);
        System.out.println("Sum is:" +result);

    }
}
