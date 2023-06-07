package dsa_java;

import java.util.Scanner;

public class BST {
  private class Node{
    private int key;
    private Node leftNode;
    private Node rightNode;
  
  private Node(int key){
    this.key = key;
    leftNode = null;
    rightNode = null;
  }
}
  private Node rootNode;

  public void add(int key){
    rootNode = insert(rootNode,key);
  }

  private Node insert(Node currentNode, int key) {
    if(currentNode == null){
      return new Node(key);
    }
    if(key < currentNode.key){
      currentNode.leftNode = insert(currentNode.leftNode,key);
    }
    else if(key > currentNode.key){
      currentNode.rightNode = insert(currentNode.rightNode, key);
    }
    return null;
  }

  public void printInorder(){
    inOrder(rootNode);
  }

  private void inOrder(Node currentNode){
    if(currentNode != null){
      inOrder(currentNode.leftNode);
      System.out.println(currentNode.key + " ");
      inOrder(currentNode.rightNode);
    }
  }

public static void main(String[] args) {
  BST bst = new BST();

  Scanner scanner = new Scanner(System.in);
  System.out.print("Enter the number of values to insert: ");
  int count = scanner.nextInt();

  System.out.println("Enter the values to insert:");
  for (int i = 0; i < count; i++) {
      int value = scanner.nextInt();
      bst.add(value);
  }
  System.out.println("Inorder traversal of the BST:");
  bst.printInorder();
  scanner.close();
}
}
