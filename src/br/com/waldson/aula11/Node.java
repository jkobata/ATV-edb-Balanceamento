package br.com.waldson.aula11;

public class Node {
    private Node left;
    private Node right;
    private int value;

    public Node(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public int getValue() {
        return value;
    }

    public void insert(Node node) {
        if (node.value < this.value) {
            if (this.left == null) {
                this.left = node;
            } else {
                this.left.insert(node);
            }
        } else if (node.value > this.value) {
            if (this.right == null) {
                this.right = node;
            } else {
                this.right.insert(node);
            }
        }
    }

    public Node search(int key) {
        if (key == this.value) {
            return this;
        }

        if (key < this.value) {
            if (this.left != null) {
                return this.left.search(key);
            }
        }

        if (key > this.value) {
            if (this.right != null) {
                return this.right.search(key);
            }
        }

        return null;
    }
    private int getAltura(int altura){
        if(this.right != null && this.left != null) {
            if (this.right.getAltura(altura + 1) > this.left.getAltura(altura + 1)) {
                return this.right.getAltura(altura + 1);
            }else {
                return this.left.getAltura(altura + 1);
            }
        }
        if(this.right == null && this.left != null){
            return this.left.getAltura(altura + 1);
        }
        if(this.left == null && this.right != null){
            return this.right.getAltura(altura + 1);
        }
        return altura;
    }
    public int getAltura(){
        return getAltura(0);
    }
    public boolean getBalanceada(){
        if(this.right != null && this.left != null) {
            if (Math.abs(this.right.getAltura() - this.left.getAltura()) > 1) {
                return false;
            }
            return true;
        }
        if(this.right == null && this.left != null) {
            if (Math.abs( (-1) - this.left.getAltura()) > 1) {
                return false;
            }
            return true;

        }
        if(this.left == null && this.right != null){
            if (Math.abs(this.right.getAltura() + 1) > 1) {
                return false;
            }
            return true;
        }

        return true;


    }
}
