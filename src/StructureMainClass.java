public class StructureMainClass
{
    public static void main(String[] args)
    {
        Structure myStructure = new Structure();
        myStructure.pushFirst(3);
        myStructure.pushFirst(9);
        myStructure.pushLast(4);
        myStructure.pushLast(1);

        myStructure.showList();
        System.out.println("The length of the list is " + myStructure.lengthOfList());

        myStructure.popFirst();
        myStructure.showList();
        System.out.println("The length of the list is " + myStructure.lengthOfList());

        myStructure.popLast();
        myStructure.showList();
        System.out.println("The length of the list is " + myStructure.lengthOfList());

        myStructure.popFirst();
        myStructure.showList();
        System.out.println("The length of the list is " + myStructure.lengthOfList());

        myStructure.pushFirst(7);
        myStructure.pushLast(11);

        System.out.println(myStructure.peekFirst());
        System.out.println(myStructure.peekLast());










    }
}
