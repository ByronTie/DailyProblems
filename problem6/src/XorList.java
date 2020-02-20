public class XorList {

    XorNode firstNode = null;
    XorNode currentNode = null;

    XorList add(Object element) {
        XorNode node = new XorNode(element);

        if (currentNode != null) {
            node.both = currentNode.both; //update last node to have previous obj ref
            currentNode.both = currentNode.both ^ node.hashCode(); //update previous node to have this and previous node obj ref
        }

        currentNode = node;

        if (firstNode == null) {
            firstNode = node;
        }

        return this;
    }

    //get at index, traverse
    Object get(int index) {

        int firstHash = this.firstNode.hashCode();
        int previousHash = 0;
        int nextHash = 0;

        for(int i = 0; i <= index; i++) {

            if(i == index) {
                return currentNode.value;
            }

            nextHash = previousHash ^ currentNode.both;


            //break if no more
        }


        return null;
    }
}
