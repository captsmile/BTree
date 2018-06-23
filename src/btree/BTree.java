package btree;


import java.util.HashSet;
import java.util.Set;

public class BTree {
    String value;
    BTree left;
    BTree right;

    boolean visited = false;
    Set cyclicMarker = new HashSet();

    public BTree(String s) {
        this.value = s;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public BTree getLeft() {
        return left;
    }

    public void setLeft(BTree left) {
        this.left = left;
    }

    public BTree getRight() {
        return right;
    }

    public void setRight(BTree right) {
        this.right = right;
    }

    boolean isCyclic()
    {

        if (!cyclicMarker.add(this)){
            cyclicMarker.clear();
            return true;
        }

        if (left != null && left.isCyclic()) {
            cyclicMarker.clear();
            return true;
        }

        if (right != null && right.isCyclic()) {
            cyclicMarker.clear();
            return true;
        }

        cyclicMarker.clear();
        return false;
    }
    }
