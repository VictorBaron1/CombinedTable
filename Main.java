public class Main
{
    public static void main(String[]args)
    {
        SingleTable t1 = SingleTable(4, 60, 74);
        SingleTable t2 = SingleTable(8, 70, 74);
        SingleTable t3 = SingleTable(12, 75, 76);
        CombinedTable c1 = new CombinedTable(t1, t2)
        System.out.println(c1.canSeat(9));
        System.out.println(c1.canSeat(11));
    }
}