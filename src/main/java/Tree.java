/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ahmetkaska
 */
public class Tree {

    Node root;

    public Tree() {
        root = null;
    }

    Node newNode(int no, String ad, int not) {
        root = new Node(no, ad, not);
        return root;
    }

    Node insert(Node root, int no, String ad, int not) {
        if (root != null) {
            if (no < root.no) {
                root.left = insert(root.left, no, ad, not);
            } else {
                root.right = insert(root.right, no, ad, not);
            }

        } else {
            root = newNode(no, ad, not);
        }
        return root;

    }

    void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.no + "\t" + root.ad + "\t" + root.not);
            inOrder(root.right);
        }
    }

    Node delete(Node root, int x) {
        Node t1, t2;
        if (root == null) {
            return null;
        }
        if (root.no == x) {
            if (root.left == root.right) {
                root = null;
                return root;
            } else if (root.left == null) {
                t1 = root.right;
                return t1;
            } else if (root.right == null) {
                t1 = root.left;
                return t1;
            } else {
                t1 = t2 = root.right;
                while(t1.left != null)
                    t1 = t1.left;
                t1.left = root.left;
                
                return t2;
            }
        }
        else{
            if (x < root.no)
                root.left= delete(root.left,x);
            else
                root.right= delete(root.right,x);
        }
        return root;
    }

}
