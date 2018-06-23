package btree;

public class Main {
    public static void main(String[] args) {
        BTree bTree1 = new BTree("1");
        BTree bTree2 = new BTree("2");
        BTree bTree3 = new BTree("3");

        bTree1.setRight(bTree2);
        System.out.println(bTree1.isCyclic());

        bTree1.setRight(bTree1);
        System.out.println(bTree1.isCyclic());

        bTree1.setLeft(bTree2);
        bTree1.setRight(bTree3);
        System.out.println(bTree1.isCyclic());
    }
}
