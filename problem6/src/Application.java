public class Application {

    public static void main(String[] args) {
        System.out.println("start");

        XorNode node1 = new XorNode(1);
        XorNode node2 = new XorNode(2);
        XorNode node3 = new XorNode(3);

        int node1ptr = node1.hashCode();
        int node2ptr = node2.hashCode();
        int xor = node1ptr ^ node2ptr;

        System.out.println("node1: " + node1ptr);
        System.out.println("node1 ^ 0: " + (node1ptr ^ 0));
        System.out.println("node2: " + node2ptr);
        System.out.println("xor: " + xor);

        System.out.println("node1 (node2 ^ xor): " + (node2ptr ^ xor));
        System.out.println("node2 (node1 ^ xor): " + (node1ptr ^ xor));


        XorList list = new XorList();

        list.add(node1);
        list.add(node2);
        list.add(node3);

        // assert list.get(0) == node1
        // assert list.get(1) == node2
        // assert list.get(2) == node3
        // assert list.get(3) == null

        //assert node1.both ^ 0 == node2
        //assert node3.both ^ 0 == node2

        //assert node2.both ^ node3 == node1
        //assert node2.both ^ node1 == node3

    }
}
